// Программа-пример No3 из главы 9
// Руководства по С для новичков, 3-е издание
// Файл Chapter9ex3.c
/* Эта программа вычисляет среднюю из четырех оценку,
а также выполняет другие базовые математические
операции */
#include <stdio.h>
main()
{
    int grade1, grade2, grade3, grade4;
    float averageGrade, gradeDelta, percentDiff;
    /* Студент получил 88 баллов за первый и третий тесты,
    поэтому подойдет выражение множественного присваивания
    */
    grade1 = grade3 = 88;
    grade2 = 79;
    //Пользователь должен ввести четвертую оценку
    printf("Сколько Вы получили за четвертый тест");
    printf(" (Целое число в диапазоне от 0 до 100)?");
    scanf(" %d", &grade4);
    averageGrade = (grade1+grade2+grade3+grade4)/4;
    printf("Ваша средняя оценка %.1f\n", averageGrade);
    gradeDelta = 95 - averageGrade;
    percentDiff = 100 * ((95-averageGrade) / 95);
    printf("Ваша оценка на %.1f баллов ниже, чем ", gradeDelta);
    printf(" – лучшая оценка в классе\n");
    printf("Ваш результат на %.1f процентов хуже, ", percentDiff);
    printf("чем эта оценка!\n\n\n");
    return 0;
}
