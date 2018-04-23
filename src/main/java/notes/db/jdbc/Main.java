package notes.db.jdbc;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //создадим три модели и положим их в лист
        Model model1 = new Model(1, Duration.parse("PT48H15M")); //48 часов 15 минут
        Model model2 = new Model(2, Duration.parse("PT50H10M")); //50 часов 10 минут
        Model model3 = new Model(3, Duration.parse("PT2H15M")); //2 часа 15 минут
        Model model4 = new Model(4, Duration.parse("PT100H00M")); //100 часов 00 минут
        List<Model> modelList = Arrays.asList(model1, model2, model3, model4);

        //создаем подключение к базе
        Repository repository = new Repository();

        //сохраняем модели в базу
        repository.saveAllApplications(modelList);

        //закрываем ресурсы
        repository.shutdown();
    }
}
