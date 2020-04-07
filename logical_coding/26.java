//find average of two numbers
import java.util.Scanner;
public class Main
{
    public static void main(String gg[])
    {
        Scanner sc = new Scanner(System.in);
        float first, second , avg;
        System.out.print("Enter first number : ");
        first = sc.nextInt();
        System.out.print("Enter second number : ");
        second = sc.nextInt();
        avg =(first + second)/2;
        System.out.println(avg);
    }
}