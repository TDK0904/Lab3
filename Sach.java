package bai31;

import java.util.Scanner;

public class Sach {
	private String tenSach;
	private String tacGia;
	private String nhaXuatBan;
	private String loaiSach;
	private String maSach;
	
	private int soTrang;;
	private int soTap;
	private int gia;
	
	public Sach(String tenSach, String tacGia, String nhaXuatBan, String loaiSach, String maSach, int soTrang, int gia, int soTap) {
	this.tenSach = tenSach;
	this.tacGia = tacGia;
	this.nhaXuatBan = nhaXuatBan;
	this.loaiSach = loaiSach;
	this.maSach = maSach;
	this.soTrang =soTrang;
	this.soTap = soTap;
	this.gia = gia;
	
	}
	public static Sach nhapsach() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap ten sach: ");
		String tenSach = scanner.nextLine();
		System.out.println("Nhap ten tac gia: ");
		String tacGia = scanner.nextLine();
		System.out.println("Nhap nha xuat ban: ");
		String nhaXuatBan = scanner.nextLine();
		System.out.println("Nhap loai sach: ");
		String loaiSach = scanner.nextLine();
		System.out.println("Nhap ma sach: ");
		String maSach = scanner.nextLine();
		
		System.out.println("Nhap so trang: ");
		int soTrang = scanner.nextInt();
		System.out.println("Nhap so tap: ");
		int soTap = scanner.nextInt();
		System.out.println("Nhap gia: ");
		int gia = scanner.nextInt();
		
		Sach sach = new Sach(tenSach, tacGia, nhaXuatBan, loaiSach, maSach, soTrang, soTap, gia);
		return sach;
	}
	public void inSach() {
		System.out.println("Ten Sach: " +tenSach);
		System.out.println("Ten Tac Gia: " +tacGia);
		System.out.println("Nha Xuat Ban: " +nhaXuatBan);
		System.out.println("Loai Sach: " +loaiSach);
		System.out.println("Ma Sach: " +maSach);
		System.out.println("So trang sach: " +soTrang);
		System.out.println("So Tap: " +soTap);
		System.out.println("Gia Sach: " +gia);
	}
	
	public static void main(String[] args) {
		Sach sach = Sach.nhapsach();
		System.out.println("Thong tin sach: ");
		sach.inSach();
	}
	
	
}


