/*
//row basis
11111
 2222
  333
   44
    5

*/
#include<stdio.h>
int main()
{
    int row , column ,space;
    for(row = 1; row <= 5; row++)
    {
        for(space=1;space<row;space++)
        {
            printf(" ");
        }
        for(column = 1; column <= 6-row; column++)
        {
            printf("%d",row);
        }
        printf("\n");
    }
}