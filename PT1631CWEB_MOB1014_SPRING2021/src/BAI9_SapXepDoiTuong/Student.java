/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAI9_SapXepDoiTuong;

/**
 *
 * @author DungNAPC
 */
public class Student implements Comparable<Student>{//Cách 2 sắp xếp

    private String ho;
    private String ten;
    private String tenDem;
    private String maSv;
    private int namSinh;
    private double diemCsharp;
    private String gioiTinh;
    private String queQuan;

    public Student() {
    }

    public Student(String ho, String ten, String tenDem, String maSv, int namSinh, double diemCsharp, String gioiTinh, String queQuan) {
        this.ho = ho;
        this.ten = ten;
        this.tenDem = tenDem;
        this.maSv = maSv;
        this.namSinh = namSinh;
        this.diemCsharp = diemCsharp;
        this.gioiTinh = gioiTinh;
        this.queQuan = queQuan;
    }

    public String getHo() {
        return ho;
    }

    public void setHo(String ho) {
        this.ho = ho;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getTenDem() {
        return tenDem;
    }

    public void setTenDem(String tenDem) {
        this.tenDem = tenDem;
    }

    public String getMaSv() {
        return maSv;
    }

    public void setMaSv(String maSv) {
        this.maSv = maSv;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public double getDiemCsharp() {
        return diemCsharp;
    }

    public void setDiemCsharp(double diemCsharp) {
        this.diemCsharp = diemCsharp;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getQueQuan() {
        return queQuan;
    }

    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }

    @Override
    public String toString() {
        return "Student{" + "ho=" + ho + ", ten=" + ten + ", tenDem=" + tenDem + ", maSv=" + maSv + ", namSinh=" + namSinh + ", diemCsharp=" + diemCsharp + ", gioiTinh=" + gioiTinh + ", queQuan=" + queQuan + '}';
    }

    public void inRaManHinh() {
        System.out.printf("Tên đầy dủ: %s %s %s | Mã SV: %s | Năm Sinh: %d |"
                + " Tuổi: %d | Điểm C#1: %s | Giới Tính: %s | Quê Quán: %s \n", ho, tenDem, ten, maSv, namSinh, 2021 - namSinh,
                 (diemCsharp < 0) ? "N/A" : diemCsharp, gioiTinh, queQuan);
    }

    @Override
    public int compareTo(Student o) {
       //return ten.compareTo(o.ten);//Sắp xếp theo tên theo thứ tự tăng dần
       //return -ten.compareTo(o.ten);//Sắp xếp theo tên theo thứ tự giảm dần
        if (diemCsharp > o.diemCsharp) {
            return 1;
        }else if(diemCsharp < o.diemCsharp){
            return -1;
        }
        return 0;
    }

   
   

    

}
