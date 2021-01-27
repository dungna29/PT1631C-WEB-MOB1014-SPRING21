/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAI5_OOP_LapTrinhHuongDoiTuong;

/**
 *
 * @author Dungna29
 */
public class SinhVien1 {//Tên đối tượng bắt buộc phải viết hoa và có từ khóa Class
    
    //Phần 1: Liệt kê tất cả các thuộc tính của đối tượng
    String tenSV;
    String sdt;
    String emai;
    String diachi;    
    int namsinh;
    
    //Phần 2: Hàm tạo Contructor
    
    //Phần 3: Getter và Setter
    
    //Phần 4: Phương thức của đối tượng
    void inRaManHinh(){
        System.out.printf("Chào mừng %s + %s \n",tenSV,sdt);
    }
}
