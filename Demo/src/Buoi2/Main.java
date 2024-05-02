package Buoi2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a, b;
        //Bài 1.1 cộng 2 số
        System.out.println("Mời nhập số a");
        a = scanner.nextInt();
        System.out.println("Mời nhập số b");
        b = scanner.nextInt();
        System.out.println("Tổng của số a và b là " + a + "+" + b + "=" + (a + b));
        //Bài 1.2 kiểm tra chẵn lẽ
        System.out.println("Mời nhập số x");
        int x = scanner.nextInt();
        if (x % 2 == 0) {
            System.out.println("Số x=" + x + " là số chẵn");
        } else {
            System.out.println("Số x=" + x + " là số lẻ");
        }
        //Bài 1.3 nhân 2 số
        System.out.println("Mời nhập số a");
        a = scanner.nextInt();
        System.out.println("Mời nhập số b");
        b = scanner.nextInt();
        System.out.println("Tích của số a và b là " + a + "*" + b + "=" + (a * b));
        //Bài 1.4 kiểm tra năm nhuận
        System.out.print("Nhập năm: ");
        int year = scanner.nextInt();
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println("Năm " + year + " là năm nhuận");
        } else {
            System.out.println("Năm " + year + "là năm không phải là năm nhuận");
        }
        //Bài 1.5 kiểm tra nguyên âm phụ âm
        System.out.print("Nhập kí tự: ");
        char z = scanner.next().charAt(0);
        boolean kq = false;
        switch (z) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                kq = true;
        }
        if (kq == true) {
            System.out.println(z + " Là nguyên âm");
        } else {
            System.out.println(z + " Là phụ âm");
        }
        //Bài 1.6 Tính lãi suất (p+r+t)/100
        System.out.println("Mời nhập số tiền gốc: ");
        int p = scanner.nextInt();
        System.out.println("Mời nhập số tiền lại suất:");
        float r = scanner.nextFloat();
        System.out.println("Mời nhập số năm:");
        int t = scanner.nextInt();
        System.out.println("Lãi suất là "+((p*r*t)/100));
        //Bài 1.7 chương trình tìm phần nguyên và phần dư
        System.out.println("Mời nhập số bị chia");
        int a1 = scanner.nextInt();
        System.out.println("Mời nhập số chia");
        int b1 = scanner.nextInt();
        System.out.println(a1+"/"+b1+"có phần nguyên là "+(a1/b1)+" có phần dư là "+(a1%b1));
    }
}
