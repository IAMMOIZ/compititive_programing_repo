//program to take number and print its multiplication table
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        num = sc.nextInt();
        System.out.println("number table is : ");
        for(int i=1;i<=10;i++)
        {
            System.out.println(num + " * " + i +" = "+num*i);
        }
	}
}
