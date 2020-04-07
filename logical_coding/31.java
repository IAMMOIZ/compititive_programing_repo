//fibbonacci series upto nth numbers 
public class Main
{
    public static void main(String gg[])
    {
        int a,b,sum;
        a=0,b=1;
        for(int i = 1=;i<=10;i++)
        {
            System.out.println(a);
            sum = a+b;
            a=b;
            b=sum;
        }
    }
}