package co.harsh.Assignment1;

public class Q3 {
    /**
     * this method calculate the simple interest based on
     * user input
     * @param p is the principal amount
     * @param r is the rate at which interest is calculated
     * @param t is the time period for interest
     * @return the simple interest in integer
     */
    public static int simpleInterest(int p,int r,int t){
        return (p*r*t)/100;
    }

    /**
     * this method is calculate the compund interest
     * and return the round figure for interest
     * @param p is the principal amount
     * @param rate is the precentage charged
     * @param t is the time period
     * @param n is the number of times interest is compounded
     * @return the compound interest in integer round off value.
     */
    public static double compoundInterest(int p,double rate,int t,int n){
        int count = n*t;
        double r = rate/100;
        double num1 = 1+(r/n);
        double num2 = num1;
        while(count>1){
            num1 = num1 * num2;
            count--;
        }
        double result = p*num1;
        return result;
    }

    public static void main(String[] args) {
        System.out.println(simpleInterest(1000,1,1));
        System.out.println(Math.round(compoundInterest(5000,5,10,12)));
    }
}
