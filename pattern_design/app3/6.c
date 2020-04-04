/*

//column basis
    1
   12
  123
 1234
12345
*/
#include<stdio.h>
int main()
{
    int row , column,space;
    for(row = 1; row <= 5; row++)
    {
        for(space=1;space<=5-row;space++)
        {
            printf(" ");
        }
        for(column = 1; column <= row; column++)
        {
            printf("%d",column);
        }
        printf("\n");
    }
}