// Программа-пример NoA из главы 27
// Руководства по С для новичков, 3-е издание
// Файл bookinfo.h
// В этом заголовочном файле объявляется структура для записи
// информации о книге
struct bookInfo {
    char title[40];
    char author[25];
    float price;
    int pages;
};