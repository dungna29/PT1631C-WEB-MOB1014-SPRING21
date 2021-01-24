/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAI4_Array;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/**
 *
 * @author Dungna29
 */
public class B5_ArrayList {

    /*
    Bài ArrayList
        - Định nghĩa: Lớp ArrayList trong java được sử dụng như một mảng động để lưu trữ các phần tử. 
                      ArrayList được tạo với một kích cỡ ban đầu. Khi kích cỡ này bị vượt, collection 
                      tự động được tăng. Khi các đối tượng bị gỡ bỏ, ArrayList có thể bị giảm kích cỡ.
        + Lưu ý:
                -   Có thể chứa các phần tử trùng lặp.
                -   Duy trì thứ tự của phần tử được thêm vào.
                -   Không đồng bộ (non-synchronized).
                -   Cho phép truy cập ngẫu nhiên, tốc độ truy xuất (get) phần tử nhanh vì nó lưu dữ liệu theo chỉ mục.
                -   Thao tác thêm/ xóa (add/ remove) phần tử chậm vì cần nhiều sự dịch chuyển nếu bất kỳ phần tử nào thêm/ xoá khỏi danh sách.
    
        + Phương thứ ArrayList    
                - boolean add(Object o)	Thêm phần tử được chỉ định vào cuối một danh sách.
                - void add(int index, Object element) || add(Object value) Chèn một phần tử được chỉ định 
                  tại vị trí (index) được chỉ định vào danh sách. 
                  Ném IndexOutOfBoundsException nếu index này ở bên ngoài dãy (index < 0 hoặc index > size()).
                - boolean addAll(Collection c)	Thêm tất cả các phần tử trong collection được chỉ định vào 
                  cuối của danh sách gọi phương thức, theo thứ tự chúng được trả về bởi bộ lặp iterator.
                - boolean addAll(int index, Collection c)	Thêm tất cả các phần tử trong collection được 
                  chỉ định vào danh sách gọi phương thức, bắt đầu từ vị trí đã chỉ định. 
                  Ném NullPointerException nếu collection đã cho là null.
                - Object get(int index)	Trả về phần tử tại index đã cho. 
                  Ném IndexOutOfBoundsException nếu index đã cho là ở bên ngoài dãy 
                  (index < 0 hoặc index >= size()).
                - int indexOf(Object o)	Lấy vị trí (index) trong danh sách với sự xuất hiện đầu tiên
                của phần tử được chỉ định, hoặc -1 nếu danh sách không chứa phần tử này.
                - int lastIndexOf(Object o) Lấy vị trí (index) trong danh sách với sự xuất hiện cuối
                cùng của phần tử được chỉ định, hoặc -1 nếu danh sách không chứa phần tử này.
                - Object remove(int index) Gỡ bỏ phần tử tại index đã cho. 
                Ném IndexOutOfBoundsException nếu index ở ngoài dãy (index < 0 hoặc index >= size()).
                - void retainAll(Collection c)	Xóa những phần tử không thuộc collection c và 
                không thuộc list hiện tại khỏi list hiện tại. 
                Ném NullPointerException nếu collection đã cho là null.
                - void removeAll(Collection c)	Xóa những phần tử thuộc collection c và thuộc list hiện 
                tại khỏi list hiện tại. Ném NullPointerException nếu collection đã cho là null.
                - Object set(int index, Object element)	Thay thế phần tử tại vị trí đã cho trong list này với phần tử đã xác định. Ném IndexOutOfBoundsException nếu index ở ngoài dãy (index < 0 hoặc index >= size()).
                - Object[] toArray()	Chuyển một danh sách sang mảng và trả về một mảng chứa tất cả các phần tử trong danh sách này theo đúng thứ tự. Ném NullPointerException nếu mảng này là null.
                - Object[] toArray(Object[] a)	Chuyển một danh sách sang mảng và trả về một mảng chứa tất cả các phần tử trong danh sách này theo đúng thứ tự. Kiểu runtime là của mảng trả về giống như mảng đã xác định.
                - Object clone()	Tạo một bản sao của ArrayList.
                - void clear()	Xóa tất cả các phần tử từ danh sách.
                - void trimToSize()	Cắt dung lượng của thể hiện ArrayList này là kích thước danh sách hiện tại.
     */
    public static void main(String[] args) {
        //1. Khởi tạo ArrayList không định kiểu và có định kiểu

        //      - ArrayList không định kiểu
        ArrayList arrLstKhongDinhKieu = new ArrayList();
        ArrayList arrLstKhongDinhKieu1;
        arrLstKhongDinhKieu1 = new ArrayList();

        //      - ArrayList định kiểu
        ArrayList<Integer> arrLstSoNguyen = new ArrayList<Integer>();
        ArrayList<String> arrLstString = new ArrayList<String>();
        ArrayList<Double> arrLstDouble = new ArrayList<Double>();
        ArrayList<Character> arrLstCharacter = new ArrayList<Character>();

        //2. Gán giá trị
        //      - ArrayList không định kiểu
        //Khi add thêm số nguyên thủy thì tự động chuyển sang đối tượng kiểu wrapper Double Interge
        //Khi truy xuất các phần tử, cần ép về kiểu gốc của phần tử để xử lý
        arrLstKhongDinhKieu.add("FPT");
        arrLstKhongDinhKieu.add(8.6);
        arrLstKhongDinhKieu.add(5);
        arrLstKhongDinhKieu.add(true);
        arrLstKhongDinhKieu.add('p');

        arrLstKhongDinhKieu.add(2, false);

        //Lỗi không ép kiểu được
        //double diem = arrLstKhongDinhKieu.get(3); 
        //double diem = (double)arrLstKhongDinhKieu.get(2);
        //      - ArrayList định kiểu
        arrLstString.add("Z");
        arrLstString.add("J");
        arrLstString.add("L");
        arrLstString.add("A");
        arrLstString.add("B");
        arrLstString.add("F");
        arrLstString.add("C");

        //3. Lấy giá trị - get
        System.out.println(arrLstString.get(3));
        System.out.println(arrLstKhongDinhKieu.get(2));
        System.out.println(arrLstKhongDinhKieu.get(3));
        // Xuất nhiều phần tử dùng vòng lặp
        for (int i = 0; i < arrLstKhongDinhKieu.size(); i++) {
            System.out.println(arrLstKhongDinhKieu.get(i));
        }

        for (String x : arrLstString) {
            System.out.println(x);
        }
        //4. Một vài ví dụ về các phương thức
        //isEmpty() kiểm tra xem list có rỗng hay không
        System.out.println(arrLstString.isEmpty());
        //Collections.sort - chú ý chữ s và dùng để sắp xếp từ bé đến lớn
        System.out.println("--------------");
        Collections.sort(arrLstString);
        for (String x : arrLstString) {
            System.out.println(x);
        }
        //Collections.reverse - Đảo ngược danh sách
         Collections.reverse(arrLstString);

    }
}
