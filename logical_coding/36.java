//find power of the number without using pdf
import java.util.Scanner;
public class Main
{
    public static void main(String ggg[])
    {
        Scanner sc = new Scanner(System.in);
        int base , exponent ,res=1;
        System.out.print("Enter base : ");
        base = sc.nextInt();
        System.out.print("Enter exponent : ");
        exponent = sc.nextInt();
        for(int i = 1; i <= exponent ; i++)
        {
            res = res * base;
        }
        System.out.print("Result is : "+ res);
    }
}