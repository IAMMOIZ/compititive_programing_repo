/*

//column basis
5
54
543
5432
54321
*/
#include<stdio.h>
int main()
{
    int row , column;
    for(row = 1; row <= 5; row++)
    {
        for(column = 1; column <= row; column++)
        {
            printf("%d",6-column);
        }
        printf("\n");
    }
}