package co.harsh.Assignment2.Q5;

public class Test {
    public static void main(String[] args) {
        Shape rect = new Rectangle(4,5);
        rect.draw();

        Shape line = new Line(4);
        line.draw();

        Shape cube = new Cube(4,5,6);
        cube.draw();
    }
}
