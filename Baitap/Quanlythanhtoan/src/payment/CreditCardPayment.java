package payment;

public class CreditCardPayment implements PaymentMethod {
    @Override
    public void pay(String khachHang, double amount) {
        System.out.println("Khách hàng: " + khachHang + ". Tổng tiền: " + amount + ". Thanh toán bằng thẻ tín dụng thành công.");
    }
}
