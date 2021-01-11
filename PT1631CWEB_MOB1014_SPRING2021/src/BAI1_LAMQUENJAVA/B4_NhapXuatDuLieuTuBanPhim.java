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
public class B4_NhapXuatDuLieuTuBanPhim {
    /*
       Bài 4: Nhập xuất dữ liệu từ bàn phím
    1. Xuất dữ liệu ra màn hình: In giá trị mặc định hoặc giá của biến ra màn hình
        + Công thức: sout + tab
        + System.out.println(<giá trị hoặc tập giá trị>);
        + System.out.print(<giá trị hoặc tập giá trị>);
        + System.out.printf("Chào các %s bạn đến với năm học %d",value,value);
        + Các % đại diên cho kiểu dữ liệu: %s, %d, %f
    2. Nhập dữ liệu ra màn hình:
        + Sử dụng 1 Class: Scanner sc = new Scanner(System.in);
        + Để đọc dữ liệu thì cần định nghĩa rõ muốn lưu dữ liệu nào khi người dùng nhập.
        + Để lấy giá trị từ bàn phím: sc.next<Kiểu dữ liệu muốn>();
     */
    
    public static void main(String[] args) {
        //1. Xuất dữ liệu ra màn hình: 
        String name = "Duy", monhoc = "JAVA1";
        int year = 2021;
       
              
        System.out.print("Chào bạn " + name + " đến với "+ monhoc);
        System.out.println("2020 ");
        
        // Tham khảo các ký hiệu sau: \n \t
        System.out.printf("Chào bạn %s đến với môn học %s %d ",name,monhoc,year);
   
        //2. Nhập dữ liệu ra màn hình:
        System.out.println("\n ----------------------");
        //Bước 1: Khai báo 1 lớp Scanner
        Scanner sc = new Scanner(System.in);
        //Bước 2: Khai báo biến đến hứng giá trị từ bàn phím nhập vào
        String inputName;
        int inputYear;
        //Bước 3: Mời người dùng nhập vào gia trị bạn muốn.
        System.out.println("Mời bạn nhập tên vào: ");
        inputName = sc.nextLine();//Gàn giá trị khi người dùng nhập vào biến
        System.out.println("Mời bạn nhập vào năm sinh: ");
        inputYear = sc.nextInt();
        //Bước 4: Thực hiện 1 hành động nào đó sau khi lấy dữ liệu xong
        System.out.printf("Chào bạn %s có năm sinh %d",inputName,inputYear);
    }
}
