/*

//column basis
EDCBA
EDCB
EDC
ED
E

*/
#include<stdio.h>
int main()
{
    int row , column ;
    char a;
    for(row = 1; row <= 5; row++)
    {
        a='E';
        for(column = 1; column <= 6-row; column++)
        {
            printf("%c",a);
            a--;
        }
        printf("\n");
    }
}