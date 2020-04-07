//take a number from user and print factorial of the number
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
        int num,fact=1;;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        num = sc.nextInt();
        //find facorial of the number;
        for(int i=1;i<=num;i++)
        {
            fact = fact * i;
        }
        System.out.print("factorial of the number : "+ num +" is : "+fact);
    }
}