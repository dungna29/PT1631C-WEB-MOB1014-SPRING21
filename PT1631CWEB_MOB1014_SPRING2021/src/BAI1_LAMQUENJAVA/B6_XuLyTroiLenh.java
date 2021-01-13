package BAI1_LAMQUENJAVA;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dungna29
 */
public class B6_XuLyTroiLenh {
    /*
        Bài 1: Chương trình cho phép nhập họ và tên sinh viên, năm sinh, mã sinh viên 
        từ bàn phím và xuất ra định dạng sau: 
	“Chào bạn <<họ và tên>> | <<năm sinh>>  | <<mã sinh viên>> 
        đến với chương trình java đầu tiên.”
    */
    public static void main(String[] args) {
        //Bước 1: Xác định số lượng biến - Khởi tạo các lớp
        Scanner sc = new Scanner(System.in);
        String ten,msv;
        int ns;
        //Bước 2: Gán giá trị
        System.out.print("Mời bạn nhập tên: ");
        ten = sc.nextLine();
        System.out.print("Mời bạn nhập tuổi: ");
        //ns = sc.nextInt();
        
        //Bị trôi lệnh khi sử dụng next<Số>() nếu đằng sau nó là nextLine();
        //Có 2 cách xử lý trôi lệnh
        
        //Cách 1: chèn 1 sc.nextLine(); phía sau
        //sc.nextLine();
        
        //Cách 2: Hay sử dụng nhất
        ns = Integer.parseInt(sc.nextLine());//Ép kiểu từ String về số
        System.out.print("Mời bạn nhập mã sinh viên: ");
        msv = sc.nextLine();
        //Bước 3: Xử lý nghiệp vụ
        System.out.printf("Tên: %s | Năm sinh: %d | Msv: %s",ten,ns,msv);
    }
}
