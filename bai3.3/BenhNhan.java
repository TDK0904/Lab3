import java.util.Scanner;

public class BenhNhan {
    // các thuộc tính của lớp BenhNhan
    private static String hoTen;
    private static int tuoi;
    private String diaChi;
    private String sdt;
    public Object set;

    // các phương thức khởi tạo của lớp BenhNhan
    public BenhNhan(String hoTen, int tuoi, String diaChi, String sdt) {
        this.hoTen = hoTen;
        this.tuoi = tuoi;
        this.diaChi = diaChi;
        this.sdt = sdt;
    }

    public BenhNhan() {
    }

    public static void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap ten bn");
        hoTen = sc.nextLine();
        System.out.print("nhap tuoi bn");
        tuoi = sc.nextInt();

    }

    // phương thức toString để hiển thị thông tin của đối tượng BenhNhan
    @Override
    public String toString() {
        return "BenhNhan{" +
                "hoTen='" + hoTen + '\'' +
                ", tuoi=" + tuoi;
    }

    public String getTuoi() {
        return null;
    }

    public String getHoTen() {
        return null;
    }

    public void setTuoi(int i) {
    }

    public void setHoTen(String string) {
    }
}
