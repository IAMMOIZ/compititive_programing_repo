//program to accept two number print largest among them.
import java.util.Scanner;
public class Main
{
    public static void main(String gg[])
    {
        Scanner sc = new Scanner(System.in);
        int first , second;
        System.out.print("Enter first number : ");
        first = sc.nextInt();
        System.out.print("Enter second number : ");
        second = sc.nextInt();
        //way-1
        if(first>second)
        {
            System.out.print("first number : "+first+" is greater then second number : "+second);
        }
        else{
            System.out.print("Second number : "+second+" is greater then first number : "+first);
        }
        //way-2
        if(first>second)
            System.out.print("first number : "+first+" is greater then second number : "+second);
        else
            System.out.print("Second number : "+second+" is greater then first number : "+first);
    }
}