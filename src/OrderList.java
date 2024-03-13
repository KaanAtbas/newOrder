public class OrderList extends Order {
    Order head;

    public OrderList(String customerName, int orderID, int orderDate, float totalAmount) {
        super(customerName, orderID, orderDate, totalAmount);
        head = null;
    }

    public void addOrder(String customerName, int orderID, int orderDate, float totalAmount) {
        Order newOrder = new Order(customerName, orderID, orderDate, totalAmount);
        if (head == null) {
            head = newOrder;
        } else {
            Order current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newOrder;
        }
    }

    public void removeOrder(int orderIDToRemove) {
        if (head == null) {
            System.out.println("Hatalı giriş yaptınız.");
            return;
        }

        if (head.orderID == orderIDToRemove) {
            head = head.next;
            return;
        }
        Order current = head;
        while (current.next != null) {
            if (current.next.orderID == orderIDToRemove) {
                current.next = current.next.next;
                return;
            }
            current = current.next;
        }
        System.out.println("Girilen ID: " + orderIDToRemove + " bulunamadı.");

    }

    public void displayOrderHistory() {
        if (head == null) {
            System.out.println("Sipariş geçmişi yok.");
            return;
        }

        System.out.println("Order History:");
        Order current = head;
        while (current != null) {
            System.out.println("Order ID: " + current.orderID);
            System.out.println("Customer Name: " + current.customerName);
            System.out.println("Order Date: " + current.orderDate);
            System.out.println("Total Amount: " + current.totalAmount);
            System.out.println("----------------------");
            current = current.next;
        }
    }

    public float calculateTotalSales() {
        float totalSales = 0;
        Order current = head;
        while (current != null) {
            totalSales += current.totalAmount;
            current = current.next;
        }
        return totalSales;
    }


}