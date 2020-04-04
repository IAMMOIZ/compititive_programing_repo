//program to accept a number and print number is pallindrom of not .
import java.util.Scanner;
public class Main
{
    public static void main(String gg[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        int temp = num;
        int newnum = 0;
        while(temp>0)
        {
            newnum = (10 * newnum) + temp%10;
            temp = temp/10;
        }

        if(num == newnum)
        System.out.print("number is pallindrome");
        else
        System.out.print("number is not pallindrome");
    }
}