package co.harsh.Assignment2.Q7;

public class Customer {
    public Customer(){

    }
    public void placeOrder(DessertItem item){
                System.out.print("Order Placed and Cost is:Rs");
                System.out.println(item.getCost());

    }
    public void placeOrder(String item){
        if(item.equalsIgnoreCase("icecream")){
            placeOrder(new IceCream());

        }
        else if(item.equalsIgnoreCase("candy")){
            placeOrder(new Candy());

        }
        else if(item.equalsIgnoreCase("cookie")){
            placeOrder(new Cookie());
        }else{
            System.out.println("Invalid Item");
        }
    }
}
