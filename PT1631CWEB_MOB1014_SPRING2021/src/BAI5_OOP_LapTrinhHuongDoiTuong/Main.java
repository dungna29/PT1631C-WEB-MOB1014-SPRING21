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
public class Main {
    public static void main(String[] args) {
        //P1: Gọi đối tượng ra để sử dụng thì cần phải biết tên của đối tượng
        GiaoVien gv1 = new GiaoVien();//Khởi tạo ra 1 đối tượng giáo viên
        //gv1.tengv ="Minh";//Gán giá trị cho thuộc tính của đối tượng
        //System.out.println(gv1.tengv);//In giá trị của thuộc tính đối tượng ra màn hình
        
        //P2: Contructor không tham số
        // Không nhất thiết phải gán giá trị cho đối tượng khi khởi tạo
        GiaoVien gv2 = new GiaoVien();
        //Gán giá trị cho từng thuộc tính
        //gv2.tengv = "Long";
        //gv2.magv ="longnt";
        //gv2.tuoi = 23;
        //System.out.println(gv2.tengv);
        
        //P3: Contructor có tham số
        // Phải gán giá trị cho đối tượng ngay khi khởi tạo
        //Các vị trí của giá trị gán vào phải tương ứng với các tham số
        GiaoVien gv3 = new GiaoVien("Dũng", "Dungna", 123456, 32, "dungna@gmail.com");
        //System.out.println(gv3.tengv);
        
        //P4: Cách gán giá trị khi thuộc tính bị private
        GiaoVien gv4 = new GiaoVien();
        //Sử dụng phương thức Set để gán giá trị cho các thuộc tính của đối tượng
        gv4.setTengv("Thiện");
        gv4.setMagv("Thienth");
        gv4.setTuoi(29);
        
        //Sử dụng phương thức Get để lấy giá trị thuộc tính của đối tượng
        System.out.println(gv4.getTengv() + " " + gv4.getMagv() + " " +gv4.getTruong());
        
        //P5: Sử dụng phương thức in màn hình toString
        System.out.println(gv3.toString());
        //Sử dụng phương in màn hình riêng
        gv3.inRaManHinh();
    }
}
