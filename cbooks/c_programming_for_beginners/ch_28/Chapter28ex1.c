// Программа-пример No1 из главы 28
// Руководства по С для новичков, 3-е издание
// Файл Chapter28ex1.c
/* В основе этой программы программа из Главы 27
(информация о книгах), но сведения о книгах печатаются
в файл bookinfo.txt. */
//В первую очередь подключить файл с определением структуры

#include "../ch_27/bookinfo.h"
#include <stdio.h>
#include <stdlib.h>

FILE * fptr;

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

    // При вводе пути к файлу не забудьте
    // продублировать обратную
    // косую черту, иначе компилятор воспримет ее как
    // начало символа преобразования
    fptr = fopen("/home/denis/java/projects/work_project/cbooks/c_programming_for_beginners/ch_28/files/BookInfo.txt","w");

    // Проверить, открылся ли файл
    if (fptr == 0) {
        printf("Ошибка--Невозможно открыть файл.\n");
        exit(1);
    }

    // Напечатать файл заголовок, а затем пройти
    // циклом по массиву и распечатать информацию
    // о книгах, но не на экране, а в файл
    fprintf(fptr, "\nМоя коллекция книг: \n");
    for (ctr = 0; ctr < 3; ctr++) {
        fprintf(fptr, "No%d: %s автор %s", (ctr + 1), books[ctr].title, books[ctr].author);
        fprintf(fptr, "\nСодержит %d страниц и стоит $ % .2f", books[ctr].pages, books[ctr].price);
        fprintf(fptr, "\n\n");
    }
    fclose(fptr); // Всегда закрывайте файлы
    return (0);
}
