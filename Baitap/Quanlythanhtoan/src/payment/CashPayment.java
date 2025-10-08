package payment;

public class CashPayment implements PaymentMethod {
    @Override
    public void pay(String khachHang, double amount) {
        System.out.println("Khách hàng: " + khachHang + ". Tổng tiền: " + amount + ". Thanh toán tiền mặt thành công.");
    }
}
