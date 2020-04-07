//Find out the sum of all odd indexed elements from a given int array
public class Main
{
    public static void main(String gg[])
    {
		int[] x = {100, 4, 8, 20, 6, 11, 15};
		int sum = 0;
		for(int i = 1; i < x.length; i = i + 2)
		{
			sum += x[i];
		}
		System.out.println("sum:" + sum);
    }
}