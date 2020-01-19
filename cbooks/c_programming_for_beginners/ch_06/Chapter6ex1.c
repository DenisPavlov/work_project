// Программа-пример No1 из главы 6
// Руководства для начинающих по С, 3-е издание
// Файл Chapter6ex1.c
// Эта программа соотносит детей с их любимыми супергероями

#include <stdio.h>
#include <string.h>

main()
{
    char Kid1[12];
    // Kid1 может содержать имя из 11 символов
    // Kid2 будет содержать 7 символов (Maddie плюс нуль-символ)
    char Kid2[] = "Maddie";
    // Kid3 также содержит 7 символов, но это указано дополнительно
    char Kid3[7] = "Andrew";
    // Hero1 будет содержат 7 символов (учитывая нуль-символ!)
    char Hero1[] = "Batman";
    // Hero2 будет на всякий случай иметь дополнительное пространство
    char Hero2[34] = "Spiderman";
    char Hero3[25];

    Kid1[0] = 'K'; //Kid1 определяется посимвольно
    Kid1[1] = 'a'; //Неэффективно, но работает
    Kid1[2] = 't';
    Kid1[3] = 'i';
    Kid1[4] = 'e';
    Kid1[5] = '\0'; // Не забывайте нуль-символ, чтобы С знал, когда завершается строка

    //strcpy(Hero3, "The Incredible Hulk");
    printf("%s\'s favorite hero is %s.\n", Kid1, Hero1);
    printf("%s\'s favorite hero is %s.\n", Kid2, Hero2);
    printf("%s\'s favorite hero is %s.\n", Kid3, Hero3);
    printf()
    return 0;
}
