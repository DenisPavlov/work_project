package notes.db.jdbc;

import org.postgresql.util.PGInterval;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.temporal.TemporalUnit;
import java.util.List;
import java.util.Properties;

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
