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
public class BAI_TAP_LAB1 {
    /*
    Bài 1  - Viết chương trình cho phép nhập dữ liệu từ bàn phím theo các ý sau:
                
        1.1 Chương trình cho phép nhập họ và tên sinh viên, năm sinh, 
        mã sinh viên từ bàn phím và xuất ra định dạng sau: 
        “Chào bạn <<họ và tên>> | <<năm sinh>>  | <<mã sinh viên>> đến với chương trình java đầu tiên.”
        1.2 Chương trình nhập 1 cạnh của hình vuông. Tính và xuất diện tích, chu vi của hình vuông đó. 
        Công thức tính (S = a² & C= 4a ).
        1.3 Chương trình cho phép nhập vào 2 số bất kỳ và tìm ra số lớn nhất và số nhỏ nhất.
        1.4 Chương trình cho phép nhập vào 1 số và số mũ của số đó để tính lũy thừa của số đó. 
        Gợi ý (Math.pow(x,y)).
        1.5 Chương trình cho phép nhập bán kính hình tròn và tính diện tích và chu vi hình 
        tròn sau đó xuất ra màn hình. Công thức tính (Chu Vi = 2*pi*r và Diện Tích = pi*r*r)Pi = 3.14;
    
    Bài 2: 
        2.1 Viết 1 chương trình đánh giá tình trạng học lực của sinh viên POLY sau khi thi. Yêu cầu sinh viên nhập vào các
    thông tin sau: Số buổi nghỉ, Điểm trung bình môn, Điểm thi. Sau khi sinh viên nhập xong in ra màn hình tình
    trạng sinh viên dựa vào điều kiện sau. Nếu Số buổi nghỉ <= 4 và Điểm trung bình môn >=5 và Điểm thi >=5. Thì
    chúc mừng sinh viên đó đã qua môn. Còn nếu ngược lại cả 3 điều kiện trên thì phải học lại môn JAVA 1.
        2.2 Viết 1 chương trình tính tuổi người yêu cũ và bản thân mình. Yêu cầu người sử dụng nhập vào năm sinh của bản thân
    và năm sinh của người yêu cũ. Sau khi nhập xong 2 thông tin này hãy tính ra số tuổi của 2 người in ra màn hình và in ra
    2 người cách nhau bao nhiêu tuổi.

    */
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);        
        String name1 = "fpt",name2;
        System.out.println("Mời bạn nhập tên số 2: ");
        name2 = sc.nextLine();
        if (name1.equals(name2)) {//Đối với việc so sánh 2 String với nhau thì không sử dụng toán tử  == mà sử dụng equals
            System.out.println("2 bế String này bằng nhau");
        }
    }
}
