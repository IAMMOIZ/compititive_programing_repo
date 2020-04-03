/*

//column basis
12345
2345
345
45
5

*/
#include<stdio.h>
int main()
{
    int row , column , mid;
    for(row = 1; row <= 5; row++)
    {
        mid  = row;
        for(column = 1; column <= 6-row; column++)
        {
            printf("%d",mid);
            mid++;
        }
        printf("\n");
    }
}