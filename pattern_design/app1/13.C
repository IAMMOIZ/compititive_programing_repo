/*

//column basis
E
DE
CDE
BCDE
ABCDE
*/
#include<stdio.h>
int main()
{
    int row , column ;
    char a='E',b;
    for(row = 1; row <= 5; row++)
    {
        b=a;
        for(column = 1; column <= row; column++)
        {
            printf("%c",b);
            b++;
        }
        a--;
        printf("\n");
    }
}