package co.harsh.Assignment4.Q1;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        System.out.println("Enter two numbers:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();


        int add = performOperations(a,b,(a1 ,b1)-> {return a1+b1;});
        System.out.println("Addition of two number is " +add );

        int sub = performOperations(a,b,(a1 ,b1)-> {return a1-b1;});
        System.out.println("Subtraction of two number is " +sub );
        int mul = performOperations(a,b,(a1 ,b1)-> {return a1*b1;});
        System.out.println("Multiplication of two number is " +mul );
        int div = performOperations(a,b,(a1 ,b1)-> {
            try {
                int result = a1 / b1;
            }
            catch(ArithmeticException e){
                return 0;
            }
            return a1/b1;});
        System.out.println("Division of two number is " +div );

    }

    private static Integer performOperations(Integer a,Integer b,Operations op){
     return op.perform(a,b);
    }
}

@FunctionalInterface
interface Operations{
    Integer perform(Integer a,Integer b);
}