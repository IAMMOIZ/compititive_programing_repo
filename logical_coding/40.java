//least common multiple of two number;
import java.util.Scanner;
public class Main 
{
    public static void main(String gg[])
    {
        Scanner sc = new Scanner(System.in);
        int first , second;
        System.out.print("Enter first number : ");
        first = sc.nextInt();
        System.out.print("Enter second number : ");
        second = sc.nextInt();
        System.out.print((first>second)?lcm(first,second):lcm(second,first));
    }
    int lcm(int num1 , int num2)
    {
        int num = num1;
        for(int = 1;;i++)
        {
            num = num*i;
            if(num1 % num ==0 &&  num2 % num == 0)
            {
                break;
            }
        }
    return num;
    }
}