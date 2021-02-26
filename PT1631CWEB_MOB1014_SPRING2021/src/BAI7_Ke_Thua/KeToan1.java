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
public class KeToan1 {
    private String ho;
    private String tenDem;
    private String ten;
    private String maKt;
    private int namSinh;
    private double chamCong;

    public KeToan1() {
    }

    public KeToan1(String ho, String tenDem, String ten, String maKt, int namSinh, double chamCong) {
        this.ho = ho;
        this.tenDem = tenDem;
        this.ten = ten;
        this.maKt = maKt;
        this.namSinh = namSinh;
        this.chamCong = chamCong;
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

    public String getMaKt() {
        return maKt;
    }

    public void setMaKt(String maKt) {
        this.maKt = maKt;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public double getChamCong() {
        return chamCong;
    }

    public void setChamCong(double chamCong) {
        this.chamCong = chamCong;
    }

    @Override
    public String toString() {
        return "KeToan1{" + "ho=" + ho + ", tenDem=" + tenDem + ", ten=" + ten + ", maKt=" + maKt + ", namSinh=" + namSinh + ", chamCong=" + chamCong + '}';
    }
    
    
}
