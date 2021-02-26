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
public class SinhVien extends Person{//Sử dụng từ khóa extends để kế thừa lớp cha
      
    private String maSv;    
    private double diemJava;

    public SinhVien() {
    }

    public SinhVien(String maSv, double diemJava, String ho, String tenDem, String ten, int namSinh) {
        super(ho, tenDem, ten, namSinh);
        this.maSv = maSv;
        this.diemJava = diemJava;        
    }

    public String getMaSv() {
        return maSv;
    }

    public void setMaSv(String maSv) {
        this.maSv = maSv;
    }

    public double getDiemJava() {
        return diemJava;
    }

    public void setDiemJava(double diemJava) {
        this.diemJava = diemJava;
    }

    @Override
    public String toString() {       
        return super.toString() + "SinhVien{" + "maSv=" + maSv + ", diemJava=" + diemJava + '}';
    }
    
    //Để kế thừa phương thức lớp cha: ALT + INSERT -> Overide Method -> chọn method mong muố

    @Override
    void inRaManHinhLopCha() {
        System.out.println("Đây là text in ra từ inRaManHinhLopCha() nằm ở Sinh VIên");
        //super.inRaManHinhLopCha(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
