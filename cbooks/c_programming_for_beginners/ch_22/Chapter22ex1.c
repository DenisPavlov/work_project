// Программа-пример No1 из главы 22
// Руководства по С для новичков, 3-е издание
// Файл Chapter22ex1.c
/* Эта программа принимает вводимый пользователем
идентификационный номер клиента и сравнивает его
с номерами в базе данных. Если введенный номер
присутствует в базе, то программа использует данный
элемент массива для проверки текущего баланса
пользователя и выводит предупреждение, если баланс
пользователя больше 100 долларов */
#include <stdio.h>

main() {
    int ctr; //Счетчик цикла
    int idSearch; //Искомый клиент (ключ)
    int found = 0; //Будет равен 1 (ИСТИНА) если клиент найден

    //Определение 10 элементов двух параллельных массивов
    int custID[10] = {313, 453, 502, 101, 892,
                      475, 792, 912, 343, 633};
    int custBal[10] = {0.00, 45.43, 71.23, 301.56, 9.08,
                       192.41, 389.00, 229.67, 18.31, 59.54};

    /*Взаимодействие с пользователем, ищущим баланс. */
    printf("\n\n*** Проверка баланса клиента ***\n");
    printf("Введите искомый номер клиента: ");
    scanf(" %d", &idSearch);

    /*Поиск и установление наличия номера клиента
    в массиве*/
    for (ctr = 0; ctr < 10; ctr++) {
        if (idSearch == custID[ctr]) {
            found = 1;
            break;
        }
    }
    if (found) {
        if (custBal[ctr] > 100.00) {
            printf("\n**Баланс клиента: $%.2f.\n", custBal[ctr]);
            printf("Кредит недоступен.\n");
        } else {
            printf("\n**У клиента хороший кредитный баланс!\n");
        }
    } else {
        printf("**Вы ввели неверный ID клиента.");
        printf("\n Введенный ID %3d в списке не найден.\n", idSearch);
    }
    return (0);
}