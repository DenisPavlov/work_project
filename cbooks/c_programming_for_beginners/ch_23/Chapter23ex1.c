// Программа-пример No1 из главы 23
// Руководства по С для новичков, 3-е издание
// Файл Chapter23ex1.c
/* Эта программа генерирует 10 случайных чисел,
а затем сортирует их */
#include <stdio.h>
#include <stdlib.h>
#include <time.h>

main() {
    int ctr, inner, outer, didSwap, temp;
    int nums[10];
    time_t t;

    //Если вы не включите это выражение, то программа всегда
    //будет генерировать одни и те же 10 чисел
    srand(time(&t));

    //Первый шаг – заполнить массив случайными числами
    //(от 1 до 100)
    for (ctr = 0; ctr < 10; ctr++) {
        nums[ctr] = ((rand() % 99) + 1);
    }

    //Распечатать массив в состоянии до сортировки
    puts("\nСписок чисел перед сортировкой:");
    for (ctr = 0; ctr < 10; ctr++) {
        printf("%d\n", nums[ctr]);
    }

    //Сортировка массива
    for (outer = 0; outer < 9; outer++) {
        didSwap = 0; //Становится равной 1 (ИСТИНА), если список еще не сортирован

        for (inner = outer; inner < 10; inner++) {
            if (nums[inner] < nums[outer]) {
                temp = nums[inner];
                nums[inner] = nums[outer];
                nums[outer] = temp;
                didSwap = 1;
            }
        }
        if (didSwap == 0) {
            break;
        }
    }

    //Распечатать массив по состоянию после сортировки
    puts("\nСписок чисел после сортировки:");
    for (ctr = 0; ctr < 10; ctr++) {
        printf("%d\n", nums[ctr]);
    }
    return 0;
}
