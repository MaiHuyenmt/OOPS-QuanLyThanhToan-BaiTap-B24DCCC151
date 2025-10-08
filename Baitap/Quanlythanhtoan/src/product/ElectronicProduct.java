package product;

public class ElectronicProduct extends Product {
     private String imei;
    private int baoHanhThang;

    public ElectronicProduct(String maSP, String tenSP, double gia, String imei, int baoHanhThang) {
        super(maSP, tenSP, gia);
        this.imei = imei;
        this.baoHanhThang = baoHanhThang;
    }

    @Override
    public String toString() {
        return super.toString() + " | IMEI: " + imei + " | BH: " + baoHanhThang + " tháng";
    }
}
