package co.harsh.Assignment1;

public class Q2 {

    public static void checkArmstrong(int num){
        int sum=0;
        int n=num;
        while(n>0){
            sum=sum+addNum(n%10);
            n=n/10;
        }
        if(sum==num)
            System.out.println(num);
    }

    public static int addNum(int n){
        return n*n*n;
    }
    public static void main(String[] args) {
          for(int i=100;i<=999;i++){
              checkArmstrong(i);
          }
    }


}