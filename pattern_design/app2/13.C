/*

//column basis
EDCBA
DCBA
CBA
BA
A
*/
#include<stdio.h>
int main()
{
    int row , column ;
    char a='E',b;
    for(row = 1; row <= 5; row++)
    {
        b = a;
        for(column = 1; column <= 6-row; column++)
        {
            printf("%c",b);
            b--;
        }
        a--;
        printf("\n");
    }
}