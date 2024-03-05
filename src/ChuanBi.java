import java.util.Scanner;

public class ChuanBi
{
    public static void main(String[] args)
    {
        CalcBMI();
    }
    //LinearEquation
    static void Equation()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Phương trình bậc nhất một ẩn có dạng: a*x + b = 0");
        System.out.println("Nhập số a");
        int a = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập số b");
        int b = Integer.parseInt(scanner.nextLine());
        if(a == 0 && b ==0)
        {
            System.out.println("Vô số nghiệm");
        }
        else if(a == 0 && b !=0)
        {
            System.out.println("Vô nghiệm");
        }
        else
        {
            System.out.println("Một nghiệm: x =" + (-b/a));
        }
    }
    //Days in a month
    static void DayInMonth()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tháng muốn kiểm tra số ngày");
        int month = Integer.parseInt(scanner.nextLine());
        switch (month)
        {
            case 2:
                System.out.println("Tháng 2 có 28 hoặc 29 ngày");
                break;
            case 1, 3, 5, 7, 8, 10, 12:
                System.out.printf("Tháng %d có 31 ngày", month);
                break;
            case 4, 6, 9, 11:
                System.out.printf("Tháng %d có 30 ngày", month);
                break;
            default:
                break;
        }
    }
    //Leap year
    static void LeapYear()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập năm muốn kiểm tra xem có phải năm nhận không");
        int year = Integer.parseInt(scanner.nextLine());
        if(year % 400 == 0)
        {
            System.out.printf("%d là năm nhuận", year);
        }
        else if (year % 4 == 0 && year % 100 != 0)
        {
            System.out.printf("%d là năm nhuận", year);
        }
        else if(year % 100 == 0 && year % 400 != 0)
        {
            System.out.printf("%d không phải là năm nhuận", year);
        }
    }
    //BMI
    static void CalcBMI()
    {
        Scanner scanner = new Scanner(System.in);
        double weight, height, bmi;
        System.out.print("Nhập cân nặng tính theo kg");
        weight = Double.parseDouble(scanner.nextLine());
        System.out.print("Nhập chiều cao tính theo mét");
        height = Double.parseDouble(scanner.nextLine());
        bmi = weight / Math.pow(height, 2);
        System.out.println("Chỉ số BMI là "+ bmi);
        if (bmi < 18)
            System.out.println("Gầy vl");
        else if (bmi < 25.0)
            System.out.println("Bình thường");
        else if (bmi < 30.0)
            System.out.println("Béo");
        else
            System.out.println("Lợn");
    }
    //Loops
    //Prime number
    static void CheckPrime()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số muốn kiểm tra xem có phải số nguyên tố không");
        int input = Integer.parseInt(scanner.nextLine());
        boolean isPrime = false;
        double sqrtInput = Math.sqrt(input);
        if(input == 2 || input == 3)
        {
            System.out.println(input + "là số nguyên tố");
        }
        else
        {
            for(int i = 2; i < sqrtInput; i++)
            {
                if(input%i==0)
                {
                    System.out.println(input + "không phải số nguyên tố");
                    isPrime = false;
                    break;
                }
            }
            isPrime = true;
        }
        if(isPrime)
        {
            System.out.println(input + "là số nguyên tố");
        }
    }
    //Calculate Interest Rate
    static void CalcInterest()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số tiền gửi");
        double deposit = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập lãi suất theo tháng dưới dạng số thập phân");
        double rate = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập số tháng muốn gửi");
        int time = Integer.parseInt(scanner.nextLine());
        double interest = 0;
        for(int i = 0; i < time; i++)
        {
            interest += deposit * rate * time;
        }
        System.out.println("Tổng tiền có được khi rút tiền là " + (deposit + interest));
    }
    //Greatest Common Divisor
    //----------------------------
    //-----------------------------

    //Menu
    static void UserMenu()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("Nhập số 1 để vẽ hình tam giác");
        System.out.println("Nhập số 2 để vẽ hình vuông");
        System.out.println("Nhập số 3 để vẽ hình chữ nhật");
        System.out.println("Nhập số 0 để thoát");
        int input = Integer.parseInt(scanner.nextLine());
        switch (input)
        {
            case 1:
                for(int i = 1; i <= input; i++)
                {
                    for(int j = 1; j <= i; j++)
                    {
                        System.out.print("*");
                    }
                    System.out.print("\n");
                }
                break;
            case 2:
                for (int i = 1; i <= input; i++)
                {
                    for(int j = 1; j <=input; j++)
                    {
                        System.out.print("*");
                    }
                    System.out.print("\n");
                }
                break;
            case 3:
                for(int i = 1; i <=input/2; i++)
                {
                    for(int j = 1; j <= input; j++)
                    {
                        System.out.print("*");
                    }
                    System.out.print("\n");
                }
                break;
            default:
                System.out.println("Thoát chương trình");
                break;
        }
    }
}
