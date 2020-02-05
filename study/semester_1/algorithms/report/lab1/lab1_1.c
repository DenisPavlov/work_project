#include <stdio.h>
#include <time.h>
#include <stdlib.h>
#include <math.h>

FILE *selection;
FILE *shell;
FILE *heap;

void selectionSort(int *arr, int size);

void shellSort(int *arr, int size);

void swap(int *a, int *b);

void heapSort(int *arr, int size);

int *createRandomArray(int size);

int *createToMinRandomArray(int size);

int *createToMaxRandomArray(int size);

void arrayPrint(int *arr, int size);

int sum(int *arr, int size);

int series(int *arr, int size);

int siftDown(int *numbers, int root, int bottom);

main() {

    printf("Выберите метод сортировки. (Введите цифру и нажмите клавишу Enter)\n");
    printf("1. Метод прямого выбора. \n");
    printf("2. Метод Шелла. \n");
    printf("3. Пирамидальная сортировка. \n");

    int choice;
    scanf(" %d", &choice);
    switch (choice) {
        case (1): {
            int size;
            selection = fopen("selection.txt", "a");
            // Проверить, открылся ли файл
            if (selection == 0) {
                printf("Ошибка. Невозможно открыть файл.\n");
                exit(1);
            }

            printf("Сколько элементов будет в массиве (введите целое число)? \n");
            scanf(" %d", &size);

            fprintf(selection, "Случайная последовательность элементов. \n");
            int *randomArray = createRandomArray(size);
            selectionSort(randomArray, size);
            free(randomArray);
            fprintf(selection, "\n");

            fprintf(selection, "Возрастающая последовательность элементов. \n");
            int *toMaxArray = createToMaxRandomArray(size);
            selectionSort(toMaxArray, size);
            free(toMaxArray);
            fprintf(selection, "\n");

            fprintf(selection, "Убывающая последовательность элементов. \n");
            int *toMinArray = createToMinRandomArray(size);
            selectionSort(toMinArray, size);
            free(toMinArray);
            fprintf(selection, "\n");

            break;
        };
        case (2): {
            int size;
            shell = fopen("shell.txt", "a");
            // Проверить, открылся ли файл
            if (shell == 0) {
                printf("Ошибка. Невозможно открыть файл.\n");
                exit(1);
            }

            printf("Сколько элементов будет в массиве (введите целое число)? \n");
            scanf(" %d", &size);

            fprintf(shell, "Случайная последовательность элементов. \n");
            int *randomArray = createRandomArray(size);
            shellSort(randomArray, size);
            free(randomArray);
            fprintf(shell, "\n");

            fprintf(shell, "Возрастающая последовательность элементов. \n");
            int *toMaxArray = createToMaxRandomArray(size);
            shellSort(toMaxArray, size);
            free(toMaxArray);
            fprintf(shell, "\n");

            fprintf(shell, "Убывающая последовательность элементов. \n");
            int *toMinArray = createToMinRandomArray(size);
            shellSort(toMinArray, size);
            free(toMinArray);
            fprintf(shell, "\n");

            break;
        };
        case (3): {
            int size;
            heap = fopen("heap.txt", "a");
            // Проверить, открылся ли файл
            if (heap == 0) {
                printf("Ошибка. Невозможно открыть файл.\n");
                exit(1);
            }

            printf("Сколько элементов будет в массиве (введите целое число)? \n");
            scanf(" %d", &size);

            fprintf(heap, "Случайная последовательность элементов. \n");
            int *randomArray = createRandomArray(size);
            heapSort(randomArray, size);
            free(randomArray);
            fprintf(heap, "\n");

            fprintf(heap, "Возрастающая последовательность элементов. \n");
            int *toMaxArray = createToMaxRandomArray(size);
            heapSort(toMaxArray, size);
            free(toMaxArray);
            fprintf(heap, "\n");

            fprintf(heap, "Убывающая последовательность элементов. \n");
            int *toMinArray = createToMinRandomArray(size);
            heapSort(toMinArray, size);
            free(toMinArray);
            fprintf(heap, "\n");

            break;
        }
    }
}

