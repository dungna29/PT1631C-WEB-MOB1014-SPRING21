package Bai8_XuLyChuoi;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author DungNAPC
 */
public class Main {

    public static void main(String[] args) {
        String name1 = "fpt";
        String name2 = "FPT";
        if (name1.equals(name2)) {
            System.out.println("equals 2 Tên bằng nhau");
        }
        if (name1.equalsIgnoreCase(name2)) {
            System.out.println("equalsIgnoreCase 2 Tên bằng nhau");
        }
        System.out.println(name1.charAt(0));
        System.out.println(name1.toUpperCase());
        System.out.println(name2.toLowerCase());
        double diemCsharp = 5.6;
        double diemJava = -3.2;
        //Chuyển điểm âm khi in ra màn hình thành N/A
        //Hàm còn convert số về chữ
        String diemCsharp1 = diemCsharp < 0? "N/A" :String.valueOf(diemCsharp);
        System.out.println(diemCsharp1);
        
        //dungna
    }
}
