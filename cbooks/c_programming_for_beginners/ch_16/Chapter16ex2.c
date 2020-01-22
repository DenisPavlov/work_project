// Программа-пример No2 из главы 16
// Руководства по С для новичков, 3-е издание
// Файл Chapter16ex2.c
/* Данная программа выполняется циклически для
10 чисел и выводит на печать сообщение, зависящее
от того, является ли обрабатываемое число четным.
Программа проверяет, не является ли число
нечетным, и, если число нечетное, выводит на экран
соответствующее сообщение для нечетных чисел, после
чего начинает новую итерацию цикла с помощью выражения
continue. В противном случае, на экран выводится
сообщение для четных чисел. */
#include <stdio.h>
main() {
    int i;
    //Проход по числам от 1 до 10
    for (i = 1; i <=10; i++) {

    if ((i%2) == 1) {//Остаток от деления нечетных чисел = 1
        printf("От нечетных чисел одни неудобства...\n");
        // Перескочить к началу новой итерации цикла
        continue;
    }
    printf("То ли дело четные числа! \n");
    }
    return 0;
}