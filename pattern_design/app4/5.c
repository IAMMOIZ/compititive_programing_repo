/*
//row basis
EEEEE
 DDDD
  CCC
   BB
    A

*/
#include<stdio.h>
int main()
{
    int row , column, space;
    char a='E';
    for(row = 1; row <= 5; row++)
    {
        for(space=1;space<row;space++)
        {
            printf(" ");
        }
        for(column = 1; column <= 6-row; column++)
        {
            printf("%c",a);
        }
        a--;
        printf("\n");
    }
}