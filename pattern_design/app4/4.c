/*
//row basis
AAAAA
 BBBB
  CCC
   DD
    E
*/
#include<stdio.h>
int main()
{
    int row , column,space;
    char a='A';
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
        a++;
        printf("\n");
    }
}