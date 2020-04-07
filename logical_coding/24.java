//print all the prime number between the range
import java.util.Scanner;
public class Main{
    public static void main(String gg[])
    {
        Scanner sc = new Scanner(System.in);
        int start , end ,div, flag;
        System.out.print("Enter start point : ");
        start = sc.nextInt();
        System.out.print("Enter end point : ");
        end = sc.nextInt();
        for(int num = start; num<=end; num++)
        {
            div =2;
            flag=0;
            for(;div<=(i/2);div++)
            {
                if(num%div == 0)
                flag = 1;
            }

            //print the prime number
            if(flag == 0)
            System.out.println("number is prime number : "+ num);
        }
        
    }
}
