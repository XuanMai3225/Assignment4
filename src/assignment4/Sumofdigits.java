package assignment4;

import java.util.Scanner;

public class Sumofdigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter integer n: ");
        int n = scanner.nextInt();
        int sum = 0;   //Khởi tạo để lưu
        while(n != 0){
            int digit = n % 10;    //lấy chữ sô cuối cùng
            sum += digit;
            n /= 10;   // loại bỏ chữ số cuối cùng
        }
        System.out.println("Sum of digits: " +sum);
        scanner.close();
    }
}
