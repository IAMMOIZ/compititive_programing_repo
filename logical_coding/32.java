//find power of the number without using pdf
import java.util.Scanner;
public class Main
{
    public static void main(String gg[])
    {
        Scanner sc = new Scanner(System.in);
        int num , power , res=0;
        System.out.print("Enter a number : ");
        num = sc.nextInt();
        System.out.print("Enter power of the number  : ");
        power = sc.nextInt();
        for(int i = 1;i<=power ; i++)
        {
            res = res * num;
        }
        System.out.print("result is : "+res);
    }
}