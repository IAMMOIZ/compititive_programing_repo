/*

//column basis
54321
4321
321
21
1
*/
#include<stdio.h>
int main()
{
    int row , column , mid;
    for(row = 1; row <= 5; row++)
    {
        mid  = 6-row;
        for(column = 1; column <= 6-row; column++)
        {
            printf("%d",mid);
            mid--;
        }
        printf("\n");
    }
}