/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai8_XuLyChuoi;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/**
 *
 * @author Nguyen Anh Dung
 */
public class S2_BieuThucChinhQuy {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Mời bạn nhập số nguyên ");
            //int input = sc.nextInt();
            String input = sc.nextLine();
            if (input.equalsIgnoreCase("quit")) {
                break;
            }
  
           
            if (checkSoPattern(input)) {
                System.out.println("Số bạn vừa nhập vào là số nguyên: " + input);
            }else if(checkChuPattern(input)){
                System.out.println("Bạn vừa nhập vào chữ vui lòng nhập lại"); 
            }else{
                System.out.println("Bạn vừa nhập vào ký tự vui lòng nhập lại");
            }

        } while (true);

    }

    static boolean checkSoTuTao(String input) {
        int[] arrNumber = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int x : arrNumber) {
            if (x == Integer.parseInt(input)) {
                return true;
            }
        }
        return false;
    }

    static boolean checkSoPattern(String input) {
        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(input);
        return matcher.matches();
    }
      static boolean checkChuPattern(String input) {
        Pattern pattern = Pattern.compile("\\w+");
        Matcher matcher = pattern.matcher(input); 
        return matcher.matches();
    }
}
