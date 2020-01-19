// Программа-пример No1 из главы 8 «Руководства по С
// для новичков», 3-е издание
// Файл Chapter8ex1.c
/* Эта программа-пример запрашивает у пользователей
некоторые основные данные, после чего выводит их на
экран, чтобы показать, что было введено */
#include <stdio.h>

main()
{
    // Установка переменных, значения которым будут присвоены функцией scanf()
    char firstInitial;
    char lastInitial;
    int age;
    int favorite_number;
    printf("C какой буквы начинается Ваша фамилия?\n");
    scanf(" %c", &firstInitial);
    printf("C какой буквы начинается Ваше имя?\n");
    scanf(" %c", &lastInitial);
    printf("Сколько Вам лет?\n");
    scanf(" %d", &age);
    printf("Какое Ваше любимое число? (Только целое)\n");
    scanf(" %d", &favorite_number);
    printf("\n\nВаши инициалы: %c.%c., и вам %d лет", firstInitial, lastInitial, age);
    printf("\nВаше любимое число %d. \n\n", favorite_number);
    return 0;
}