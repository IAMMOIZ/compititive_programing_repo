//program to print first and last digit of the number ;
import java.util.Scanner;
public class Main
{
    public static void main(String gg[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int number = sc.nextInt();
        int temp = number;
        //for first digit of the number
        while(number>10)
        {
            number = number/10;
        }
        System.out.println("first digit of the number is "+number);
        //for last digit of the number 
        System.out.println("last digit of the number is : "+temp%10);

    }
}