// Программа-пример No1 из главы 32
// Руководства по С для новичков, 3-е издание
// Файл Chapter32ex1.c
/* Эта программа демонстрирует возврат значений
функциями путем передачи трех чисел с плавающей
точкой (оценок) и вычисления среднего значения
из этих трех. */
#include <stdio.h>

float gradeAve(float test1, float test2, float test3);

main() {
    float grade1, grade2, grade3;
    float average;
    printf("Какова Ваша оценка за первый тест? ");
    scanf(" %f", &grade1);
    printf("Какова Ваша оценка за второй тест? ");
    scanf(" %f", &grade2);
    printf("Какова Ваша оценка за третий тест? ");
    scanf(" %f", &grade3);

    //Передать в функцию три оценки и вернуть
    //средний балл
    average = gradeAve(grade1, grade2, grade3);
    printf("\nСредний балл за три теста составил: % .2f", average);
    return 0;
}

/****************************************************/
float gradeAve(float test1, float test2, float test3) // Принимает значения трех оценок
{
    float localAverage;
    localAverage = (test1 + test2 + test3) / 3;
    return (localAverage); // Возврат среднего
// балла в main()
}