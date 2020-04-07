//find all factor of the number
import java.util.Scanner;
public class Main
{
    public static void main(String gg[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int number = sc.nextInt();
        System.out.println("list of all the factor of the number is : ");
        for(int i = 1;i<number ; i++)
        {
            if(number % i == 0)
            System.out.println(i);
        }


    }
}