package week2.Barista;
import java.util.ArrayList;

public class TestOrders {
        public static void main(String[] args) {
    
        Item item1 = new Item("Cappucino", 4.35);
        Item item2 = new Item("Mocha", 5.05);
        Item item3 = new Item("Latte", 6.75);
        Item item4 = new Item("Drip Coffee", 2.00);
    
        Order order1 = new Order();
        Order order2 = new Order();
    
        Order order3 = new Order("Karlee");
        Order order4 = new Order("Richard");
        Order order5 = new Order("Joe");
    
        order3.addItem(item1);
        order1.addItem(item4);
        
        System.out.println(order2.getStatusMessage());
        order1.setReady(true);
    
        System.out.println(order1.getOrderTotal());
    
        order3.display();
        }
    }
    
