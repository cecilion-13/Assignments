package co.harsh.Assignment2.Q5;

public class Line extends Shape{
private int length;

public Line(int length){
        this.length=length;
        }
@Override
public void draw() {
        System.out.print("Line is drawn of length:"+length+" ");
        for(int i=0;i<length;i++){
            System.out.print("-");
        }
    System.out.println();
        }

        }