// Руководства по С для новичков, 3-е издание
// Файл Chapter29ex1.c
/* Эта программа открывает файл letters.txt и печатает
в него буквы от A до Z. После этого программа
с помощью цикла считывает буквы в обратном порядке от
Z до A и выводит их на экран */
#include <stdio.h>
#include <stdlib.h>

FILE *fptr;

main() {
    char letter;
    int i;
    fptr = fopen("letters.txt","w + ");
    if (fptr == 0) {
        printf("При открытии файла произошла ошибка.\n");
        exit(1);
    }
    for (letter = 'A'; letter <= 'Z'; letter++) {
        fputc(letter, fptr);
    }
    puts("Завершена запись букв от A до Z");

    // Чтение файла в обратной последовательности
    fseek(fptr, -1, SEEK_END); // Минус 1 байт с конца
    printf("Данные файла в обратном порядке:\n");
    for (i = 26; i > 0; i--) {
        letter = fgetc(fptr);
        // Чтение буквы и возврат на 2 позиции
        fseek(fptr, -2, SEEK_CUR);
        printf("The next letter is %c.\n", letter);
    }
    fclose(fptr); // Повторимся, всегда закрывайте файлы
    return (0);
}
