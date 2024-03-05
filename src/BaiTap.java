import java.util.Scanner;

public class BaiTap
{
    public static void main(String[] args)
    {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Nhập số dòng của tam giác");
//        int n = Integer.parseInt(scanner.nextLine());
//        IsoscelesTriangle(n);

//        PrimeSmallerThan100();

        First20Prime();

//        Divide_5_7_11();
    }

    //Tam giác cân
    static void IsoscelesTriangle(int n)
    {
        for (int i = n; i >= 1; i--)//Vẽ tam giác từ dưới đáy lên đỉnh
        {
            for (int j = 1; j <= n - i; j++)//Mỗi vòng lặp sẽ cách vào số khoảng trắng là n-i
            {
                System.out.print("   ");//Số lượng kí tự cách vào phải bằng nhau (3 ký tự)
            }
            for (int k = 2 * i - 1; k >= 1; k--)//Mỗi vòng lặp sẽ viết ra số dấu * = 2i-1
            {
                System.out.print(" * ");//Số lượng kí tự cách vào phải bằng nhau
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 1; i <= n; i++)
        {
            for (int j = n - i; j >= 1; j--)
            {
                System.out.print("   ");//Số lượng kí tự cách vào phải bằng nhau (3 ký tự)
            }
            for (int k = 2 * i - 1; k >= 1; k--)
            {
                System.out.print(" * ");//Số lượng kí tự cách vào phải bằng nhau
            }
            System.out.println();
        }
    }

    //Prime number
    static void PrimeSmallerThan100()
    {
        for (int i = 2; i < 100; i++)
        {
            boolean isPrime = true;
            if (i == 2)
            {
                System.out.println(i + " là số nguyên tố");
                continue;
            }
            for (int j = 2; j < i; j++)
            {
                if (i % j == 0)
                {
                    isPrime = false;
                }
            }
            if (isPrime)
                System.out.println(i + " là số nguyên tố");
        }
    }

    //20 first Prime number
    static void First20Prime()
    {
        int count = 1;
        int i = 2;
        while (count < 20)
        {
            boolean isPrime = true;
            if (i == 2)
            {
                System.out.println(i + " là số nguyên tố");
                i++;
                continue;
            }
            for (int j = 2; j <= Math.sqrt(i); j++)
            {
                if (i % j == 0)
                {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime)
            {
                count++;
                System.out.println(i + " là số nguyên tố");
            }
            i++;
        }
    }

    //Divisible by 5, 7, 11
    static void Divide_5_7_11()
    {
        int i = 1;
        boolean found = false;
        while (!found)
        {
            i++;
            if (i % 5 != 0)
                continue;
            if (i % 7 != 0)
                continue;
            if (i % 11 != 0)
                continue;
            found = true;
        }
        System.out.println(i + " là số nguyên dương nhỏ nhất chia hết cho 5, 7 và 11");
    }

    //Menu
    static void Menu()
    {
        while (true)
        {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Nhập số nguyên bất kỳ");
            int input = Integer.parseInt(scanner.nextLine());
            System.out.println("============Menu============");
            System.out.println("1. Kiểm tra tính chẵn lẻ");
            System.out.println("2. Kiểm tra số nguyên tố");
            System.out.println("3. Kiểm tra chia hết cho 3");
            System.out.println("4. Thoát");
            System.out.println("Nhập lựa chọn");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice)
            {
                case 1:
                    if (input % 2 == 0)
                        System.out.println(input + " là số chẵn");
                    else System.out.println(input + " là số lẻ");
                    break;
                case 2:
                    boolean isPrime = true;
                    for (int i = 2; i < input; i++)
                    {
                        if (input == 2)
                        {
                            System.out.println(input + " là số nguyên tố");
                            break;
                        }
                        if (input % i == 0)
                        {
                            isPrime = false;
                        }
                    }
                    if (isPrime)
                        System.out.println(input + " là số nguyên tố");
                    else System.out.println(input + " không phải là số nguyên tố");
                    break;
                case 3:
                    if (input % 3 == 0)
                        System.out.println(input + " chia hết cho 3");
                    else System.out.println(input + " không chia hết cho 3");
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Mời nhập lại");
                    break;
            }
        }
    }

    //Calculate area and perimeter
    static void CalcPeriArea()
    {
        while (true)
        {
            Scanner scanner = new Scanner(System.in);
            System.out.println("============Menu============");
            System.out.println("1. Tính hình tròn");
            System.out.println("2. Tính hình chữ nhật");
            System.out.println("3. Tính tam giác");
            System.out.println("4. Thoát");
            System.out.println();
            System.out.println("Nhập lựa chọn");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice)
            {
                case 1:
                    System.out.println("Nhập bán kính hình tròn");
                    double r = Double.parseDouble(scanner.nextLine());
                    final double PI = 3.14d;
                    System.out.println("Chu vi hình tròn là: " + (PI * 2 * r));
                    System.out.println("Diện tích hình tròn là: " + (PI * r * r));
                    break;
                case 2:
                    System.out.println("Nhập chiều dài hình chữ nhật");
                    double a = Double.parseDouble(scanner.nextLine());
                    System.out.println("Nhập chiều rộng hình chữ nhật");
                    double b = Double.parseDouble(scanner.nextLine());
                    System.out.println("Chu vi hình chữ nhật là: " + (a + b) * 2);
                    break;
                case 3:
                    double canh1, canh2, canh3;

                    boolean isTriangle = true;
                    do
                    {
                        System.out.println("Nhập độ dài cạnh 1 tam giác");
                        canh1 = Double.parseDouble(scanner.nextLine());
                        System.out.println("Nhập độ dài cạnh 2 tam giác");
                        canh2 = Double.parseDouble(scanner.nextLine());
                        System.out.println("Nhập độ dài cạnh 3 tam giác");
                        canh3 = Double.parseDouble(scanner.nextLine());
                        if (canh1 + canh2 <= canh3 || canh2 + canh3 <= canh1 || canh3 + canh1 <= canh2)
                        {
                            isTriangle = false;
                            System.out.println("Vui lòng nhập lại, " +
                                    "tam giác là hình có tổng 2 cạnh luôn lớn hơn cạnh còn lại");
                        } else isTriangle = true;
                    } while (!isTriangle);
                    double p = (canh1 + canh2 + canh3) / 2;
                    System.out.println("Chu vi tam giác là: " + p * 2);
                    System.out.println("Diện tích tam giác là: " + Math.sqrt(p * (p - canh1) * (p - canh2) * (p - canh3)));
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Mời nhập lại");
                    break;
            }

        }
    }

    //Validate Triangle Input
    static void ValidateTriangle()
    {
        Scanner scanner = new Scanner(System.in);
        double canh1, canh2, canh3;
        boolean isTriangle = true;

        do
        {
            System.out.println("Nhập độ dài cạnh 1 tam giác");
            canh1 = Double.parseDouble(scanner.nextLine());
            System.out.println("Nhập độ dài cạnh 2 tam giác");
            canh2 = Double.parseDouble(scanner.nextLine());
            System.out.println("Nhập độ dài cạnh 3 tam giác");
            canh3 = Double.parseDouble(scanner.nextLine());
            if (canh1 + canh2 <= canh3 || canh2 + canh3 <= canh1 || canh3 + canh1 <= canh2)
            {
                isTriangle = false;
                System.out.println("Vui lòng nhập lại, " +
                        "tam giác là hình có tổng 2 cạnh luôn lớn hơn cạnh còn lại");
            } else isTriangle = true;
        } while (!isTriangle);
        double p = (canh1 + canh2 + canh3) / 2;
        System.out.println("Chu vi tam giác là: " + p * 2);
        System.out.println("Diện tích tam giác là: " + Math.sqrt(p * (p - canh1) * (p - canh2) * (p - canh3)));
    }
}
