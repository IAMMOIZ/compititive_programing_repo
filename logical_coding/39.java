//program to accept two number and print greatest common divisior[gcd]
import java.util.Scanner;
public class Main 
{
    public static void main(String gg[])
    {
        Scanner sc = new Scanner(System.in);
        int first , second , gcd;
        System.out.print("Enter first number : ");
        first = sc.nextInt();
        System.out.print("Enter second number : ");
        second = sc.nextInt();
        System.out.print((first > second ) ? gcd(first , second):gcd(second,first));
    }
    public static int gcd(int num1 ,int  num2)
    {
        int gcd=1;
        for(int i = num2 ; i>0 ; i--)
        {
            if( (num1 % i ==0) && (num2 % i==0))
            {
            gcd = i;
            break;
            }
        }
        return gcd;
    }
}