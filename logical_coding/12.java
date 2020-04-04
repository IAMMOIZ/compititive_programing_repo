//program to accept the number and check whether number is even or odd.
import java.util.Scanner;
public class Main
{
    public static void main(String gg[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        if(num%2==0)
        System.out.print("Number is even");
        else
        System.out.print("Number is odd");
        
    }
}