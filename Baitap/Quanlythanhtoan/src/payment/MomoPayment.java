package payment;

public class MomoPayment implements PaymentMethod {
    @Override
    public void pay(String khachHang, double amount) {
        System.out.println("Khách hàng: " + khachHang + ". Tổng tiền: " + amount + ". Thanh toán qua Momo thành công.");
    }
}
