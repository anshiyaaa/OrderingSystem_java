import model.Customer;
import model.Items;
import model.Order;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Items i1 = new Items("Fast food", "Veg","Veg Chow-min");
        Items i2 = new Items("Fast food", "Meat","Chi MO:MO");



        ArrayList<Items> Items1 = new ArrayList<>();
        Items1.add(i1);
        Items1.add(i2);



        Order o1 = new Order("Sushant", Items1);


        ArrayList<Order> customer1order = new ArrayList<>();
        customer1order.add(o1);


        Customer c1 = new Customer(1, customer1order, 165);


        i1.getItemDetails();
        c1.getInvoice(150);
    }
}