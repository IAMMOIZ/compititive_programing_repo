//program to check number is prime or composite
imports java.util.Scanner;
public class Main{
    public static void main(String gg[])
    {
        Scanner sc = new Scanner(System.in);
        int num , div , flag;
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        flag = 0;
        for(div=2;div <= (num/2);div++)
        {
            if(num%div == 0)
            flag = 1;
        }
    }
    if(flag == 0)
    System.out.print("number : "+num+"is prime number");
    else
    System.out.print("number : "+num+"is composite number")
}