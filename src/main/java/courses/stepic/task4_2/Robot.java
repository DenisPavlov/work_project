package courses.stepic.task4_2;

import java.util.logging.Logger;

public class Robot {

    public static void moveRobot(RobotConnectionManager robotConnectionManager, int toX, int toY) {

        Logger logger = Logger.getLogger(Robot.class);

        for (int i = 0; i < 3; i++) {
            try (RobotConnection connection = robotConnectionManager.getConnection()) {
                connection.moveRobotTo(toX, toY);
                return;
            } catch (RobotConnectionException e ) {
                if (i == 2) {
                    throw new RobotConnectionException("Three time calls");
                }
            }
        }
    }

}

/*
Ваша задача — реализовать метод который устанавливает соединение с роботом, отдает ему команду на перемещение в заданную
точку и затем закрывает соединение, выполняя при необходимости повтор этой последовательности до трех раз.

При этом:

1. Попытка отдать команду роботу считается успешной, если удалось установить соединение и выполнить метод
   RobotConnection.moveRobotTo() без исключений. Ошибка закрыти соединения не важна и должна игнорироваться.
2. Если первая попытка подключиться и отдать команду оказалась неуспешной, то закрываем соединение и выполняем вторую
   попытку. Если вторая тоже не удалась, то выполняется третья. После третьей неудачи метод должен бросить исключение
   RobotConnectionException.
3. Метод отвечает за открытие и закрытие соединения. Если соединение удалось установить, то оно обязательно должно быть
   закрыто несмотря на возможные исключения, случившиеся в дальнейшем во время работы метода.
4. Если во время работы метода случилось исключение любого типа, отличного от RobotConnectionException, метод должен
   завершиться и выбросить это исключение, не выполняя повторных попыток пообщаться с роботом. Единственное, что метод
   должен сделать перед выбросом этого исключения — закрыть открытое соединение RobotConnection.
 */