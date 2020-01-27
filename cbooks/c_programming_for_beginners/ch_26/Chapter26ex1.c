// Программа-пример No1 из главы 26
// Руководства по С для новичков, 3-е издание
// Файл Chapter26ex1.c
/* Эта программа запрашивает количество случайных
чисел, выделяет массив и заполняет его числами от 1
до 500, а затем проходит по всем числам и выявляет
наименьшее, наибольшее и вычисляет среднее, после чего
освобождает память. */
#include <stdio.h>
#include <stdlib.h>
#include <time.h>

main() {
    int i, aSize;
    int *randomNums;
    time_t t;
    double total = 0;
    int biggest, smallest;
    float average;
    srand(time(&t));
    printf("Сколько случайных чисел будет в массиве? ");
    scanf(" %d", &aSize);

    // Выделить массив, число элементов которого
    // совпадало бы с количеством случайных чисел,
    // запрошенных пользователем
    randomNums = (int *) malloc(aSize * sizeof(int));

    // Проверка правильности выделения массива
    if (!randomNums) {
        printf("Ошибка выделения массива случайных чисел!\n");
        exit(1);
    }

    // Проход по элементам массива и присвоение каждому элементу
    // целого числа в диапазоне от 1 до 500
    for (i = 0; i < aSize; i++) {
        randomNums[i] = (rand() % 500) + 1;
    }

    // Инициализация самого большого и самого
    // маленького числа для последующего сравнения
    biggest = 0;
    smallest = 500;

    // Проход по заполненному массиву и поиск
    // наибольшего и наименьшего чисел, а также
    // сложение всех чисел и вычисление среднего
    for (i = 0; i < aSize; i++) {
        total += randomNums[i];
        if (randomNums[i] > biggest) {
            biggest = randomNums[i];
        }
        if (randomNums[i] < smallest) {
            smallest = randomNums[i];
        }
    }
    average = ((float) total) / ((float) aSize);
    printf("Наибольшее случайное число: %d.\n", biggest);
    printf("Наименьшее случайное число: %d.\n", smallest);
    printf("Среднее из случайных чисел: %.2f.\n", average);

    // При использовании malloc, не забудьте использовать free
    free(randomNums);
    return (0);
}