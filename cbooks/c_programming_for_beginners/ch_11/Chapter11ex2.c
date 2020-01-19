// Программа-пример No2 из главы 11
// Руководства по С для новичков, 3-е издание
// Файл Chapter11ex2.c
/* Эта программа запрашивает у пользователя год
рождения и вычисляет, сколько лет ему исполняется
в этом году. (Программа также дополнительно проверяет,
не был ли введен еще не наступивший год.) Кроме того,
программа сообщает пользователю, был ли он рожден
в високосный год */
#include <stdio.h>
#define CURRENTYEAR 2020
main()
{
    int yearBorn, age;
    printf("В каком году Вы родились?\n");
    scanf(" %d", &yearBorn);
    // Это выражение if может произвести проверку
    // введенных данных,
    // чтобы удостовериться в том, что введенный год
    // может соответствовать действительности.
    // Программа продолжит выполняться только при условии, что
    // введенный год наступил раньше текущего года
    if (yearBorn > CURRENTYEAR) {
        printf("Правда? Вы еще не родились?\n");
        printf("Поздравляем с путешествием во времени!\n");
    } else {
        age = CURRENTYEAR - yearBorn;
        printf("\nВ этом году в День рождения Вам исполнится %d лет!\n", age);
        // Второе выражение if использует оператор деления по
        // модулю для проверки, не был ли год рождения
        // високосным. Этот код будет выполнен только
        // если год окажется високосным
        if ((yearBorn % 4) == 0) {
            printf("\nВы родились в високосный год! Круто!\n");
        }
    }
    return 0;
}
