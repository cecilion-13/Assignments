package co.harsh.Assignment1;

import java.util.Scanner;

public class Q7 {
    /**
     * this method search for an element in an array
     * @param args
     */
    public static void main(String[] args) {
        int[] arr = {5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number :");
        boolean b = false;
        int n = sc.nextInt();
        for(int i=0;i<15;i++){
            if(arr[i]==n){
                System.out.println("Number is present at "+(i+1)+" position");
                b=true;
                System.exit(0);
            }
        }
        if(!b){
            System.out.println("Number is not present in array");
        }

    }
}
