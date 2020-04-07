//print whole array using for loop
public class Main
{
    public static void main(String gg[])
    {
        //non generalized way to assign array
        int a[] = {44,55,56,78,9};
        //print array element by using for loop
        //by using for loop we can traverse into array 
        //by using length property of object class its easy to determine the length of the array
        System.out.println("all array elements is : ");
        for(int i = 0 ; i < a.length ; i++)
        {
            System.out.println(a[i]);
        }

    }
}