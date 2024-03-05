public class Test
{
    public static void main(String[] args)
    {
        int[] array1 = {1, 2, 3};
        int[] array2 = new int[3];
        array2[0] = 1;
        array2[1] = 2;
        array2[2] = 3;
        for (int i : array1)
        {
            System.out.println("Array 1 outside " + i);
        }
        Test1(array1);
        for (int i : array1)
        {
            System.out.println("Array 1 after Test1 " + i);
        }

        for (int i : array2)
        {
            System.out.println("Array 2 outside " + i);
        }
        Test2(array2);
        for (int i : array2)
        {
            System.out.println("Array 2 after Test 2 " + i);
        }
        Test3(array2);
        for (int i : array2)
        {
            System.out.println("Array 2 after Test 3 " + i);
        }
    }

    static void Test1(int[] arr)
    {
        arr[0] = 4;
        arr[1] = 5;
        arr[2] = 6;
        for (int i : arr)
        {
            System.out.println("Inside Test1 " + i);
        }
    }

    static void Test2(int[] arr)
    {
        int[] newArr = new int[]{4, 5, 6};
        arr = newArr;
        for (int i : arr)
        {
            System.out.println("Inside Test2 " + i);
        }
    }

    static void Test3(int[] arr)
    {
        arr = new int[3];
        arr[0] = 4;
        arr[1] = 5;
        arr[2] = 6;
    }
}
