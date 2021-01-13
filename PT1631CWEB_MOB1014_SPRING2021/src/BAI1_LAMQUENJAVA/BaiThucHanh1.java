/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAI1_LAMQUENJAVA;

import java.util.Scanner;



/**
 *
 * @author Dungna29
 */
public class BaiThucHanh1 {
    /*
        Bài 1: Chương trình cho phép nhập họ và tên sinh viên, năm sinh, mã sinh viên 
        từ bàn phím và xuất ra định dạng sau: 
	“Chào bạn <<họ và tên>> | <<năm sinh>>  | <<mã sinh viên>> 
        đến với chương trình java đầu tiên.”
        
        Bài 2: Viết chương trình máy tính bỏ túi cộng 5 số nguyên sau đó in kết quả
        và những số đó ra màn hình.
        so1 + so2 + so3 + so4 + so5 = kết quả.   
    */
    public static void main(String[] args) {
         //Bước 1: Khai báo biến hoặc thư viện 
         Scanner sc = new Scanner(System.in);
         double diem1,diem2;
         //Bước 2: Triển khai thu thập dữ liệu
         System.out.println("Mời bạn nhập điểm số 1: ");
         diem1 = sc.nextDouble();
         System.out.println("Mời bạn nhập điểm số 2: ");
         diem2 = sc.nextDouble();
         //Bước 3: Xử lý nghiệp vụ theo đầu bài
         System.out.printf("Điểm số 1 = %f và Điểm số 2 = %f",diem1,diem2);  
    }
   
}
     
