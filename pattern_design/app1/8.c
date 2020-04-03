/*

//column basis
1
21
321
4321
54321

*/
#include<stdio.h>
int main()
{
    int row , column , mid;
    for(row = 1; row <= 5; row++)
    {
        mid  = row;
        for(column = 1; column <= row; column++)
        {
            printf("%d",mid);
            mid--;
        }
        printf("\n");
    }
}