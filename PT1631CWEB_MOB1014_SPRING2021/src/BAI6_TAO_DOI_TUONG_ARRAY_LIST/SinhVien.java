/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAI6_TAO_DOI_TUONG_ARRAY_LIST;

/**
 *
 * @author DungNAPC
 */
public class SinhVien {
    
    private String tenSV;
    private String maSV;
    private int namSinh;
    private double diemJava;

    public SinhVien() {
    }

    public SinhVien(String tenSV, String maSV, int namSinh, double diemJava) {
        this.tenSV = tenSV;
        this.maSV = maSV;
        this.namSinh = namSinh;
        this.diemJava = diemJava;
    }

    public String getTenSV() {
        return tenSV;
    }

    public void setTenSV(String tenSV) {
        this.tenSV = tenSV;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
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
        return "SinhVien{" + "tenSV=" + tenSV + ", maSV=" + maSV + ", namSinh=" + namSinh + ", diemJava=" + diemJava + '}';
    }
    
    
}
