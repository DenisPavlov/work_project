// Программа-пример No2 из главы 18
// Руководства по С для новичков, 3-е издание
// Файл Chapter18ex2.c
/*Эта программа — лишь простая демонстрация функции
getchar() */
//функция getchar() определена в файле stdio.h, однако
// файл string.h нужен для работы функции strlen
#include <stdio.h>
#include <string.h>

main() {
    int i;
    char msg[25];
    printf("Введите макс. 25 символов и нажмите Enter...\n");
    for (i = 0; i < 25; i++) {
        msg[i] = getchar(); //Вводит один символ
        if (msg[i] == '\n') {
            i--;
            break;
        }
    }
    putchar('\n'); //Перенос строки после завершения цикла
    for (; i >= 0; i--) {
        putchar(msg[i]);
    }
    putchar('\n');
    return (0);
}