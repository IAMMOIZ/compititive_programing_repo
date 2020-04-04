//program to accept a number and print reverse number.
import java.util.Scanner;
public class Main
{
    public static void main(String gg[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        int newnum = 0;
        while(num>0)
        {
            newnum = (10 * newnum) + num%10;
            num = num/10;
        }
        System.out.print("reverse number is  : "+ newnum);
    }
}