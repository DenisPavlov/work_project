#include <stdio.h>
#include <string.h>

main()
{
    printf("Hello \0 world"); //напечатает Hello

    //char month[10]; /* Объявление символьного массива */
    //month[10] = "January";

    char month[10] = "January"; /*Определение символьного массива*/

    strcpy(month, "March"); //переопределение строки

    printf(month);

}
