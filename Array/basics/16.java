//Find out the min value from a second half of given int array
public class Main
{
    public static void main(String gg[])
    {
   		int[] x = {3, 6, 1, 0, 4, 6, 9};
		//middle in the first half.
		int min = x[(x.length/2) + 1];
		for(int i = (x.length/2) + 2; i < x.length; i++)
		{
			if(x[i] < min)
			{
				min = x[i];
			}
		}
		System.out.println("min in the 2nd half:" + min);
    }
}