//program to accept two number and swap them by using thired variable.(temprary variable)
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int first,second,temp;
        System.out.print("Enter first number : ");
        first = sc.nextInt();
        System.out.print("Enter second number : ");
        second = sc.nextInt();
        System.out.println("before swapping \nfirst number is : "+first+"\nsecond number is : "+second);
        temp = first;
        first = second;
        second = temp;
        System.out.print("first number is : "+first+"\nsecond number is : "+second);

    }
}