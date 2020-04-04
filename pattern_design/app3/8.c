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
    int row , column , mid ,space;
    for(row = 1; row <= 5; row++)
    {
        mid  = row;
        for(space=1;space<=5-row;space++)
        {
            printf(" ");
        }
        for(column = 1; column <= row; column++)
        {
            printf("%d",mid);
            mid--;
        }
        printf("\n");
    }
}