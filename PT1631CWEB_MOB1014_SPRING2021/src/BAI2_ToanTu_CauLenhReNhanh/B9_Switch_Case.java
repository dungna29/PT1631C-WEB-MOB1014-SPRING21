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
public class B9_Switch_Case {

    /*
       Switch Case là 1 câu lệnh rẽ nhánh
        
       Công thức: sw + tab
    
        switch (<Biểu thức>) {
            case <Giá trị 1>:  
                Thực hiện 1 hành động nào đó
                break; - Sau khi thực hiện 1 hành động xong thì sẽ thoát khỏi Switch
            case <Giá trị 2>:                
                break;
            ..........
            case <Giá trị n>:                
                break;
            default:
                Khi chọn các case không thỏa mãn thì sẽ chạy vào đây                
        }
     */
    public static void main(String[] args) {
        //Viết 1 chương trình gọi món
        Scanner sc = new Scanner(System.in);
        String input;
        System.out.println("Chương trình chọn món ăn POLY");
        System.out.println("a. Phở xào tim cật  - 50k");
        System.out.println("b Phở xào bắp bò  - 55k");
        System.out.print("Mời anh chị chọn món: ");
        input = sc.nextLine();
        switch (input) {
            case "a":
                System.out.println("Bạn phải chờ trong 10p");
                break;
            case "b":
                System.out.println("Bạn phải chờ trong 5p");
                break;
            default:
                System.out.println("Món ăn bạn chọn không tồn tại");
        }

        /*
        Bài 1: Xây dựng 1 chương trình máy tính bỏ túi cho phép toán với 3 số gồm các
        chức năng sau: (Phải sử dụng Switch Case)
            1. Phép cộng
            2. Phép trừ
            3. Phép nhân
            4. Phép chia
         */
    }
}
