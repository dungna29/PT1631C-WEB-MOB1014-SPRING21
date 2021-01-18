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
public class B2_VongLap_Do_While {

    /*
     Vòng lặp Do..While: Thực hiện hành động ít nhất là 1 lần. Điều kiện đề vòng lặp chạy giống như While(True).
    
    Cách gõ: do + tab
    Công thức: 
    do {
            //Thực hiện hành động ít nhất là 1 lần.
        } while (true);
     */
    public static void main(String[] args) {
        do {
            System.out.println("Ít nhất chạy 1 lần");
        } while (false);

        //In 5 lần
        int flag = 0;
        do {
            System.out.println(flag);
            flag++;
        } while (flag <= 5);

    }
}
