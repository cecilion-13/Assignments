package co.harsh.Assignment2.Q7;

import java.util.ArrayList;
import java.util.List;

public class Owner {

    private static List<DessertItem> itemList;
    public Owner(){
        itemList = new ArrayList<>();
    }
    public void addItem(DessertItem item){
             itemList.add(item);
    }

    public void addItem(String item){
        if(item.equalsIgnoreCase("icecream")){
            addItem(new IceCream());
            System.out.println("Item added");

        }
        else if(item.equalsIgnoreCase("candy")){
            addItem(new Candy());
            System.out.println("Item added");

        }
        else if(item.equalsIgnoreCase("cookie")){
            addItem(new Cookie());
            System.out.println("Item added");
        }else{
            System.out.println("Invalid Item");
        }
    }
    public void showItems(){
        System.out.print("Items are: ");
        for(DessertItem item:itemList){
            System.out.println(item);
        }
    }

    public static boolean getOrder(DessertItem item){
        return itemList.contains(item);
    }
}
