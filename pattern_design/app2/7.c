/*

//column basis
54321
5432
543
54
5
*/
#include<stdio.h>
int main()
{
    int row , column;
    for(row = 1; row <= 5; row++)
    {
        for(column = 1; column <= 6-row; column++)
        {
            printf("%d",6-column);
        }
        printf("\n");
    }
}