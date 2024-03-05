import java.util.Scanner;

public class Demo
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Nhập số");
//        int input = Integer.parseInt(scanner.nextLine());
//        for(int i = 1; i < 11; i++)
//        {
//            System.out.printf("%d * %d = %d",input,i, input*i);
//            System.out.println();
//        }

        while (true)
        {
            System.out.println("Nhập số nguyên bất kỳ");
            int input = Integer.parseInt(scanner.nextLine());
            System.out.println("============Menu============");
            System.out.println("1. Tìm các ước của số vừa nhập");
            System.out.println("2. Tính tổng các ước của số vừa nhập");
            System.out.println("3. Tìm các số chia hết cho 3 và 5 trong khoảng 1 => n (n là số vừa nhập)");
            System.out.println("4. Thoát");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice)
            {
                case 1:
                    FindDivisor(input);
                    break;
                case 2:
                    System.out.println("Tổng các ước là " + SumOfDivisor(input));
                    break;
                case 3:
                    DivisibleBy3And5(input);
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Mời nhập lại lựa chọn từ 1-4");
                    break;
            }
        }
    }
    static void FindDivisor(int n)
    {
        for(int i = 1; i <=n; i++)
        {
            if(n % i == 0)
            {
                System.out.printf("Ước của số %d là %d \n",n, i);
            }
        }
    }
    static int SumOfDivisor(int n)
    {
        int sum = 0;
        for(int i = 1; i <=n; i++)
        {
            if(n % i == 0)
            {
                sum += i;
            }
        }
        return sum;
    }
    static void DivisibleBy3And5(int n)
    {
        for(int i = 1; i <=n; i++)
        {
            if(i % 3 == 0 && i % 5 == 0)
            {
                System.out.println("Số chia hết cho 3 và 5 là " + i);
            }
        }
    }
}
