Задача. Необходимо сохранить тип интервала в PostgresQl. Например работа приожения 
38:45 (38 часов 45 минут)

1. Для начала необходимо добавить зависимостьт PostgresQL jdbc драйвер в pom.xml
2. Работа с базой данных.
    - создать файл database.properties и заполнить его настройками своей базы
        ````    
        db.url=jdbc:postgresql://localhost:5432/applovin
        db.user=postgres
        db.password=pass
      
   - Создать таблицу базы с полем INTERVAL
        ````sql
        DROP TABLE IF EXISTS interval_table;
        
        CREATE TABLE interval_table
        (
          id          INTEGER    PRIMARY KEY,
          c_time      INTERVAL   NOT NULL
        );
   
3. Создать класс репозиторий для работы с базой данных 
    - Для сохрпнения интервала в базу данных postgres необходимо использовать 
    вспомагательный класс PGInterval
    ````java
       public class Repository {
           private String url;
           private String user;
           private String pswd;
           private Connection connection;
       
           public Repository() {
               try {   
                   Class.forName("org.postgresql.Driver");
                   InputStream inputStream = getClass().getClassLoader().getResourceAsStream("database.properties");
                   Properties properties = new Properties();
                   properties.load(inputStream);
                   inputStream.close();
       
                   url = properties.getProperty("db.url");
                   user = properties.getProperty("db.user");
                   pswd = properties.getProperty("db.password");
                   connection = DriverManager.getConnection(url, user, pswd);
               } catch (ClassNotFoundException | IOException | SQLException ignored) {
                   System.out.println(ignored);
               }
           }
       
           //метод сохранения листа моделей в базу данных
           public void saveAllApplications(List<Model> models) {
               try( PreparedStatement statement = connection.prepareStatement("INSERT INTO interval_table VALUES (?, ?) " +
                       "ON CONFLICT (id) DO UPDATE SET c_time = EXCLUDED.c_time"))
               {
                   for (Model model : models) {
                       statement.setInt(1, model.getId());
                    
                       //преобразование в PGInterval
                       PGInterval interval = new PGInterval();
                       int allMinutes = (int) model.getInterval().toMinutes();
                       int hour = allMinutes/60;
                       int minutes = allMinutes - hour * 60;
                       interval.setHours(hour);
                       interval.setMinutes(minutes);
                       statement.setObject(2, interval);
                       statement.addBatch();    
                   }   
                statement.executeBatch();
                      
               } catch (SQLException ignored) {
                       System.out.println(ignored);
                   }    
           }
        
           //метод закрытия ресурсов базы
           public void shutdown() {
               if (connection != null) {
                   try {
                       connection.close();
                   } catch (SQLException ignored) {
                       System.out.println(ignored);
                   }
               }    
        }
       }
    
4. Работа с моделью
    - Создать класс модели
    ````java
    import java.time.Duration;
    
    public class Model {
        private int id;
        private Duration interval;
    
        public Model(int id, Duration interval) {
            this.id = id;
            this.interval = interval;
        }
    
        public int getId() {
            return id;
        }
    
        public Duration getInterval() {
            return interval;
        }
    }   
    
5. Проверка приложения. Реализация класса Main
    - Создаем лист мооделей и сохраняем его в базу.
    ````java
    public class Main {
        public static void main(String[] args) {
            //создадим три модели и положим их в лист
            Model model1 = new Model(1, Duration.parse("PT48H15M")); //48 часов 15 минут
            Model model2 = new Model(2, Duration.parse("PT50H10M")); //50 часов 10 минут
            Model model3 = new Model(3, Duration.parse("PT48H15M")); //2 часа 15 минут
            Model model4 = new Model(4, Duration.parse("PT48H15M")); //100 часов 00 минут
            List<Model> modelList = Arrays.asList(model1, model2, model3, model4);
    
            //создаем подключение к базе
            Repository repository = new Repository();
    
            //сохраняем модели в базу
            repository.saveAllApplications(modelList);
    
            //закрываем ресурсы
            repository.shutdown();
        }
    }
 6. Все работает !!!
