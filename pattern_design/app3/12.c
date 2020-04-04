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
    int row , column , space;
    char a='A',b;
    for(row = 1; row <= 5; row++)
    {
        b=a;
        for(space=1;space<=5-row;space++)
        {
            printf(" ");
        }
        for(column = 1; column <= row; column++)
        {
            printf("%c",b);
            b--;
        }
        a++;
        printf("\n");
    }
}