// сортировка Шелла
void shellSort(int *arr, int size) {
    int c = 0; //количество сравнений
    int m = 0; //количество пересылок
    int step, i, j, tmp;

    fprintf(shell, "Контрольная сумма до сортировки %d. \n", sum(arr, size));
    fprintf(shell, "Количество серий до сортировки %d. \n", series(arr, size));

    // Выбор шага
    for (step = size / 2; step > 0; step /= 2) {

        // Перечисление элементов, которые сортируются на определённом шаге
        for (i = step; i < size; i++) {

            // Перестановка элементов внутри подсписка, пока i-тый не будет отсортирован
            for (j = i - step; j >= 0 && arr[j] > arr[j + step]; j -= step) {
                swap(&arr[j], &arr[j + step]);
                m += 3;
                c++;
            }
            c++;
        }
        c++;
    }
    fprintf(shell,
            "Выполнена сортировка методом Шелла. Количество элементов = %d, количество сравнений = %d, "
            "количество пересылок = %d\n", size, c, m);
    fprintf(shell, "Контрольная сумма после сортировки %d. \n", sum(arr, size));
    fprintf(shell, "Количество серий после сортировки %d. \n", series(arr, size));
    printf("Отсортированный массив:\n");
    arrayPrint(arr, size);
}

// сортировка методом прямого выбора
void selectionSort(int *arr, int size) {
    int c = 0; //количество сравнений
    int m = 0; //количество пересылок

    fprintf(selection, "Контрольная сумма до сортировки %d. \n", sum(arr, size));
    fprintf(selection, "Количество серий до сортировки %d. \n", series(arr, size));

    for (int i = 0; i < size - 1; i++) {
        c++;
        int minElementIndex = i;
        for (int j = i + 1; j < size; j++) {
            c++;
            if (arr[minElementIndex] > arr[j]) {
                minElementIndex = j;
            }
        }
        swap(&arr[i], &arr[minElementIndex]);
        m += 3;
    }

    fprintf(selection,
            "Выполнена сортировка методом прямого выбора. Количество элементов = %d, количество сравнений = %d, "
            "количество пересылок = %d\n", size, c, m);
    fprintf(selection, "Контрольная сумма после сортировки %d. \n", sum(arr, size));
    fprintf(selection, "Количество серий после сортировки %d. \n", series(arr, size));
    printf("Отсортированный массив:\n");
    arrayPrint(arr, size);
}

//пирамидальная сортировка
//void heapSort(int *arr, int size) {
//    int c = 0; //количество сравнений
//    int m = 0; //количество пересылок
//
//    fprintf(heap, "Контрольная сумма до сортировки %d. \n", sum(arr, size));
//    fprintf(heap, "Количество серий до сортировки %d. \n", series(arr, size));
//
//    int sh = 0;
//    while (1) {
//        int b = 0;
//
//        for (int i = 0; i < size; ++i) {
//            c++;
//            int root = i+sh;
//            int left = 2*i+1+sh;
//            int right = 2*i+2+sh;
//
//            if (right < size){
//                if (arr[root] > arr[left] || arr[root] > arr[right]){
//
//                    if (arr[left] < arr[right]) {
//                        swap(&arr[root], &arr[left]);
//                        b = 1;
//                        m+=3;
//                    }
//                    else if (arr[right] < arr[left]) {
//                        swap (&arr[root], &arr[right]);
//                        b = 1;
//                        m+=3;
//                    }
//                }
//            }
//            else if (left < size) {
//                if (arr[root] > arr[left]) {
//                    swap (&arr[root], &arr[left]);
//                    b = 1;
//                    m+=3;
//                }
//            }
//        }
//        если не было перестановки
//        if (!b) sh++;
//        if (sh + 2 == size) break;
//    }
//    fprintf(heap,
//            "Выполнена сортировка методом пирамидальной сортировки. Количество элементов = %d, количество сравнений = %d, "
//            "количество пересылок = %d\n", size, c, m);
//    fprintf(heap, "Контрольная сумма после сортировки %d. \n", sum(arr, size));
//    fprintf(heap, "Количество серий после сортировки %d. \n", series(arr, size));
//    printf("Отсортированный массив:\n");
//    arrayPrint(arr, size);
//    printf("\n");
//}

