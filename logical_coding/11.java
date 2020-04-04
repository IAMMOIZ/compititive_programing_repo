//program to accept a number and check whether a number is possitive , negative and zero.
import java.util.Scanner;
public class Main
{
    public static void main(String gg[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        if(num<0)
        System.out.println("number is negative");
        else if(num>0)
        System.out.println("number is positive");
        else 
        System.out.println("number is zero");


    }
}