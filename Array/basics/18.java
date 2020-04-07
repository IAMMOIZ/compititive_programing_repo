//Read all elements from an array in the reverse order
public class Main
{
    public static void main(String gg[])
    {
       	int[] x = {3, 6, 1, 10, 4, 6, 9, 12};
		for(int i = x.length - 1; i >= 0; i--)
		{
			System.out.print(x[i] + ", ");
		}
	

    }
}