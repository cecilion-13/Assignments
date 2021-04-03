package co.harsh.Assignment2.Q5;

public class Cube extends Shape{
    private int length;
    private int breadth;
    private int height;

    public Cube(int length,int breadth,int height){
        this.length=length;
        this.breadth=breadth;
        this.height=height;
    }
    @Override
    public void draw() {
        System.out.println("Cube is drawn of length:"+length+", breadth:"+breadth+", height:"+height);
    }
}
