/*

//column basis
12345
 1234
  123
   12
    1
*/
#include<stdio.h>
int main()
{
    int row , column, space;
    for(row = 1; row <= 5; row++)
    {
        for(space=1;space<row;space++)
        {
            printf(" ");
        }
        for(column = 1; column <= 6-row; column++)
        {
            printf("%d",column);
        }
        printf("\n");
    }
}