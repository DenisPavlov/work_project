// Программа-пример No2 из главы 28
// Руководства по С для новичков, 3-е издание
// Файл Chapter28ex2.c
/* Эта программа использует файл информации о книгах
из первой программы главы 28, считывает каждую строку
и выводит информацию на экран. */
#include <stdio.h>
#include <stdlib.h>

FILE *fptr;

main() {
    char fileLine[100]; // Будет хранить вводимые строки
    fptr = fopen("/home/denis/java/projects/work_project/cbooks/c_programming_for_beginners/ch_28/files/BookInfo.txt","r");
    if (fptr != 0) {
        while (!feof(fptr)) {
            fgets(fileLine, 100, fptr);
            if (!feof(fptr)) {
                puts(fileLine);
            }
        }
    } else {
        printf("\nОшибка при открытии файла.\n");
    }
    fclose(fptr); // Всегда закрывайте файлы
    return (0);
    }
