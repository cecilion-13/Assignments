package co.harsh.Assignment1;

public class Q1 {

    public static void checkArmstrong(int num){
        int sum=0;
        int n=num;
        int count = countDigit(num);
        while(n>0){
            sum=sum+addNum(n%10,count);
            n=n/10;
        }
        if(sum==num)
            System.out.println("It is an Armstrong Number");
        else
            System.out.println("Not a Armstrong Number");
    }

    public static int addNum(int n,int count){
        int num = n;
        if(count==1)
            return num;
        else {
            while (count > 1) {
                num = num * n;
                count--;
            }
        }
        return num;
    }
    public static void main(String[] args) {
       // checkArmstrong(153);
       // System.out.println(addNum(5,3));
       checkArmstrong(3170);
    }

    public static int countDigit(int n){
        int count=0;
        while(n>0){
            count++;
            n=n/10;
        }
        return count;
    }

}
