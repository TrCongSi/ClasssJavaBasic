package Buoi4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //4.2 kiểm tra số nguyên tố
        int x;
        System.out.println("Mời nhập số x :");
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        boolean oke = true;
        if (x <= 1) {
            oke = false;
        } else {
            for (int i = 2; i <= Math.sqrt(x); i++) {
                if (x % i == 0) {
                    oke = false;
                    break;
                }
            }
        }
        if (!oke) {
            System.out.println(x + " không phải là số nguyên tố");
        } else System.out.println(x + " là số nguyên tố");

        //4.3 kiểm tra số chính phương
        int y;
        System.out.println("Mời nhập số y :");
        y = sc.nextInt();
        boolean ok=false;
        for (int i = 1; i <= Math.sqrt(y); i++) {
            if (i * i == y) {
                ok = true;
                break;
            }
        }
        if (ok){System.out.println(y + " là số chính phương");
        }
        else System.out.println(y + " không phải là số chính phương");

        //4.5 tìm số nhỏ nhất bằng toán tử 3 ngôi
        int a,b;
        System.out.println("Mời nhập số a :");
        a = sc.nextInt();
        System.out.println("Mời nhập số b :");
        b = sc.nextInt();
        System.out.println("Số nhỏ nhất giữa 2 số là "+Math.min(a, b));

    }

}
