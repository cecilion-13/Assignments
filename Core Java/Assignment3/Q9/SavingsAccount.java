package co.harsh.Assignment3.Q9;

/**
 * This class responsible for
 * contains details of saving account of a person
 */
public class SavingsAccount implements Comparable<SavingsAccount>{
    private int acc_balance;
    private int acc_ID;
    private String accountHoldername;
    private String isSalaryAccount;

    /**
     * create a object of Saving Account class which contain following things
     * @param acc_balance is the present amount in the account
     * @param acc_ID is the unique ID of saving account
     * @param accountHoldername name of account holder
     * @param isSalaryAccount check for status whether is salary account or not
     */
    public SavingsAccount(int acc_balance, int acc_ID, String accountHoldername, String isSalaryAccount) {
        this.acc_balance = acc_balance;
        this.acc_ID = acc_ID;
        this.accountHoldername = accountHoldername;
        this.isSalaryAccount = isSalaryAccount;
    }

    /**
     * return account balance
     * @return
     */
    public int getAcc_balance() {
        return acc_balance;
    }

    /**
     * set balance of the account
     * @param acc_balance new updated balance for an object
     */
    public void setAcc_balance(int acc_balance) {
        this.acc_balance = acc_balance;
    }

    /**
     *
     * @return id of account
     */
    public int getAcc_ID() {
        return acc_ID;
    }

    /**
     *
     * @return account Holder name
     */
    public String getAccountHoldername() {
        return accountHoldername;
    }


    /**
     *
     * @return whether it is salary account or not
     */
    public String isSalaryAccount() {
        return isSalaryAccount;
    }

    /**
     *
     *
     * @param salaryAccount
     */
    public void setSalaryAccount(String salaryAccount) {
        isSalaryAccount = salaryAccount;
    }

    @Override
    public String toString() {
        return "SavingsAccount{" +
                "acc_balance=" + acc_balance +
                ", acc_ID=" + acc_ID +
                ", accountHoldername='" + accountHoldername + '\'' +
                ", isSalaryAccount=" + isSalaryAccount +
                '}';
    }

    @Override
    public int compareTo(SavingsAccount obj){
        return acc_ID-obj.getAcc_ID();
    }

    public String  withdraw(int acc_ID,int amount){
        if(acc_balance>=amount){
            acc_balance=acc_balance-amount;
            return "Withdraw Successful";
        }
        else{
            return "Withdraw UnSuccessful due to insufficient balance";
        }
    }

    public String deposit(int acc_ID,int amount){
        if(amount>0){
            acc_balance = acc_balance+amount;
            return "Deposit Successful";
        }

        else
            return "Deposit UnSuccessful due to invalid amount";
    }
}
