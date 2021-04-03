package co.harsh.Assignment2.Q3;

public class Test {
    public static void main(String[] args) {
        Account savingAccount = new SavingAccount(5000);
        Account currentAccount = new CurrentAccount(4100);

        System.out.println(savingAccount.totalCash());
        System.out.println(currentAccount.totalCash());

    }
}
