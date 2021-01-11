/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAI1_LAMQUENJAVA;

/**
 *
 * @author Dungna29
 */
public class B5_CacHamToanHoc {
       public static void main(String[] args) {
        
        // *********** Toán tử toán học trong Java ***********
        //Thứ tự ưu tiên của toán học 5 +7*2 - 4/2 (Nhân và chia -> Cộng và trừ -> Trái sang phải);
        
        //Ví dụ về thứ tự ưu tiên toán học
        System.out.println(5 + 7 * 2 - 4 / 2); // Nhân chia trước cộng trừ sau
        
        //Lưu ý trong lập trình
        //Toán tử toán học cộng (+) có thể sử dụng để cộng chuỗi String + String = StringString || dung + anh = dunganh

        // *********** Các hàm toán học có sẵn trong java  ***********
        //Math.min(a, b) - Lấy số nhỏ nhất của 2 số a và b (Sử dụng nhiều)
        //Math.max(a, b) - Tính an (a lũy thừa n) (Sử dụng nhiều)
        //Math.sqrt(a)- Tính √𝑎 (căn bậc 2 của a)
        //Math.abs(a) - Lấy giá trị tuyệt đối của a
        //Math.ceil(a) -Lấy số nguyên trên của a
        //Math.floor(a) - Lấy số nguyên dưới của a
        //Math.round(a) - Làm tròn số của a
        //Math.random() - Sinh số ngẫu nhiên từ 0 đến 1 (0.0 and less than 1.0) 
        
        //Ví dụ về hàm Math
        //Tìm giá trị nhỏ nhất và lớn nhất của 2 số sau hoặc bạn bắt 
        //người dùng nhập vào 2 số và chỉ ra số nào lớn nhất hoặc nhỏ nhất         
    
        //Khai báo 2 biến a và b có khởi tạo giá trị ban đầu.
        double a = 7.4, b = 7.7;
        // Sử dụng hàm toán học Math Min để tìm ra số nhỏ nhất trong 2 số a và b trên.
        System.out.println("Số lớn nhất là:" + Math.min(a, b));
        // Sử dụng hàm toán học Math Round để làm tròn số a
        System.out.println(Math.round(a));
        
        
        //Các hàm còn lại các bạn tự lấy ví dụ cho bản thân để nhớ.
        
        
    }
}
