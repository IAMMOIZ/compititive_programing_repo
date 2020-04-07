//find large among n numbers without array
import java.util.Scanner;
public class Main 
{
    public static void main(String gg[])
    {
        int size , sum;
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number of elements : ");
        int size = sc.nextInt();
        for(int i = 1;i<=size;i++)
        {
            System.out.print("Enter new element : ");
            sum = sum + sc.nextInt();
        }
        System.out.println("Total is : "+ sum);
    }
}