public class OrderService {
    private final Order order;
    private final InvoiceGenerator invoiceGenerator;
    private final EmailNotifier emailNotifier;

    public OrderService(Order order, InvoiceGenerator invoiceGenerator, EmailNotifier emailNotifier) {
        this.order = order;
        this.invoiceGenerator = invoiceGenerator;
        this.emailNotifier = emailNotifier;
    }

    public void processOrder(double price, int quantity, String customerName, String address, String email, String fileName) {
        order.calculateTotal(price, quantity);
        order.placeOrder(customerName, address);
        invoiceGenerator.generateInvoice(fileName);
        emailNotifier.sendEmailNotification(email);
    }
}
