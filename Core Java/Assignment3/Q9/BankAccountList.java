package co.harsh.Assignment3.Q9;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class BankAccountList {

    public static void main(String[] args) {
        Set<SavingsAccount> accountsList = new TreeSet<>();
        SavingsAccount account1 = new SavingsAccount(1000,1001,"Ram","Yes");
        SavingsAccount account2 = new SavingsAccount(2000,1002,"Tom","No");
        SavingsAccount account3 = new SavingsAccount(14000,1003,"Ansh","Yes");
        SavingsAccount account4 = new SavingsAccount(11000,1004,"Zoya","No");

        accountsList.add(account1);
        accountsList.add(account2);
        accountsList.add(account3);
        accountsList.add(account4);


        Iterator<SavingsAccount> itr = accountsList.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        account1.deposit(1001,5000);
        account2.withdraw(1002,1000);

        System.out.println("---------------------------");
        Iterator<SavingsAccount> itr1 = accountsList.iterator();
        while(itr1.hasNext()){
            System.out.println(itr1.next());
        }


    }
}
