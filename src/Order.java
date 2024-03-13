public class Order {
    int orderID;
    String customerName;
    int orderDate;
    float totalAmount;
    Order next;

    public Order(String customerName, int orderID, int orderDate, float totalAmount) {
        this.customerName = customerName;
        this.orderID = orderID;
        this.orderDate = orderDate;
        this.totalAmount = totalAmount;
        this.next = null;
    }
}
