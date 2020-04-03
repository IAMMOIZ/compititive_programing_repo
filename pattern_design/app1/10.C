/*

//column basis
A
AB
ABC
ABCD
ABCDE

*/
#include<stdio.h>
int main()
{
    int row , column ;
    char a;
    for(row = 1; row <= 5; row++)
    {
        a='A';
        for(column = 1; column <= row; column++)
        {
            printf("%c",a);
            a++;
        }
        printf("\n");
    }
}