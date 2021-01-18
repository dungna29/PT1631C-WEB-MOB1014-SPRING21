/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAI3_VongLap;

import java.util.Scanner;

/**
 *
 * @author Dungna29
 */
public class B3_VongLap_For {

    /*
        Cách gõ: for + tab
        Công thức:
         for (int i = 0; i < 10; i++) {

            }
    int i = 0: Điểm bắt đầu của vòng lặp có kiểu số nguyên
    i < 10: Điều kiện để ngắt vòng
    i++: Tăng bước nhẩy lên 1
     */
    public static void main(String[] args) {
        //In 5 lần
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        //So sánh với while
        int i = 0;
        while (i < 10) {
            System.out.println(i);
            i++;
        }

        //Bảng cửu chương for
        int input = 8;
        for (int j = 1; j <= 9; j++) {
            System.out.printf("%d x %d = %d \n", input, j, input * j);
        }

        //Bảng cửu chương với While
        int m = 1;
        while (m <= 9) {
            System.out.printf("%d x %d = %d \n", input, m, input * m);
            m++;
        }

        //In full cửu chương dùng do While
        System.out.println("----------------");
        int a = 1, b = 1;
        do {
            System.out.println("Bảng nhân: " + a);
            do {
                System.out.printf("%d x %d = %d \n", a,b, a * b);
                b++;
            } while (b <=9);
            a++;
            b = 1;//Reset b về 1
        } while (a <=10);

    }
}
