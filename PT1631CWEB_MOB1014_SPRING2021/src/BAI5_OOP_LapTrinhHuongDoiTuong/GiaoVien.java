/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAI5_OOP_LapTrinhHuongDoiTuong;

/**
 *
 * @author DungNAPC
 */
public class GiaoVien {

    //Phần 1: Khai báo các thuộc tính phải có của đối tượng
   private String tengv;
   private String magv;
   private long sdt;
   private int tuoi;    
   private String email;
   private String Truong = "FPT POLY";

    /*
    Phần 2: Hàm tạo || Contructor
    + Contructor giống với class 
    + Để tạo sử dụng phím ALT + INSERT chọn CONTRUCTOR
    */
    //Tạo Contructor không tham số
    public GiaoVien() {
        //System.out.println("Đây là text in ra từ Contructor không tham số của đối tượng GV");
    }
    
    //Tạo Contructor có tham số
    //ALT + INSERT chọn CONTRUCTOR -> Select All
    public GiaoVien(String tengv1, String magv, long sdt, int tuoi, String email) {
        tengv = tengv1;//Khi không dùng từ khóa this phải đổi tên tham số truyền vào
        this.magv = magv;
        this.sdt = sdt;
        this.tuoi = tuoi;
        this.email = email;        
    }
    //this được sử dụng để tham chiếu đến thuộc tính và phương thức của lớp hiện tại
   
    //Phần 3: Vì các thuộc tính bị Private nên sẽ phải sử dụng Getter và Setter
    //Khi private các thuộc tính nhằm che dấu (Encapsulation) trong hướng đối tượng là 1 trong 4 tính chất của OOP
    //Alt + Insert hoặc chuột phải chọn Insert Code chọn Getter và Setter ->Select All

    public String getTengv() {
        return tengv;
    }

    public void setTengv(String tengv) {
        this.tengv = tengv;
    }

    public String getMagv() {
        return magv;
    }

    public void setMagv(String magv) {
        this.magv = magv;
    }

    public long getSdt() {
        return sdt;
    }

    public void setSdt(long sdt) {
        this.sdt = sdt;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getTruong() {
        return Truong;
    }

    //Phần 4: Phương thức của đối tượng

    //Alt + Insert -> toString() - Phương thức trả về 1 chuỗi dùng để in giá trị của các thuộc tính
    @Override
    public String toString() {//Hàm trả về kiểu chuỗi
        return "GiaoVien{" + "tengv=" + tengv + ", magv=" + magv + ", sdt=" + sdt + ", tuoi=" + tuoi + ", email=" + email + ", Truong=" + Truong + '}';
    }
    
    //Hoặc có thể tự viết 1 phương thức in ra màn hình
    void inRaManHinh(){
        System.out.printf("Tên GV: %s | Mã GV: %s | SDT: %d | Tuoi: %d",tengv,getMagv(),getSdt(),tuoi);
    }
    
    
}
