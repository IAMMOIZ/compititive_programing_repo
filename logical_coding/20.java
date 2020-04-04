//program to print all  armstrong number beetwen the range;
import java.util.Scanner;
public class Main
{
    public static void main(String gg[])
    {
        int remainder,sum,temp;
        for(int i =1; i<1000;i++)
        {
            sum=0;
            remainder=0;
            temp = i;
        while(temp>0)
        {
            remainder =  temp%10;
            sum = sum + (remainder*remainder*remainder);
            temp = temp/10;
        }
        if(sum==i)
        {
         System.out.print("\n"+i);   
        }
        }

    }
}