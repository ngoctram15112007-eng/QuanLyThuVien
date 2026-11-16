package baithuchanh7;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Sach> dsSach = new ArrayList<>();
        System.out.print("Nhap so luong sach: ");
        int n = sc.nextInt();
        sc.nextLine();
 
        for (int i = 0; i < n; i++) {

            System.out.println("\nNhap thong tin sach thu " + (i + 1));
            Sach s = new Sach();
            s.nhapThongTin(sc);
            dsSach.add(s);
        }

        System.out.println("\n===== DANH SACH SACH =====");
        for (int i = 0; i < dsSach.size(); i++) {
            System.out.println("\nThong tin sach thu " + (i + 1));
            dsSach.get(i).hienThiThongTin();
        }
        sc.close();
    }
}
