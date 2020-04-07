//find cube of the number by using any pre defined function
import java.util.Scanner;
import java.lang.Math;
public class Main
{
    public static void main(String gg[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        System.out.print("Cube of the number is : "+Math.pow(num,3));
    }
}