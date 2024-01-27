import java.util.Scanner;

class Main{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int totalElements = sc.nextInt();
        int[] arr = new int[totalElements];

        //Read the elements
        System.out.println("Enter "+totalElements+" Elements..");
        for(int i = 0; i < totalElements; i++)
        {
            arr[i] = sc.nextInt();
        }

        //Read the search the element
        System.out.print("Enter the value to search for: ");
        int valueToSearch = sc.nextInt();

        //Perform Linear Search
        int resultIndex = linearSearch(arr, valueToSearch);

        if (resultIndex > -1)
        {
            System.out.println("Value found in the array at index: " + resultIndex);
        }
        else
        {
            System.out.println("Value not found the in the array");
        }
    }
    public static int linearSearch(int[] arr, int valueToSearch)
    {
        for(int i = 0; i < arr.length; i++)
        {
            if (arr[i] == valueToSearch)
            {
                return i;
            }
        }
        return -1;
    }
}
