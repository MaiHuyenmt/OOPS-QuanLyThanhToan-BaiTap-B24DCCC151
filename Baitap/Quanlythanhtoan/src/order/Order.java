package order;

import product.Product;
import payment.PaymentMethod;
import customer.Customer;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private Customer khachHang;
    private List<Product> danhSachSP;
    private PaymentMethod paymentMethod;

    public Order(Customer khachHang) {
        this.khachHang = khachHang;
        this.danhSachSP = new ArrayList<>();
    }

    public void addProduct(Product p) {
        danhSachSP.add(p);
    }

    public double tinhTong() {
        double tong = 0;
        for (Product p : danhSachSP) {
            tong += p.getGia();
        }
        return tong;
    }

    public void setPaymentMethod(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public void checkout() {
        if (paymentMethod == null) {
            System.out.println("Chưa chọn phương thức thanh toán!");
            return;
        }
        double tongTien = tinhTong();
        paymentMethod.pay(khachHang.getTenKH(), tongTien);
    }
}
