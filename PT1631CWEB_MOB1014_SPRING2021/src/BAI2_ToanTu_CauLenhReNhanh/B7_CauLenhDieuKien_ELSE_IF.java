/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAI2_ToanTu_CauLenhReNhanh;

/**
 *
 * @author Dungna29
 */
public class B7_CauLenhDieuKien_ELSE_IF {

    /*
        ELSE IF sử dụng trong trường hợp bài toán có nhiều điều kiện khác nhau và sẽ
        thực hiện những hành động cũng khác nhau.
        
        Lưu ý: ELSE IF(TRUE) phải luôn đúng thì mới thỏa mãn vào bên trong nó tương tự như IF
        . Nhưng chỉ vào 1 điều kiện thỏa mãn không vào nhiều IF hoặc ELSE IF khi sử dụng.
        
        if (true) {
            //Thỏa mãn điều kiện IF(True)
            Thực hiện 1 hành động nào đó
        }
        else if (true) {
           //Khi IF không thỏa mãn thì mới tiếp tục đến Else IF(True)
           Thực hiện 1 hành động nào đó
        }
        else if (true) {
           //Khi IF không thỏa mãn thì mới tiếp tục đến Else IF(True)
           Thực hiện 1 hành động nào đó
        }else{
            Khi tất cả các trường hợp trên không thỏa mãn thì sẽ vào đây.
        }
     */
    public static void main(String[] args) {
        //Ví dụ mẫu về số buổi nghỉ nếu nhỏ hơn 3 thì in ra nên nghỉ tiếp đi
        //Nếu mà nghỉ  <=4 thì in ra nếu nghỉ nữa thì mất 700k.
        byte nghi = 4;
        if (nghi <= 3) {
            System.out.println("Bạn nên nghỉ tiếp vẫn còn 1 buổi nghỉ");
        } else if (nghi <= 4) {
            System.out.println("Nếu bạn nghỉ buổi nữa thì sẽ bị cấm thi");
        } else {
            System.out.println("Chúc mừng bạn đã mất 700k");
        }

        /*
             * Viết 1 chương trình nhập chỉ số cân nặng của người dùng:
             * Cân nặn từ 40 đến 50kg --> Quá gầy
             * Cân nặn từ 51 đến 65kg --> Mức bình thường
             * Cân nặn từ 66 đến 80kg --> Mức hơi mập
             * Cân nặn từ 81 đến 100kg --> Mức béo phì
             * Cân nặn từ 100 đến 200kg --> Mức siêu béo phì 
         */
        double canNang = 40;
        if (canNang <= 50) {

        } else if (canNang <= 65) {

        } else if (canNang <= 80) {

        } else if (canNang <= 100) {

        } else {

        }
    }
}
