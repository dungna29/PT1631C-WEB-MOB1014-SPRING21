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
public class GiaoVien extends Person{
   
    private String maGv;   
    private double gioDay;

    public GiaoVien() {
    }

    public GiaoVien(String maGv, double gioDay, String ho, String tenDem, String ten, int namSinh) {
        super(ho, tenDem, ten, namSinh);
        this.maGv = maGv;
        this.gioDay = gioDay;
    }

    public String getMaGv() {
        return maGv;
    }

    public void setMaGv(String maGv) {
        this.maGv = maGv;
    }

    public double getGioDay() {
        return gioDay;
    }

    public void setGioDay(double gioDay) {
        this.gioDay = gioDay;
    }

    @Override
    public String toString() {        
        return "GiaoVien{" + "maGv=" + maGv + ", gioDay=" + gioDay + '}';
    }
    
    
}
