//print whole array using foreach loop
public class Main
{
    public static void main(String gg[])
    {
        //non generalized way to assign array
        int a[] = {44,55,56,78,9};
        //print array element by using foreacg loop
        System.out.println("all array elements is : ");
        for(int element : a)
        {
            System.out.println(element);
        }

    }
}