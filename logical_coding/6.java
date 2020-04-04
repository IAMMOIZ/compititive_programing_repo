//program to get number from user and print square and cube of the number.
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println("Square is : "+ number*number);
        System.out.println("Square is : "+ number*number*number);    
    }
}