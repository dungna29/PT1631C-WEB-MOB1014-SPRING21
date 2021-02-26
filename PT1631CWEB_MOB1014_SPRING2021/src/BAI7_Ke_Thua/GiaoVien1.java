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
public class GiaoVien1 {

    private String ho;
    private String tenDem;
    private String ten;
    private String maGv;
    private int namSinh;
    private double gioDay;

    public GiaoVien1() {
    }

    public GiaoVien1(String ho, String tenDem, String ten, String maGv, int namSinh, double gioDay) {
        this.ho = ho;
        this.tenDem = tenDem;
        this.ten = ten;
        this.maGv = maGv;
        this.namSinh = namSinh;
        this.gioDay = gioDay;
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

    public String getMaGv() {
        return maGv;
    }

    public void setMaGv(String maGv) {
        this.maGv = maGv;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public double getGioDay() {
        return gioDay;
    }

    public void setGioDay(double gioDay) {
        this.gioDay = gioDay;
    }

    @Override
    public String toString() {
        return "GiaoVien1{" + "ho=" + ho + ", tenDem=" + tenDem + ", ten=" + ten + ", maGv=" + maGv + ", namSinh=" + namSinh + ", gioDay=" + gioDay + '}';
    }

    void inRaManHinhGiaoVien() {

    }

}
