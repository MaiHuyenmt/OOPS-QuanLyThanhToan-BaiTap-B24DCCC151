package product;

public class Product {
     protected String maSP;
    protected String tenSP;
    protected double gia;

    public Product(String maSP, String tenSP, double gia) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.gia = gia;
    }

    public double getGia() {
        return gia;
    }

    @Override
    public String toString() {
        return maSP + " - " + tenSP + " - " + gia + " VND";
    }
}
