package co.harsh.Assignment4.Q2;

import java.util.Arrays;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        List<Order> list = Arrays.asList(
                new Order(1,20000,"Completed"),
                new Order(2,5000,"Accepted"),
                new Order(3,10000,"Unaccepted"),
                new Order(4,3000,"Not Completed"),
                new Order(5,40000,"Completed")

                );
        //Based on price more than 10000
        System.out.println("Based on Price more than 10000");
        Order.performConditionallly(list,o-> {return o.getOrder_price()>10000;});
        System.out.println("------------");
        //Based on order_status

        System.out.println("Based on Order Status");
        Order.performConditionallly(list,o->{return o.getOrder_status().equalsIgnoreCase("accepted")||
                o.getOrder_status().equalsIgnoreCase("completed");});
        //based on combine status
        System.out.println("-------------");

        System.out.println("Based on both ");
        Order.performConditionallly(list,o->{return o.getOrder_status().equalsIgnoreCase("accepted")||
                o.getOrder_status().equalsIgnoreCase("completed")
                && o.getOrder_price()>10000;});

    }
}
