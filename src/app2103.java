public class app2103 {
    public static void main(String[] args) throws Exception {

        System.out.println("HINH CHU NHAT\n");
        HinhChuNhat hcn = new HinhChuNhat();
        hcn.nhapChieuDaiChieuRong();
        hcn.tinhDienTich();
        hcn.tinhChuVi();
        System.out.println("Chu vi hinh chu nhat : " + hcn.getChuVi());
        System.out.println("Dien tich hinh chu nhat : " + hcn.getDienTich() );


        System.out.println("\n PERSON \n");
        Person ps = new Person();
        ps.nhapThongTin();
        ps.inThongTin();

        System.out.println("\nSINH VIEN\n");
        SinhVien sv = new SinhVien();
        sv.nhapThongTin();
        sv.inThongTin();

        System.out.println("\n PHUONG TRINH BAC HAI \n");
        PhuongTrinhBacHai pt = new PhuongTrinhBacHai();
        pt.nhap();
        pt.giaiPhuongTrinh();
        pt.inKetQua();
    }
}