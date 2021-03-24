package co.harsh.Assignment1;

import java.util.Scanner;

public class Q6 {
    private static String name;
    private static String pass;

    /**
     * This method is validate the user by comparing
     * thier password and name if both are
     * same then user is validated
     * @param name name of the user
     * @param pass password of the user
     * @return integer value based on the result of comparison
     * 0 for No, 1 for Yes
     */
    public static int validateUser(String name,String pass) {
        if (name.equals(pass)) {
            return 1;
        }
        else{
                return 0;
        }
    }

    /**
     * This method accept a login details from the console
     */
    public static void getLoginInfo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name : ");
        name = sc.next();
        System.out.println("Enter Password : ");
        pass = sc.next();
    }

    /**
     * This method is initate the program and provide
     * output based on various details
     * @param args
     */
    public static void main(String[] args) {
        int count=0;
        while(count<3){
        getLoginInfo();
        int result = validateUser(name,pass);
        if(result==1){
            System.out.println("Welcome "+name);
            System.exit(0);
        }
        else{
            count++;
            if(count<=2)
            System.out.println("Incorrect Password \nLogin Again");
        }
        if(count==3){
            System.out.println("Attempt Exceeded \nContact Admin");
            System.exit(0);
        }
        }
    }
}
