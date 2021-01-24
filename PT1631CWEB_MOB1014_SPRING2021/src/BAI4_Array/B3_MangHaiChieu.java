/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAI4_Array;

import java.util.Scanner;

/**
 *
 * @author Dungna29
 */
public class B3_MangHaiChieu {

    /*
        Mảng 2 chiều - Mảng đa chiều ()
        
    - Công thức: <kiểu dữ liệu>[][] arr + <tên> = new <kiểu dữ liệu>[row][col];
        - [row]: Số lượng dòng kiểu số nguyên
        - [col]: Số lượng cột kiểu số nguyên
     */
    public static void main(String[] args) {
        //1. Khai báo
        String[][] arrName = new String[2][3];//Mảng 2 chiều 2 dòng 3 cột
        String[][] arrName1;//Khai báo
        arrName1 = new String[5][6];
        
        //2. Gán giá trị:
        //Gán dòng số 1
        arrName[0][0] = "FPT";
        arrName[0][1] = "FPT1";
        arrName[0][2] = "FPT2";
        
        //Gán dòng số 2
        arrName[1][2] = "FPT3";
        //3. Lấy giá trị
        System.out.println(arrName[1][2]);
        //Dùng vòng lặp để lấy giá trị
        for (int i = 0; i < 2; i++) {//Vòng lặp i đại diện cho row
            for (int j = 0; j < 3; j++) {//Vòng lặp h đại diện cho col
                System.out.print(arrName[i][j] + " ");
            }
            System.out.println("");
        }
      
        
        //Ví dụ mẫu: Cho người dùng tạo mảng 2 chiều theo ý người dùng
        Scanner sc = new Scanner(System.in);
        int[][] arrNumberInput;//Khởi tạo 1 mảng
        int row, col;
        System.out.println("Chương trình mảng 2 chiều");
        System.out.print("Mời bạn nhập số lượng row? : ");
        row = sc.nextInt();
        System.out.print("Mời bạn nhập số lượng col? : ");
        col = sc.nextInt();

        //Khởi tạo mảng theo giá trị người dùng nhập vào
        arrNumberInput = new int[row][col];

        //Nhập dữ liệu vào mảng 2 chiều
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.printf("Mời bạn nhập giá trị tại row: %d | col: %d = ", i, j);
                arrNumberInput[i][j] = sc.nextInt();
            }
        }
        //Xuất dữ liệu
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.printf("\n Giá trị tại row: %d | col: %d = %d",
                        i, j, arrNumberInput[i][j]);
            }
        }
    }
}
