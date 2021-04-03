package co.harsh.Assignment4.Q2;

import java.util.List;

public class Order {
    private int order_id;
    private int order_price;
    private String order_status;

    public Order(int order_id, int order_price, String order_status) {
        this.order_id = order_id;
        this.order_price = order_price;
        this.order_status = order_status;
    }

    public int getOrder_id() {
        return order_id;
    }

    public void setOrder_id(int order_id) {
        this.order_id = order_id;
    }

    public int getOrder_price() {
        return order_price;
    }

    public void setOrder_price(int order_price) {
        this.order_price = order_price;
    }

    public String getOrder_status() {
        return order_status;
    }

    public void setOrder_status(String order_status) {
        this.order_status = order_status;
    }

    @Override
    public String toString() {
        return "Order{" +
                "order_id=" + order_id +
                ", order_price=" + order_price +
                ", order_status='" + order_status + '\'' +
                '}';
    }

    public static void performConditionallly(List<Order> list, Condition cond){
        for(Order o:list){
            if(cond.test(o)) {
                System.out.println(o);
            }
        }
    }
}
@FunctionalInterface
interface Condition{
    boolean test(Order o);
}