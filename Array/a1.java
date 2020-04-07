//get all element of array from user as well as size of the array
import java.util.Arrays;
import java.util.Scanner;
public class Main
{
    public static void main(String gg[])
    {   
        Scanner sc = new Scanner(System.in);
        //get the size of array form the user .
        System.out.print("Enter size of array : ");
        int size  = sc.nextInt();
        //declaration of array of specific size and get array elements from the user.
        int arr[] = new int[size];
        for(int i = 0; i<size; i++)
        {
            System.out.print("enter element of the array : ");
            arr[i] = sc.nextInt();
        }
        System.out.println("all array elements is : ");
        System.out.println(Arrays.toString(arr));
    }
}