// Функция сортировки на куче
void heapSort(int *arr, int size) {
    int c = 0; //количество сравнений
    int m = 0; //количество пересылок

    fprintf(heap, "Контрольная сумма до сортировки %d. \n", sum(arr, size));
    fprintf(heap, "Количество серий до сортировки %d. \n", series(arr, size));

    // Формируем нижний ряд пирамиды
    for (int i = (size / 2) - 1; i >= 0; i--) {
        c+=siftDown(arr, i, size - 1);
    }
    // Просеиваем через пирамиду остальные элементы
    for (int i = size - 1; i >= 1; i--) {
        swap(&arr[0], &arr[i]);
        m+=3;
        c+=siftDown(arr, 0, i - 1);
        c++;
    }

    fprintf(heap,
            "Выполнена сортировка методом пирамидальной сортировки. Количество элементов = %d, количество сравнений = %d, "
            "количество пересылок = %d\n", size, c, m);
    fprintf(heap, "Контрольная сумма после сортировки %d. \n", sum(arr, size));
    fprintf(heap, "Количество серий после сортировки %d. \n", series(arr, size));
    printf("Отсортированный массив:\n");
    arrayPrint(arr, size);
    printf("\n");
}

// Функция "просеивания" через кучу - формирование кучи
int siftDown(int *numbers, int root, int bottom) {
    int c = 0; //кол-во сравнеий
    int maxChild; // индекс максимального потомка
    int done = 0; // флаг того, что куча сформирована
    // Пока не дошли до последнего ряда
    while ((root * 2 <= bottom) && (!done)) {
        if (root * 2 == bottom)    // если мы в последнем ряду,
            maxChild = root * 2;    // запоминаем левый потомок
            // иначе запоминаем больший потомок из двух
        else if (numbers[root * 2] > numbers[root * 2 + 1])
            maxChild = root * 2;
        else
            maxChild = root * 2 + 1;
        // если элемент вершины меньше максимального потомка
        if (numbers[root] < numbers[maxChild]) {
            int temp = numbers[root]; // меняем их местами
            numbers[root] = numbers[maxChild];
            numbers[maxChild] = temp;
            root = maxChild;
        }
        else // иначе
            done = 1; // пирамида сформирована

        c++;
    }
    return c;
}

//метод создания массива случайных элементов
int *createRandomArray(int size) {
    //для случайных элементов
    time_t t;
    srand(time(&t));
    int *randomNums;

    randomNums = (int *) malloc(size * sizeof(int));

    printf("Создан массив со случайными элементами:\n ");
    for (int i = 0; i < size; i++) {
        randomNums[i] = (rand() % 100) + 1;
        printf(" %d", randomNums[i]);
    }
    printf("\n");

    return randomNums;
}

// Создать массив упорядоченных по возрастанию элементов
int *createToMaxRandomArray(int size) {
    //для случайных элементов
    time_t t;
    srand(time(&t));
    int *toMaxArray;

    toMaxArray = (int *) malloc(size * sizeof(int));

    for (int i = 0; i < size; i++) {
        toMaxArray[i] = (rand() % 100) + 1;
    }

    for (int i = 0; i < size; i++) {
        for (int j = i + 1; j < size; j++) {
            if (toMaxArray[i] > toMaxArray[j]) {
                swap(&toMaxArray[j], &toMaxArray[i]);
            }
        }
    }
    printf("Создан массив с упорядоченными по возростанию элементами:\n ");
    arrayPrint(toMaxArray, size);
    printf("\n");

    return toMaxArray;
}

// Создать массив упорядоченных по убыванию элементов
int *createToMinRandomArray(int size) {
    //для случайных элементов
    time_t t;
    srand(time(&t));
    int *toMinArray;

    toMinArray = (int *) malloc(size * sizeof(int));

    for (int i = 0; i < size; i++) {
        toMinArray[i] = (rand() % 100) + 1;
    }

    for (int i = 0; i < size; i++) {
        for (int j = i + 1; j < size; j++) {
            if (toMinArray[i] < toMinArray[j]) {
                swap(&toMinArray[j], &toMinArray[i]);
            }
        }
    }
    printf("Создан массив c упорядоченных по убыванию элементами:\n ");
    arrayPrint(toMinArray, size);
    printf("\n");

    return toMinArray;
}

// вывод на экран элементов массива
void arrayPrint(int *arr, int size) {
    for (int i = 0; i < size; i++) {
        printf(" %d", arr[i]);
    }
}

// посчитать сумму элементов массива
int sum(int *arr, int size) {
    int sum = 0;
    for (int i = 0; i < size; i++) {
        sum += arr[i];
    }
    return sum;
}

// подсчет количества серий
int series(int *arr, int size) {
    int series = 1;
    for (int i = 0; i < size - 1; i++) {
        if (arr[i] > arr[i + 1]) {
            series++;
        }
    }
    return series;
}

//метод меняющий местами элементы
void swap (int *a, int *b) {
    int t = *a;
    *a = *b;
    *b = t;
}


