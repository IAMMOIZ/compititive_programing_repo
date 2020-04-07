//find average of n numbers without using array
import java.util.Scanner;
public class Main
{
    public static void main(String gg[])
    {
        Scanner sc = new Scanner(System.in);
        float num  , avg=0;
        System.out.print("Enter number of elements : ");
        size = sc.nextInt();
        for(int i = 1; i<=size; i++)
        {
            System.out.print("Enter a element : ");
            num = sc.nextInt();
            avg = (avg + num )/2;
        }
        System.out.println(avg);
    }
}