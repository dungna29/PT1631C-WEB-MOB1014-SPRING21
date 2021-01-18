/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAI2_ToanTu_CauLenhReNhanh;

/**
 *
 * @author Nguyen Anh Dung
 */
public class Postfix_Prefix {

    public static void main(String[] args) {
        // Khi nhìn thấy toán tử toán học ++ hoặc -- đứng trước biến ++firstVariable --firstVariable các bạn vui lòng cộng lên 1 hoặc giảm 1 ngay cho phép toán
        // Còn khi bạn nhìn thấy ++ hoặc -- đứng sau biến firstVariable++ firstVariable-- các bạn không thực hiện tăng lên hoặc giảm đi ngay trong biểu thức
        int firstVariable = 2, secondVariable = 9, thirdVariable = 3, result;
        result = firstVariable++ + ++secondVariable - ++thirdVariable;
        System.out.println("First variable = " + firstVariable);
        System.out.println("Second variable = " + secondVariable);
        System.out.println("Third variable = " + thirdVariable);
        System.out.println("Result variable = " + result);
    }

}
