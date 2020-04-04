//write a program to print simple interest.
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        float pAmount, rate , time , SI;
        System.out.print("Enter amount : ");
        pAmount = sc.nextFloat();
        System.out.print("Enter rate of interest : ");
        rate = sc.nextFloat();
        System.out.print("Enter time period : ");
        time = sc.nextFloat();
        SI = (pAmount * rate * time)/ 100;
        sc.close();
        System.out.println("Simple interest is : "+ SI);
	}
}
