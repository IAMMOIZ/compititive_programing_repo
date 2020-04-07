//program to accept two number and print greatest common divisior[gcd]
import java.util.Scanner;
public class Main 
{
    public static void main(String gg[])
    {
        Scanner sc = new Scanner();
        int first , second , gcd;
        System.out.print("Enter first number : ");
        first = sc.nextInt();
        System.out.print("Enter second number : ");
        second = sc.nextInt();
        System.out.print((first > second ) ? gcd(first , second):gcd(second,first));
    }
    public static int gcd(num1 , num2)
    {
        int gcd;
        for(int i = 1 ; i>=num2 ; i++)
        {
            if( (num1%i==0) && (num2%i==0))
            return i; 
        }
    }
}