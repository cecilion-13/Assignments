package co.harsh.Assignment2.Q7;

import java.util.List;

public class DessertShop {
    public static void main(String[] args) {
        Owner harry = new Owner();
        DessertItem iceCream = new IceCream();
        DessertItem candy = new Candy();
        DessertItem cookie = new Cookie();
        harry.addItem(iceCream);
        harry.addItem(candy);
        harry.addItem(cookie);

        Customer ron = new Customer();
        ron.placeOrder(iceCream);




    }
}
