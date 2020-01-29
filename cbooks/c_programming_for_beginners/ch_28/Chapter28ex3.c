// Программа-пример No3 из главы 28
// Руководства по С для новичков, 3-е издание
// Файл Chapter28ex3.c
/* Эта программа открывает существующий файл
информации о книгах из первого примера главы 28
и добавляет в конец этого файла одну строку. */
#include <stdio.h>
#include <stdlib.h>
FILE * fptr;
main()
{
    fptr = fopen("/home/denis/java/projects/work_project/cbooks/c_programming_for_beginners/ch_28/files/BookInfo.txt","a");
    if (fptr == 0)
    {
        printf("Ошибка открытия файла! Извините!\n");
        exit (1);
    }

    // Прибавить строку в конце
    fprintf(fptr, "\nСкоро я куплю еще книг!\n");
    fclose(fptr); // Всегда закрывайте файлы
    return(0);
}
