package co.harsh.Assignment2.Q3;

public class CurrentAccount extends Account{

    private int cashCreditAmount;

    public CurrentAccount(int cashCreditAmount) {
        this.cashCreditAmount = cashCreditAmount;
    }

    @Override
    public int totalCash() {
        return cashCreditAmount;
    }
}
