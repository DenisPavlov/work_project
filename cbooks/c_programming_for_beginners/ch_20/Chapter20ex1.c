// Программа-пример No1 из главы 20
// Руководства по С для новичков, 3-е издание
// Файл Chapter20ex1.c
/* Эта программа демонстрирует математические функции
из библиотеки файла math.h, таким образом вы можете
сделать домашнюю работу без единой ошибки благодаря
быстрым и легким программам */
#include <stdio.h>
#include <string.h>
#include <math.h>

main() {
    printf("Пора сделать домашнюю работу!\n");
    printf("\nРаздел 1: Квадратные корни\n");
    printf("Квадратный корень из 49: %.1f\n", sqrt(49.0));
    printf("Квадратный корень из 149: %.1f\n", sqrt(149.0));
    printf("Квадратный корень из .49: %.1f\n", sqrt(.49));
    printf("\nРаздел 2: Степени\n");
    printf("4 в 3-ей степени: %.1f\n", pow(4.0, 3.0));
    printf("7 в 5-ой степени: %.1f\n", pow(7.0, 5.0));
    printf("34 в степени 1/2: %.1f\n", pow(34.0, .5));
    printf("\nРаздел 3: Тригонометрия\n");
    printf("Косинус угла 60 градусов: %.3f\n", cos((60 * (3.14159 / 180))));
    printf("Синус угла 90 градусов: %.3f\n",
           sin((90 * (3.14159 / 180))));
    printf("Тангенс угла 75 градусов: %.3f\n",
           tan((75 * (3.14159 / 180))));
    printf("Арккосинус угла 45 градусов: %.3f\n",
           acos((45 * (3.14159 / 180))));
    printf("Арксинус угла 30 градусов: %.3f\n",
           asin((30 * (3.14159 / 180))));
    printf("Арктангенс угла 15 градусов: is %.3f\n",
           atan((15 * (3.14159 / 180))));
    printf("\nРаздел 4: Логарифмические функции\n");
    printf("e в степени 2: %.3f\n", exp(2));
    printf("Натуральный логарифм 5: %.3f\n", log(5));
    printf("Десятичный логарифм 5: %.3f\n", log10(5));
    return 0;
}