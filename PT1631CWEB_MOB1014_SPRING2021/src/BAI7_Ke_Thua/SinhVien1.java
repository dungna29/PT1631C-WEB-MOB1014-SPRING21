/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAI7_Ke_Thua;

/**
 *
 * @author DungNAPC
 */
public class SinhVien1 {
    private String ho;
    private String tenDem;
    private String ten;
    private String maSv;
    private int namSinh;
    private double diemJava;

    public SinhVien1() {
    }

    public SinhVien1(String ho, String tenDem, String ten, String maSv, int namSinh, double diemJava) {
        this.ho = ho;
        this.tenDem = tenDem;
        this.ten = ten;
        this.maSv = maSv;
        this.namSinh = namSinh;
        this.diemJava = diemJava;
    }

    public String getHo() {
        return ho;
    }

    public void setHo(String ho) {
        this.ho = ho;
    }

    public String getTenDem() {
        return tenDem;
    }

    public void setTenDem(String tenDem) {
        this.tenDem = tenDem;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
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

    public double getDiemJava() {
        return diemJava;
    }

    public void setDiemJava(double diemJava) {
        this.diemJava = diemJava;
    }

    @Override
    public String toString() {
        return "SinhVien1{" + "ho=" + ho + ", tenDem=" + tenDem + ", ten=" + ten + ", maSv=" + maSv + ", namSinh=" + namSinh + ", diemJava=" + diemJava + '}';
    }
    
}
