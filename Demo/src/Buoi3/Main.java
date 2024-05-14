package Buoi3;

import java.util.Scanner;

public class Main { public static void main(String[] args) {
    int x;
    System.out.println("Bạn muốn tính trung bình cộng bao nhiêu số: ");
    Scanner sc = new Scanner(System.in);
    x = sc.nextInt();
    int []a = new int[x];
    for (int i = 0; i < x; i++) {
        System.out.println("Nhập số thứ "+(i+1)+" : ");
        a[i] = sc.nextInt();
    }
    int tong=0;
    for (int i = 0; i < x; i++) {
        tong += a[i];
    }
    System.out.println("Trung bình cộng của các số bạn vừa nhập là : "+(tong/x));


    int y;
    System.out.println("Bạn muốn mảng có bao nhiêu phần tử: ");
    y = sc.nextInt();
    int []b = new int[y];
    int tongMang=0;
    for (int i = 0; i < y; i++) {
        System.out.println("Nhập số thứ "+(i+1)+" : ");
        b[i] = sc.nextInt();
        tongMang += b[i];
    }
    System.out.println("Tổng các phần tử trong mảng : "+tongMang);

}
}
