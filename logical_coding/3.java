//write a program to get two numbers from the user and print sum of both numbers
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int first,second;
        System.out.print("Enter first number : ");
        first = sc.nextInt();
        System.out.print("Enter second number : ");
        second = sc.nextInt();
        int sum = first + second;
        System.out.println("Sum is : "+ sum);
	}
}
