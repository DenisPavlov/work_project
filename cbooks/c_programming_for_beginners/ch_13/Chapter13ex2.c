// Программа-пример No2 из главы 13
// Руководства по С для новичков, 3-е издание
// Файл Chapter13ex2.c
/* Эта программа увеличивает значение счетчика от
1 до 5, при этом, выводя на печать обновленные
значения, после чего выполняет обратный отсчет до 1.
Однако в этой версии программы используются операторы
инкремента и декремента */
#include <stdio.h>
main() {
    int ctr = 0;
    printf("Значение счетчика: %d. \n", ++ctr);
    printf("Значение счетчика: %d. \n", ++ctr);
    printf("Значение счетчика: %d. \n", ++ctr);
    printf("Значение счетчика: %d. \n", ++ctr);
    printf("Значение счетчика: %d. \n", ++ctr);
    printf("Значение счетчика: %d. \n", --ctr);
    printf("Значение счетчика: %d. \n", --ctr);
    printf("Значение счетчика: %d. \n", --ctr);
    printf("Значение счетчика: %d. \n", --ctr);
return 0;
}