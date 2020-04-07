//find large number among the three numbers by using ternary oprator
import java.util.Scanner;
public class Main 
{
    public static void main(String gg[])
    {
        Scanner sc = new Scanner(System.in);
        int first , second , thired;
        System.out.print("Enter first number : ");
        first = sc.nextInt();
        System.out.print("Enter second number : ");
        second = sc.nextInt();
        System.out.print("Enter thired number : ");
        thired = sc.nextInt();
        System.out.print(
            "largest number is " + ((first > second && first > thired)?first:(second > first && second > thired)?second: thired));
    }
}