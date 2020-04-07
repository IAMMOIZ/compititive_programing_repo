//find power of the number without using pdf
import java.util.Scanner;
import java.lang.Math;
public class Main
{
    public static void main(String gg[])
    {
        Scanner sc = new Scanner(System.in);
        int base , exponent , res=0;
        System.out.print("Enter a number : ");
        base = sc.nextInt();
        System.out.print("Enter power of the number  : ");
        exponent = sc.nextInt();
        System.out.print("result is : "+Math.pow(base, exponent));
    }
}