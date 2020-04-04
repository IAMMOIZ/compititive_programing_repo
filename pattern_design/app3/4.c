/*
//row basis
    A
   BB
  CCC
 DDDD
EEEEE

*/
#include<stdio.h>
int main()
{
    int row , column , space;
    char a='A';
    for(row = 1; row <= 5; row++)
    {
        for(space =1;space<=5-row;space++)
        {
            printf(" ");
        }
        for(column = 1; column <= row; column++)
        {
            printf("%c",a);
        }
        a++;
        printf("\n");
    }
}