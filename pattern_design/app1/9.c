/*

//column basis
5
45
345
2345
12345

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
            printf("%d",6-mid);
            mid--;
        }
        printf("\n");
    }
}