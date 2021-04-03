package co.harsh.Assignment2.Q3;

public class SavingAccount extends Account{

    private int fdAmount;

    public SavingAccount(int fdAmount) {
        this.fdAmount = fdAmount;
    }

    @Override
    public int totalCash() {
        return fdAmount;
    }


}
