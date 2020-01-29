// Программа-пример No1 из главы 27
// Руководства по С для новичков, 3-е издание
// Файл Chapter27ex1.c
/* Подключив файл bookInfo.h, данная программа
получает структуру bookInfo, просит пользователя заполнить три
структуры, а затем распечатывает их.
*/
//В первую очередь, подключим файл с определением структуры
#include "bookinfo.h"
#include <stdio.h>

main() {
    int ctr;
    struct bookInfo books[3]; // Массив из трех структурных переменных

    // Получить информацию о каждой книге от пользователя
    for (ctr = 0; ctr < 3; ctr++) {
        printf("Введите название книги No%d?\n", (ctr + 1));
        gets(books[ctr].title);
        puts("Кто автор? ");
        gets(books[ctr].author);
        puts("Сколько стоила книга? ");
        scanf(" $%f", &books[ctr].price);
        puts("Сколько страниц в книге? ");
        scanf(" %d", &books[ctr].pages);
        getchar(); //Создает пустую строку для следующего прохода
    }

    //Вывести заголовок, а затем с помощью цикла распечатать информацию
    printf("\n\nМоя коллекция книг: \n");
    for (ctr = 0; ctr < 3; ctr++) {
        printf("No%d: %s автор %s", (ctr + 1), books[ctr].title, books[ctr].author);
        printf("\nСодержит %d страниц и строит $%.2f", books[ctr].pages, books[ctr].price);
        printf("\n\n");
    }
    return (0);
}
