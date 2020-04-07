//Read second half of the elements in the reverse direction from an array
public class Main
{
    public static void main(String gg[])
    {
		int[] x = {3, 6, 1, 10, 4, 6, 9, 12};
		for(int i = x.length - 1; i >= x.length/2 ; i--)
		{
			System.out.print(x[i] + ", ");
		}
	

    }
}