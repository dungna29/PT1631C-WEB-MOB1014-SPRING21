/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAI_TAP_MAU;

import java.util.Scanner;

/**
 *
 * @author Dungna29
 */
public class BAI_MAU_Method {

    static int input, a, b;
    static Scanner sc = new Scanner(System.in);

    /*
        Code lại bài chương trình máy tính của 2 số
     */
    public static void main(String[] args) {
        while (true) {

            switchCase();
        }
    }

    static void menu() {
        System.out.println(
                "Chương trình máy tính POLY");
        System.out.println(
                "1. Phép cộng");
        System.out.println(
                "2. Phép trừ");
        System.out.println(
                "3. Phép nhân");
        System.out.println(
                "4. Phép chia");

    }

    static void switchCase() {
        menu();
        System.out.print(
                "Mời bạn chọn chức năng: ");
        input = sc.nextInt();
        switch (input) {
            case 1:
                nhapHaiSo();
                congHaiSo(a, b);
                System.out.println(congHaiSo());
                break;
            case 2:
                nhapHaiSo();
                break;
            case 3:
                nhapHaiSo();
                break;
            case 4:
                nhapHaiSo();
            default:
        }
    }

    static void nhapHaiSo() {
        System.out.print("Mời bạn nhập số a: ");
        a = sc.nextInt();
        System.out.print("Mời bạn nhập số b: ");
        b = sc.nextInt();
    }

    static void congHaiSo(int a, int b) {
        System.out.println(a + b);
    }

    static double congHaiSo() {
        return a + b;
    }

}
