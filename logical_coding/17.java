//program to accept a number from the user and print sum of all the digits of the number
import java.util.Scanner;
public class Main
{
    public static void main(String gg[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        int sum=0;
        while(num>0)
        {
            sum += num%10;
            num = num/10;
        }
        System.out.print("sum of digit is : "+sum);
    }
}