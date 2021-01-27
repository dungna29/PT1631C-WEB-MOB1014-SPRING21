package BAI5_OOP_LapTrinhHuongDoiTuong;

import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Dungna29
 */
public class B3_Method_HamTraVe {

    /*
         * Hàm không trả về công thức và định nghĩa ở bên B2
         *
         * Định nghĩa: Hàm trả về bắt buộc phải trả về 1 giá trị hoặc 1 tập giá trị, 
           đối tượng.... tương ứng với kiểu dữ liệu của hàm.
     */
    public static void main(String[] args) {

        //Coi hàm trả về như là 1 giá trị hoặc đối tượng hoặc tập đối tượng...
        //Đã là giá trị thì phải in nó ra màn hình
        int a = 2022;
        getYear();
        System.out.println(getYear() + 1);

        //Sử dụng hàm trả về dạng tập giá trị
        for (int i = 0; i < getListYears().length; i++) {
            System.out.println(getListYears()[i]);
        }
        //Sử dụng hàm trả về đối tượng
        System.out.println(getSinhVien().tenSV);
        //getSinhVien() = đối tượng sinh viên
        //inRaManHinh() = Phương thức nằm bên trong đối tượng
        getSinhVien().inRaManHinh();
        
    }

    //Hàm trả về không tham số - Hàm trả về kiểu dữ liệu nguyên thủy string,int,double....
    static int getYear() {
        int a = 2022;
        return 2021;
    }

    //Hàm trả về không tham số - Hàm trả về 1 tập giá trị: Array,List....
    static int[] getListYears() {
        //tạo 1 danh sách từ năm 1900 đến 2021
        //int[] arr = {1900,1901,1902....2021}
        int[] arr = new int[2022 - 1900];
        int temp = 0;
        for (int i = 1900; i <= 2021; i++) {
            arr[temp] = i;
            temp++;
        }
        return arr;
    }

    //Hàm trả về 1 đối tượng
    static SinhVien getSinhVien() {
        //Khai báo 1 đối tượng
        SinhVien sv1 = new SinhVien();
        sv1.tenSV = "Hàm trả về";
        return sv1;
    }

    static List<SinhVien> inMangSoNguyen(int[] arrTemp) {
        return null;
    }

    static List temp(double d, int[] arr, List lst, List<String> lstString, SinhVien sv) {
        return null;
    }
}
