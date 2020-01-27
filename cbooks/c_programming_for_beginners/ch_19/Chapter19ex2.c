// Программа-пример No2 из главы 19
// Руководства по С для новичков, 3-е издание
// Файл Chapter19ex2.c
/* Эта программа запрашивает ввод название города
проживания и двухбуквенное сокращение соответствующее
штату. После этого в программе используется функция
для создания новой строки с названием города и штата,
а затем выводит эту строку на экран.*/
//файл stdio.h нужен для функций puts() и gets()
//файл string.h нужен для функции strcat()
#include <string.h>
#include <stdio.h>

main() {
    char city[15];
    //2 символа для аббревиатуры штата и 1 для нуль-символа
    char st[3];
    char fullLocation[18] = "";
    puts("В каком городе вы живете? ");
    gets(city);
    puts("В каком штате вы живете? (2-х букв. аббревиатура)");
    gets(st);
    /* Конкатенация строк */
    strcat(fullLocation, city);
    strcat(fullLocation, ", "); //Вставка запятой и пробела между городом
    strcat(fullLocation, st); //и аббревиатурой штата
    puts("\nВы живете в ");
    puts(fullLocation);
    return (0);
}