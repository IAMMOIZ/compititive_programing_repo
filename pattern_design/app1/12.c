/*

//column basis
A
BA
CBA
DCBA
EDCBA
*/
#include<stdio.h>
int main()
{
    int row , column ;
    char a='A',b;
    for(row = 1; row <= 5; row++)
    {
        b=a;
        for(column = 1; column <= row; column++)
        {
            printf("%c",b);
            b--;
        }
        a++;
        printf("\n");
    }
}