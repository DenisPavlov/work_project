//Программа-пример No1 из главы 7 Руководства
//по С для новичков, 3-е издание
//Файл Chapter7ex1.c
/* Это простая программа-пример, перечисляющая трех
детей, их потребности в школьных принадлежностях,
а также стоимость их приобретения */

#include <stdio.h>
#include <string.h>
#include "Chapter7ex1.h"

main()
{
    int age;
    char childname[14] = "Тимофей";
    printf("\n%s имеет %d детей", FAMILY, KIDS);
    age = 11;
    printf("Старший сын, %s, %d лет.\n", childname, age);
    strcpy(childname, "Николай");
    age = 6;
    printf("Средний сын, %s, %d.\n", childname, age);
    age = 3;
    strcpy(childname, "Борис");
    printf("Младший сын, %s, %d.\n", childname, age);
    return 0;
}