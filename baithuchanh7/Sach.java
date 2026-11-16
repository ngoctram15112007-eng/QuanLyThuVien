package baithuchanh7;

import java.util.Scanner;

public class Sach {

    private String maSach;
    private String tieuDe;
    private String tacGia;
    private int namXuatBan;
    private int soLuong;

    public Sach() {
    }

    public Sach(String maSach, String tieuDe, String tacGia,
            int namXuatBan, int soLuong) {
        this.maSach = maSach;
        this.tieuDe = tieuDe;
        this.tacGia = tacGia;
        setNamXuatBan(namXuatBan);
        setSoLuong(soLuong);
    }

    public String getMaSach() {
        return maSach;
    }

    public void setMaSach(String maSach) {
        this.maSach = maSach;
    }

    // Getter va Setter cho tieuDe
    public String getTieuDe() {
        return tieuDe;
    }

    public void setTieuDe(String tieuDe) {
        this.tieuDe = tieuDe;
    }

    // Getter va Setter cho tacGia
    public String getTacGia() {
        return tacGia;
    }

    public void setTacGia(String tacGia) {
        this.tacGia = tacGia;
    }

    // Getter va Setter cho namXuatBan
    public int getNamXuatBan() {
        return namXuatBan;
    }

    public void setNamXuatBan(int namXuatBan) {
        int currentYear = java.time.Year.now().getValue();
        if (namXuatBan > 0 && namXuatBan <= currentYear) {
            this.namXuatBan = namXuatBan;
        } else {
            System.out.println("Nam xuat ban khong hop le!");
        }
    }

    // Getter va Setter cho soLuong
    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        if (soLuong >= 0) {
            this.soLuong = soLuong;
        } else {
            System.out.println("So luong khong duoc am!");
        }
    }

    public void nhapThongTin(Scanner sc) {
        System.out.print("Nhap ma sach: ");
        maSach = sc.nextLine();
        System.out.print("Nhap tieu de sach: ");
        tieuDe = sc.nextLine();
        System.out.print("Nhap ten tac gia: ");
        tacGia = sc.nextLine();
        int nam;
        do {
            System.out.print("Nhap nam xuat ban: ");
            nam = Integer.parseInt(sc.nextLine());

            if (nam <= 0 || nam > java.time.Year.now().getValue()) {
                System.out.println("Nam xuat ban khong hop le! Nhap lai.");
            }
        } while (nam <= 0 || nam > java.time.Year.now().getValue());

        setNamXuatBan(nam);

        int sl;
        do {
            System.out.print("Nhap so luong: ");
            sl = Integer.parseInt(sc.nextLine());

            if (sl < 0) {
                System.out.println("So luong khong duoc am! Nhap lai.");
            }
        } while (sl < 0);
        setSoLuong(sl);
    }

    public void hienThiThongTin() {
        System.out.println("Ma sach: " + maSach);
        System.out.println("Tieu de: " + tieuDe);
        System.out.println("Tac gia: " + tacGia);
        System.out.println("Nam xuat ban: " + namXuatBan);
        System.out.println("So luong: " + soLuong);
    }
}
