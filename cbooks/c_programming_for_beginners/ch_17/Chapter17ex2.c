// Программа-пример No1 из главы 17
// Руководства по С для новичков, 3-е издание
// Файл Chapter17ex2.c
/* Данная программа предоставляет меню опций (три
десятилетия), принимает выбор пользователя, а затем
выводит на экран меню второго уровня (спорт,
развлечения, политика).
Когда пользователь осуществляет второй выбор,
программа выводит на экран основной информационный
список, соответствующий этому десятилетию */
#include <stdio.h>
#include <stdlib.h> //Запомните, что если планируете
                    // воспользоваться функцией exit(),
                    //вам нужен этот заголовочный файл
main() {
    //Despite being a long program, you only need two variables:
    //one for the first menu and one for the second
    int choice1;
    int choice2;
    //Варианты десятилетий на выбор
    printf("Что бы вы хотели увидеть?\n");
    printf("1. 1980-е\n");
    printf("2. 1990-е\n");
    printf("3. 2000-е\n");
    printf("4. Выход\n");
    //Выбор пунктов верхнего меню и выражение switch,
    //выводящее информацию на экран
    //а также цикл do-while, гарантирующий, что
    //осуществлен выбор одного из 4 пунктов меню
    do {
        printf("Введите свой выбор: ");
        scanf(" %d", &choice1);
        switch (choice1) {
            //В первом случае пользователь выбрал 1980-е.
            //Теперь узнаем, что конкретно он хотел бы //увидеть.
            case (1): {
                printf("\n\nКакой раздел бы вы хотели увидеть\n");
                printf("1. Бейсбол\n");
                printf("2. Кино\n");
                printf("3. Президенты США\n");
                printf("4. Выход\n");
                printf("Введите свой выбор: ");
                scanf(" %d", &choice2);
                if (choice2 == 1) {
                    printf("\n\nЧемпионы мировой серии ");
                    printf("1980-х годов:\n");
                    printf("1980: Philadelphia Phillies\n");
                    printf("1981: Los Angeles Dodgers\n");
                    printf("1982: St. Louis Cardinals\n");
                    printf("1983: Baltimore Orioles\n");
                    printf("1984: Detroit Tigers\n");
                    printf("1985: Kansas City Royals\n");
                    printf("1986: New York Mets\n");
                    printf("1987: Minnesota Twins\n");
                    printf("1988: Los Angeles Dodgers\n");
                    printf("1989: Oakland A’s\n");
                    printf("\n\n\n");
                    break;
                } else if (choice2 == 2) {
                    printf("\n\nОбладатели премии Оскар ");
                    printf("1980-х годов:\n");
                    printf("1980: Ordinary People\n");
                    printf("1981: Chariots of Fire\n");
                    printf("1982: Gandhi\n");
                    printf("1983: Terms of Endearment\n");
                    printf("1984: Amadeus\n");
                    printf("1985: Out of Africa\n");
                    printf("1986: Platoon\n");
                    printf("1987: The Last Emperor\n");
                    printf("1988: Rain Man\n");
                    printf("1989: Driving Miss Daisy\n");
                    printf("\n\n\n");
                    break;
                } else if (choice2 == 3) {
                    printf("\n\nПрезиденты США ");
                    printf("1980-х годов:\n");
                    printf("1980: Джимми Картер\n");
                    printf("1981-1988: Рональд Рейган\n");
                    printf("1989: Джордж Буш\n");
                    printf("\n\n\n");
                    break;
                } else if (choice2 == 4) {
                    exit(1);
                } else {
                    printf("Извините, неправильный номер!\n");
                    break;
                }
            }
//Этот блок case для 1990-х годов.
//В отличие, от верхнего меню, проверка
// выбранного пункта меню не предусмотрена
            case (2): {
                printf("\n\nКакой раздел бы вы хотели увидеть\n");
                printf("1. Бейсбол\n");
                printf("2. Кино\n");
                printf("3. Президенты США\n");
                printf("4. Выход\n");
                printf("Введите свой выбор: ");
                scanf(" %d", &choice2);
                if (choice2 == 1) {
                    printf("\n\nЧемпионы мировой серии ");
                    printf("1990-х годов:\n");
                    printf("1990: Cincinnati Reds\n");
                    printf("1991: Minnesota Twins\n");
                    printf("1992: Toronto Blue Jays\n");
                    printf("1993: Toronto Blue Jays \n");
                    printf("1994: No World Series\n");
                    printf("1995: Atlanta Braves\n");
                    printf("1996: New York Yankees\n");
                    printf("1997: Florida Marlins\n");
                    printf("1998: New York Yankees\n");
                    printf("1999: New York Yankees\n");
                    printf("\n\n\n");
                    break;
                } else if (choice2 == 2) {
                    printf("\n\nОбладатели премии Оскар ");
                    printf("1990-х годов:\n");
                    printf("1990: Dances with Wolves\n");
                    printf("1991: The Silence of the Lambs\n");
                    printf("1992: Unforgiven\n");
                    printf("1993: Schindler’s List\n");
                    printf("1996: The English Patient\n");
                    printf("1997: Titanic\n");
                    printf("1998: Shakespeare in Love\n");
                    printf("1999: American Beauty\n");
                    printf("\n\n\n");
                    break;
                } else if (choice2 == 3) {
                    printf("\n\nПрезиденты США ");
                    printf("1990-х годов:\n");
                    printf("1990-1992: Джордж Буш\n");
                    printf("1993-1999: Билл Клинтон\n");
                    printf("\n\n\n");
                    break;
                } else if (choice2 == 4) {
                    exit(1);
                } else {
                    printf("Извините, неправильный номер!\n");
                    break;
                }
            }
//Этот участок кода задействуется, когда
//пользователь выбирает 2000-е годы
            case (3): {
                printf("\n\nКакой раздел бы вы хотели увидеть\n");
                printf("1. Бейсбол\n");
                printf("2. Кино\n");
                printf("3. Президенты США\n");
                printf("4. Выход\n");
                printf("Введите свой выбор: ");
                scanf(" %d", &choice2);
                if (choice2 == 1) {
                    printf("\n\nЧемпионы мировой серии ");
                    printf("2000-х годов:\n");
                    printf("2000: New York Yankees \n");
                    printf("2001: Arizona Diamondbacks\n");
                    printf("2002: Anaheim Angels\n");
                    printf("2003: Florida Marlins\n");
                    printf("2004: Boston Red Sox\n");
                    printf("2005: Chicago White Sox\n");
                    printf("2006: St. Louis Cardinals\n");
                    printf("2007: Boston Red Sox\n");
                    printf("2008: Philadelphia Phillies\n");
                    printf("2009: New York Yankees\n");
                    printf("\n\n\n");
                    break;
                } else if (choice2 == 2) {
                    printf("\n\nОбладатели премии Оскар ");
                    printf("2000-х годов:\n");
                    printf("2000: Gladiator\n");
                    printf("2001: A Beautiful Mind\n");
                    printf("2002: Chicago\n2003: The");
                    printf(" Lord of the rings: The ");
                    printf("Return of the King\n");
                    printf("2004: Million Dollar Baby\n");
                    printf("2005: Crash\n");
                    printf("2006: The Departed\n");
                    printf("2007: No Country for Old Men\n");
                    printf("2008: Slumdog Millionaire\n");
                    printf("2009: The Hurt Locker\n");
                    printf("\n\n\n");
                    break;
                } else if (choice2 == 3) {
                    printf("\n\nПрезиденты США ");
                    printf("2000-х годов:\n");
                    printf("2000: Bill Clinton\n");
                    printf("2001-2008: George Bush\n");
                    printf("2009: Barrack Obama\n");
                    printf("\n\n\n");
                    break;
                } else if (choice2 == 4) {
                    exit(1);
                } else {
                    printf("Извините, неправильный номер!\n");
                    break;
                }
            }
            case (4):
                exit(1);
            default:
                printf("Пункта меню \n%d не существует.\n", choice1);
                printf("Try again.\n");
                break;
        }
    } while ((choice1 < 1) || (choice1 > 4));
    return 0;
}