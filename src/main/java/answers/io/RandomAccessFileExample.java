package answers.io;

import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileExample {
    public static void main(String[] args) {
        try {
            String filePath = "/home/denis/my_java/Подготовка к собеседованию/work_project/files/source.txt";
            System.out.println(new String(readCharsFromFile(filePath, 1, 5)));

            writeData(filePath, "Data", 5);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    // метод для записи данных в файл
    private static void writeData(String filePath, String data, int seek) throws IOException {
        // открываем файл с возможностью как чтения, так и записи
        RandomAccessFile file = new RandomAccessFile(filePath, "rw");
        // переходим на определенный индекс
        file.seek(seek);
        // запишем данные в этом месте
        file.write(data.getBytes());
        file.close();
    }

    // метод для чтения с файла
    private static byte[] readCharsFromFile(String filePath, int seek, int chars) throws IOException {
        // открываем файл только для чтения
        RandomAccessFile file = new RandomAccessFile(filePath, "r");
        file.seek(seek);
        byte[] bytes = new byte[chars];
        file.read(bytes);
        file.close();
        return bytes;
    }

}
