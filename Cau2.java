package BaiTapLab8;
interface HangSanXuat{
    String TenHangSanXuat();
    String tenQuocGia();
}
abstract class PhuongTienDiChuyen implements HangSanXuat{
     String loaiPhuongTien(){
        return loaiPhuongTien();
     }
    void batDau(){
        System.out.println("Let's go");
    }
    void tangToc(){
        System.out.println("accelerate");
    }
    void dungLai(){
        System.out.println("Stop");
    }
    abstract Double layVanToc();

    @Override
    public String TenHangSanXuat() {
        String TenHangSanXuat;
        TenHangSanXuat = " ten hang san xuat";
        return TenHangSanXuat;
    }
    @Override
    public String tenQuocGia() {
        String tenQuocGia;
        tenQuocGia = " Ten Quoc Gia";
        return tenQuocGia;
    }
}
class MayBay extends PhuongTienDiChuyen{
    @Override
    String loaiPhuongTien() {
        String loaiPhuongTien;
        loaiPhuongTien = "MAY BAY";
        return loaiPhuongTien;
    }
    private String loaiNguyenLieu;
    void catCanh(){
        System.out.println("Cat canh vao luc 2 gio 00 phut");
    }
    void haCanh(){
        System.out.println("Ha canh vao luc 3 gio 20 phut");
    }
    @Override
    Double layVanToc() {
        Double layVanToc;
        layVanToc = 100.00;
        return layVanToc;
    }
}
class xeOto extends PhuongTienDiChuyen{
    @Override
    String loaiPhuongTien() {
        String loaiPhuongTien;
        loaiPhuongTien = "Xe: XE OTO";
        return loaiPhuongTien;
    }
    @Override
    Double layVanToc() {
        Double layVanToc;
        layVanToc = 50.00;
        return layVanToc;
    }
}
class xeDap extends PhuongTienDiChuyen{
    @Override
    String loaiPhuongTien() {
        String loaiPhuongTien;
        loaiPhuongTien = "Xe: XE DAP";
        return loaiPhuongTien;
    }
    @Override
    Double layVanToc() {
        Double layVanToc;
        layVanToc = 10.00;
        return layVanToc;
    }
}
class Cau2 {
    public static void main(String[] args) {
        xeDap XD = new xeDap();
        MayBay MB = new MayBay();
        System.out.println(MB.loaiPhuongTien());
        MB.catCanh();
        MB.haCanh();
        System.out.println("Van Toc:"+MB.layVanToc());
        xeOto OT = new xeOto();
        System.out.println(OT.loaiPhuongTien());
        System.out.println("Van Toc:"+OT.layVanToc());  
        System.out.println(XD.loaiPhuongTien());
        System.out.println("Van Toc:"+XD.layVanToc()); 
    }
}
