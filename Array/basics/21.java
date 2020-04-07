//Read only even indexed elements from an array
public class Main
{
    public static void main(String gg[])
    {
		int[] x = {3, 6, 1, 10, 4, 6, 9, 12};
		for(int i = 0; i < x.length; i += 2)
		{
			System.out.print(x[i] + ", ");
		}

    }
}