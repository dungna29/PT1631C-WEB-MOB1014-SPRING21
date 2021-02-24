/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAI6_TAO_DOI_TUONG_ARRAY_LIST;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author DungNAPC
 */
public class Main {

    Scanner _sc = new Scanner(System.in);

    public static void main(String[] args) {
        Main m = new Main();
        //m.tao2DoiTuong();
        //m.tao1SV();
        m.tao1MangSV();
    }

    //1. Tạo 2 đối tượng bằng contructor không tham số và có tham số
    void tao2DoiTuong() {
        //Contructor có tham số
        SinhVien sv1 = new SinhVien("Dũng", "DungNa", 2000, 4);
        System.out.println(sv1.toString());

        //Contructor không số
        SinhVien sv2 = new SinhVien();
        sv2.setTenSV("Minh");
        sv2.setMaSV("MinhDQ");
        sv2.setNamSinh(2001);
        sv2.setDiemJava(8);
        sv2 = new SinhVien();//Khởi tạo lại đối tượng sv2 sẽ clear hết giá trị của thuộc tính
        System.out.println(sv2.toString());
    }

    //2. Tạo 1 đối tượng do người dùng nhập vào
    void tao1SV() {
        //Cách 1 - sử dụng contructor không tham số
        SinhVien sv1 = new SinhVien();
        System.out.print("Mời bạn nhập tên: ");
        sv1.setTenSV(_sc.nextLine());
        System.out.print("Mời bạn nhập mã: ");
        sv1.setMaSV(_sc.nextLine());
        System.out.print("Mời bạn nhập năm sinh: ");
        sv1.setNamSinh(Integer.parseInt(_sc.nextLine()));
        System.out.print("Mời bạn nhập điểm: ");
        sv1.setDiemJava(Double.parseDouble(_sc.nextLine()));

        //Cách 2:
//        SinhVien sv2;
//        System.out.print("Mời bạn nhập tên: ");
//        String ten = _sc.nextLine();
//        System.out.print("Mời bạn nhập mã: ");
//        String maSv = _sc.nextLine();
//        System.out.print("Mời bạn nhập năm sinh: ");
//        int namsinh = Integer.parseInt(_sc.nextLine());
//        System.out.print("Mời bạn nhập điểm: ");
//        double diem = Double.parseDouble(_sc.nextLine());
//        sv2 = new SinhVien(ten, maSv, namsinh, diem);
        System.out.println(sv1.toString());
    }

    //3. Tạo 1 mảng đối tượng do người dùng nhập vào
    void tao1MangSV() {
        //Bước 1: Khai báo
        int[] arrNumber = new int[5];
        SinhVien[] arrSinhVien;
        int size;

        //Bước 2: Triển khai
        System.out.println("Bạn muốn thêm bao nhiêu SV: ");
        size = Integer.parseInt(_sc.nextLine());
        arrSinhVien = new SinhVien[size];//Khởi tạo kích thước mảng sinh viên
        for (int i = 0; i < size; i++) {
            arrSinhVien[i] = new SinhVien();
            System.out.print("Mời bạn nhập tên: ");
            arrSinhVien[i].setTenSV(_sc.nextLine());
            System.out.print("Mời bạn nhập mã: ");
            arrSinhVien[i].setMaSV(_sc.nextLine());
            System.out.print("Mời bạn nhập năm sinh: ");
            arrSinhVien[i].setNamSinh(Integer.parseInt(_sc.nextLine()));
            System.out.print("Mời bạn nhập điểm: ");
            arrSinhVien[i].setDiemJava(Double.parseDouble(_sc.nextLine()));
        }
        //Bước 3: In 
        for (SinhVien x : arrSinhVien) {
            System.out.println(x.toString());
        }
    }

    //4. Tạo 1 List đối tượng do người dùng nhập vào
    void tao1ListSv() {
        List<SinhVien> lstSinhViens = new ArrayList<>();
        SinhVien sv1;
        int size;

        System.out.println("Bạn muốn thêm bao nhiêu SV: ");
        size = Integer.parseInt(_sc.nextLine());
        for (int i = 0; i < size; i++) {
            sv1 = new SinhVien();
            System.out.print("Mời bạn nhập tên: ");
            sv1.setTenSV(_sc.nextLine());
            System.out.print("Mời bạn nhập mã: ");
            sv1.setMaSV(_sc.nextLine());
            System.out.print("Mời bạn nhập năm sinh: ");
            sv1.setNamSinh(Integer.parseInt(_sc.nextLine()));
            System.out.print("Mời bạn nhập điểm: ");
            sv1.setDiemJava(Double.parseDouble(_sc.nextLine()));
            lstSinhViens.add(sv1);
        }
        
        for (SinhVien x : lstSinhViens) {
            System.out.println(x.toString());
        }
    }
}
