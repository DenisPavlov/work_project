#include <stdio.h>

main()
{
    float a, b;
    printf("Какой бонус вы получили?");
    scanf(" %f", &a);
    b = .85 * a;
    printf("Если отдадите 15% на блпготворительность,");
    printf("у вас останется %.2f ", b);
    return 0;
}
