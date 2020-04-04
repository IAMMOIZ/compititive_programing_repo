/*

    *
   **
  ***
 ****
*****

*/
#include<stdio.h>
int main()
{
    int row , column;
    for(row = 1; row <= 5; row++)
    {
        for(space = 1;space < 5-row; spac++)
        {
            printf(" ");
        }
        for(column = 1; column <= row; column++)
        {
            printf("*");
        }
        printf("\n");
    }
}