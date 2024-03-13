public class Main {
    public static void main(String[] args) {
        OrderList orderList = new OrderList("a1", 123, 123, 123);
        orderList.addOrder("Ahmet", 123, 123, 120);
        orderList.addOrder("Mehmet", 125, 123, 120);
        orderList.addOrder("Ayşe", 125, 123, 120);
        orderList.calculateTotalSales();
        orderList.removeOrder(123);
        orderList.displayOrderHistory();
        System.out.println("Total Sales = " + orderList.calculateTotalSales());
    }
}