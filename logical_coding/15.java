//program to print n even numbers.(sum of even numbers in the range).
import java.util.Scanner;
public class Main
{
    public static void main(String gg[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter start point : ");
        int start = sc.nextInt();
        System.out.print("Enter end point : ");
        int end = sc.nextInt();
        System.out.println("all the even numbers in the range is :");
        for(int i = start;i<=end;i++)
        {
            if(i%2==0)
            System.out.print(i+"\n");
        }

       }
}