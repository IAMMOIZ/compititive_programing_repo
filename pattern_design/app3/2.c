/*
//row basis
    1
   22
  333
 4444
55555

*/
#include<stdio.h>
int main()
{
   int row , column,space;
    for(row = 1; row <= 5; row++)
    {
        for(space = 1;space <= 5-row; space++)
        {
            printf(" ");
        }
        for(column = 1; column <= row; column++)
        {
            printf("%d",row);
        }
        printf("\n");
    }
}