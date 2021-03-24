package co.harsh.Assignment1;

import java.util.Scanner;

public class Q5 {
    /**
     * this method return the tax amount based on ctc range
     * @param ctc is the total amount earned by the employee
     * @return the tax payable by the employee
     */
    public static double taxAmount(int ctc){
        if(ctc>=0 && ctc<=180000)
            return 0;
        else if(ctc>=181001 && ctc<=300000){
            return ctc*0.1;
        }
        else if(ctc>=300001 && ctc<=500000){
            return ctc*0.2;
        }
        else if(ctc>=500001 && ctc<=1000000) {
            return ctc * 0.3;
        }
        return 0.0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner((System.in));
        System.out.println("Enter CTC : ");
        int ctc = sc.nextInt();
        System.out.println("Tax Amount "+ taxAmount(ctc));
    }
}
