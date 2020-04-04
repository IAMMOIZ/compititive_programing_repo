// program to accept value of radious and print area of circle
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        float area,radious;
        System.out.print("Enter radious : ");
        radious = sc.nextFloat();
        area = 2*radious*3.14159;
        System.out.print("Area of circle is : ",area);
    }
}