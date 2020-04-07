//Find out the min value from all even indexed elements from a given int array
public class Main
{
    public static void main(String gg[])
    {
		int min = x[0];	
		int[] x = {100, 4, 8, 20, 6, 11, 15};
		for(int i = 2; i < x.length; i = i + 2)
		{
			if(x[i] < min)
			{
				min = x[i];
			}
		}
		System.out.println("min:" + min);
    }
}