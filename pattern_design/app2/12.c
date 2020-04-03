/*

//column basis
ABCDE
BCDE
CDE
DE
E
*/
#include<stdio.h>
int main()
{
    int row , column;
    char a='A',b;
    for(row = 1; row <= 5; row++)
    {
        b=a;
        for(column = 1; column <= 6-row; column++)
        {
            printf("%c",b);
            b++;
        }
        a++;
        printf("\n");
    }
}