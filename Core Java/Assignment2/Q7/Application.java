package co.harsh.Assignment2.Q7;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your role? ");
        String role = sc.next();
        if(role.equalsIgnoreCase("owner")){
            Owner owner = new Owner();
            System.out.println("Are you want to add an Item? \n Press 1 for Yes and 0 for No");
            int choice = sc.nextInt();
            if(choice==1) {
                System.out.println("Enter the item name");
                String item = sc.next();
                owner.addItem(item);
                int see = sc.nextInt();
                if (see == 1) {
                    owner.showItems();
                }
            }
        }
        else if(role.equalsIgnoreCase("customer")){
            Customer customer = new Customer();
            System.out.println("Want to Place an Order \nPlease enter item name");
            String item = sc.next();
            customer.placeOrder(item);
        }
    }
}
