package co.harsh.Assignment2.Q5;

public class Rectangle extends Shape{

    private int length;
    private int breadth;

    public Rectangle(int length,int breadth){
        this.length=length;
        this.breadth=breadth;
    }
    @Override
    public void draw() {
        System.out.println("Rectangle is drawn of length:"+length+", breadth:"+breadth);

    }


}
