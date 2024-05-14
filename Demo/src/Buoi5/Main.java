package Buoi5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //5.1 DT hình chữ nhật
        int a,b;
        System.out.println("mời nhập chiều dài hcn ");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        System.out.println("mời nhập chiều rộng hcn ");
        b = sc.nextInt();
        System.out.println("diện tích hcn là "+(a*b));
        //5.2  DT và chu vi hình vuông
        System.out.println("mời nhập chiều dài hình vuông ");
        int c = sc.nextInt();
        System.out.println("diện tích hình vuông là "+(c*c));
        System.out.println("chu vi hình vuông là "+(c*4));
        //DT hình tam giác
        System.out.println("mời nhập chiều dài cạnh 1 ");
        int a1 = sc.nextInt();
        System.out.println("mời nhập chiều dài cạnh 2 ");
        int b1 = sc.nextInt();
        System.out.println("mời nhập chiều dài cạnh 3 ");
        int c1 = sc.nextInt();
        double s = (a1 + b1 + c1) / 2.0;
        System.out.println("diện tích hình tam giác là "+(Math.sqrt(s * (s - a) * (s - b) * (s - c))));
        //DT hình tròn
        System.out.println("mời nhập bán kính hình tròn ");
        int r = sc.nextInt();
        System.out.println(" diện tích hình tròn là "+(Math.PI * r * r));
        System.out.println(" chu vi hình tròn là "+(2 * Math.PI * r));
    }
}
