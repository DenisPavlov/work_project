// Программа-пример No1 из главы 10
// Руководства по С для новичков, 3-е издание
// Файл Chapter10ex1.c
/* Эта программа увеличивает значение счетчика от 1 до
5, при этом, выводя на печать обновленные значения,
после чего выполняет обратный отсчет до 1 */
#include <stdio.h>
main()
{
    int ctr = 0;
    ctr = ctr + 1; //увеличивает счетчик до 1
    printf("Значение счетчика: %d. \n", ctr);
    ctr = ctr + 1; //увеличивает счетчик до 2
    printf("Значение счетчика: %d. \n", ctr);
    ctr = ctr + 1; //увеличивает счетчик до 3
    printf("Значение счетчика: %d. \n", ctr);
    ctr = ctr + 1; //увеличивает счетчик до 4
    printf("Значение счетчика: %d. \n", ctr);
    ctr = ctr + 1; //увеличивает счетчик до 5
    printf("Значение счетчика: %d. \n", ctr);
    ctr = ctr - 1; //уменьшает счетчик до 4
    printf("Значение счетчика: %d. \n", ctr);
    ctr = ctr - 1; //уменьшает счетчик до 3
    printf("Значение счетчика: %d. \n", ctr);
    ctr = ctr - 1; //уменьшает счетчик до 2
    printf("Значение счетчика: %d. \n", ctr);
    ctr = ctr - 1; //уменьшает счетчик до 1
    return 0;
}