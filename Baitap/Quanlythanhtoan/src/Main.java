import product.*;
import payment.*;
import order.Order;
import customer.Customer;

public class Main {
    public static void main(String[] args) {
        // Tạo khách hàng
        Customer kh1 = new Customer("KH001", "Nguyễn Văn A", "0905123456");
        Customer kh2 = new Customer("KH002", "Nguyễn Văn B", "0912345678");
        Customer kh3 = new Customer("KH003", "Nguyễn Văn C", "0987654321");

        // Tạo sản phẩm
        Product sp1 = new ElectronicProduct("E01", "Điện thoại", 5000000, "123456789", 12);
        Product sp2 = new FoodProduct("F01", "Bánh ngọt", 50000, "10/12/2025");

        // Đơn hàng 1
        Order orderA = new Order(kh1);
        orderA.addProduct(sp1);
        orderA.addProduct(sp2);
        orderA.setPaymentMethod(new CashPayment());
        orderA.checkout();

        // Đơn hàng 2
        Order orderB = new Order(kh2);
        orderB.addProduct(sp1);
        orderB.setPaymentMethod(new CreditCardPayment());
        orderB.checkout();

        // Đơn hàng 3
        Order orderC = new Order(kh3);
        orderC.addProduct(sp2);
        orderC.setPaymentMethod(new MomoPayment());
        orderC.checkout();
    }
}
