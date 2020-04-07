//find sum of n number without using array
import java.util.Scanner;
public class Main{
    public static void main(String gg[])
    {
        Scanner sc = new Scanner(System.in);
        int n, sum =0;
        System.out.print("Enter number of elements : ");
        int noe = sc.nextInt();
        for(int i= 1;i<=noe;i++)
        {
            sum = sum + sc.nextInt();
        }
        System.out.println("Sum of all elements is : "+sum);
    }
}