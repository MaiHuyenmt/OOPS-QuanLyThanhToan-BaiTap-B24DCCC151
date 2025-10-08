package product;

public class FoodProduct extends Product {
    private String hanSuDung;

    public FoodProduct(String maSP, String tenSP, double gia, String hanSuDung) {
        super(maSP, tenSP, gia);
        this.hanSuDung = hanSuDung;
    }

    @Override
    public String toString() {
        return super.toString() + " | HSD: " + hanSuDung;
    }
}
