//Find the 2nd min element from the given int array
public class Main
{
    public static void main(String gg[])
    {
       	//int[] x = {10, 4, 8, 20, 6, 11, 15};
		int[] x = {1, 4, 8, 20, 6, 3, 11, 15};
		//int[] x = {10, 4, 8, 20, 6, 11, 2, 15};
		int min1 = x[0], min2 = x[0];
		for(int i = 1; i < x.length; i++)
		{
			if(x[i] < min1)
			{
				min2 = min1;
				min1 = x[i];
			}
			else if(x[i] < min2)
			{
				min2 = x[i];
			}
			else if(min1 == min2 && x[i] > min2)
			{
				min2 = x[i];
			}
		}
		System.out.println("min2:" + min2);

    }
}