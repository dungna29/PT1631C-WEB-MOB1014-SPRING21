/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAI2_ToanTu_CauLenhReNhanh;

import java.util.Scanner;

/**
 *
 * @author Dungna29
 */
public class B8_ToanTuBaNgoi {

    /*
       Cách sử dụng:
        <Biểu thức> ? <Giá trị true> : <Giá trị false>;
        <Biểu thức>: Có thể có 1 hoặc nhiều biểu thức
        <Giá trị true>: Luôn nằm sau dấu ? và phụ thuộc vào kiểu dữ liệu của biến.
        <Giá trị false>: Luôn nằm sau dấu :
    
     */
    public static void main(String[] args) {
        //Sử dụng toán tử 3 ngôi       
        String temp1 = 9 > 10 ? "Đúng" : "Sai rồi";
        System.out.println(temp1);
        //Nhìn vào toán tử 3 ngôi ở trên có thể viết theo cách IF ELSE
        if (9 > 10) {
            System.out.println("Đúng");
        } else {
            System.out.println("Sai rồi");
        }
        //Các ví dụ khác về toán tử 3 ngôi:
        int temp2 = 9 > 10 ? 1 : 0;
        float temp3 = 9 > 10 ? 1.0f : 0.5f;
        boolean temp4 = 9 > 10 ? true : false;
        String temp5 = (9 > 10) && (3 > 3) || (5 > 5) ? "Đúng" : "Sai rồi";

        //Ví dụ đăng nhạp vào chương trình
        while (true) {            
            String user = "admin", pass = "123", inputUser, inputPass;
            Scanner sc = new Scanner(System.in);
            System.out.print("User : ");
            inputUser = sc.nextLine();
            System.out.print("Pas : ");
            inputPass = sc.nextLine();
            String result = (inputUser.equals(user) && inputPass.equals(pass))
                    ? "Đăng nhập thành công" : "Đăng nhập thất bại";
            System.out.println(result);
        }
    }
}
