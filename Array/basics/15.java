//Find out the min value from a first half of given int array
public class Main
{
    public static void main(String gg[])
    {
		int[] x = {3, 6, 1, 0, 4, 6, 9};
		//middle element in the first half
		int min = x[0];
		for(int i = 1; i <= (x.length / 2); i++)
		{
			if(x[i] < min)
			{
				min = x[i];
			}
		}
		System.out.println("min in the first half:" + min);
    }
}