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
public class BaoVe1 {
    private String ho;
    private String tenDem;
    private String ten;
    private String maBv;
    private int namSinh;
    private double caTruc;

    public BaoVe1() {
    }

    
    public BaoVe1(String ho, String tenDem, String ten, String maBv, int namSinh, double caTruc) {
        this.ho = ho;
        this.tenDem = tenDem;
        this.ten = ten;
        this.maBv = maBv;
        this.namSinh = namSinh;
        this.caTruc = caTruc;
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

    public String getMaBv() {
        return maBv;
    }

    public void setMaBv(String maBv) {
        this.maBv = maBv;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public double getCaTruc() {
        return caTruc;
    }

    public void setCaTruc(double caTruc) {
        this.caTruc = caTruc;
    }

    @Override
    public String toString() {
        return "BaoVe1{" + "ho=" + ho + ", tenDem=" + tenDem + ", ten=" + ten + ", maBv=" + maBv + ", namSinh=" + namSinh + ", caTruc=" + caTruc + '}';
    }
    
    
}
