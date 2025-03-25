public class OrderTest {
    public static void main(String[] args) {
        // Create the concrete implementations of interfaces
        Order order = new OrderAction();
        InvoiceGenerator invoiceGenerator = new InvoiceAction();
        EmailNotifier emailNotifier = new EmailAction();

        // Create an instance of OrderService with the required dependencies
        OrderService orderService = new OrderService(order, invoiceGenerator, emailNotifier);

        // Process the order
        orderService.processOrder(10.0, 2, "John Doe", "123 Main St", "johndoe@example.com", "order_123.pdf");
    }
}
