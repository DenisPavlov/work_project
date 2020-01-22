
#include <stdio.h>
#include <string.h>

main() {
    char msg[25];
    printf("Введите макс. 25 символов и нажмите Enter...\n");
    msg[0] = getchar(); //Вводит один символ
    putchar('\n'); //Перенос строки после завершения цикла
    putchar(msg[0]);
}
