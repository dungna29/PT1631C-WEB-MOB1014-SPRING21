/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAI4_Array;

/**
 *
 * @author Dungna29
 */
public class B4_ThuatToanSapXepNoiBot {

    /*
        Thuật toán sắp xếp nổi bọt
     */
    public static void main(String[] args) {
        int[] arrNumber = {88, 77, 55, 22, 11};

        //        for (int i = 0; i < arrNumber.length; i++) {
        //            for (int j = i + 1; j < arrNumber.length; j++) {
        //                if (arrNumber[i]>arrNumber[j]) {
        //                    int temp = arrNumber[i];
        //                    arrNumber[i] = arrNumber[j];
        //                    arrNumber[j]= temp;
        //                }
        //            }
        //        }
        for (int i = 0; i < arrNumber.length -1; i++) {
            System.out.println("Lần chay thứ: " + i);
            for (int x : arrNumber) {
                System.out.print(x + " ");
            }
            System.out.println("");
            for (int j = i + 1; j < arrNumber.length; j++) {
                System.out.printf("Điều kiện %d > %d \n", arrNumber[i], arrNumber[j]);
                if (arrNumber[i] > arrNumber[j]) {
                    int temp = arrNumber[i];
                    arrNumber[i] = arrNumber[j];
                    arrNumber[j] = temp;
                    System.out.printf("Hoán vị của: %d & %d \n",arrNumber[i], arrNumber[j]);
                    for (int x : arrNumber) {
                        System.out.print(x + " ");
                    }
                    System.out.println("");
                }
            }
        }
        
        System.out.println("Kết quả cuối cùng");
        for (int x : arrNumber) {
            System.out.print(x + " ");
        }
    }
}
