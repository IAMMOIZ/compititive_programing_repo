/*
//row basis
55555
 4444
  333
   22
    1

*/
#include<stdio.h>
int main()
{
    int row , column,space;
    for(row = 1; row <= 5; row++)
    {
        for(space=1;space<row;space++)
        {
            printf(" ");
        }
        for(column = 1; column <= 6-row; column++)
        {
            printf("%d",6-row);
        }
        printf("\n");
    }
}