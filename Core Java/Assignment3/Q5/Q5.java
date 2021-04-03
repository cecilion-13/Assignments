package co.harsh.Assignment3.Q5;

/**
 * This is a class for question 5
 * where class name is Employee
 */
public class Q5 {
    private String name;
    public Q5(String name){
        this.name=name;
    }

    /**
     * This return fixed number
     * @return 10
     */
    @Override
    public int hashCode() {
        return 10;
    }

    @Override
    public boolean equals(Object obj) {
        return true;
    }



    public static void main(String[] args) {
        Q5 q = new Q5("Harry");
        System.out.println(q.equals(new Q5("Ram")));
        System.out.println(q.hashCode());
    }

    public String toString(){
        return name;
    }
}
