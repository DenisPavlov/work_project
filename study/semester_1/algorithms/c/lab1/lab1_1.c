#include <stdio.h>
#include <time.h>

void selectionSort(int *arr, int size);
int *createArray(int size);
void arrayPrint(int *arr, int size);

main() {
    int size;

    printf("Сколько случайных чисел будет в массиве? \n");
    scanf(" %d", &size);
    int *arr = createArray(size);

    //иетодом прямого выбора
    selectionSort(arr, size);

//    arrayPrint(arr, size);
    free(arr);
}

// сортировка методом прямого выбора
void selectionSort(int *arr, int size) {
    int c = 0; //количество сравнений
    int m = 0; //количество пересылок

    for (int i = 0; i < size; i++) {
        for (int j = i + 1; j < size; j++) {
            c++;
            if (arr[i] > arr[j]) {
                int tmp = arr[j];
                arr[j] = arr[i];
                arr[i] = tmp;
                m++;
            }
        }
    }

    printf("\nВыполнена сортировка методом прямого выбора, количество сравнений = %d, количество пересылок = %d\n", c, m);
    printf("Отсортированный массив:\n");
    arrayPrint(arr, size);
}

//метод создания массива
int *createArray(int size) {
    //для случайных элементов
    time_t t;
    srand(time(&t));
    int *randomNums;

    randomNums = (int *) malloc(size * sizeof(int));

    printf("Создан массив с такими элементами:\n ");
    for (int i = 0; i < size; i++) {
        randomNums[i] = (rand() % 100) + 1;
        printf(" %d", randomNums[i]);
    }

    return randomNums;
}

// вывод на экран элементов массива
void arrayPrint(int *arr, int size) {
    for (int i = 0; i < size; i++) {
        printf(" %d", arr[i]);
    }
    printf("\n");
}
