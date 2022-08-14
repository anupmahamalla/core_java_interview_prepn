package multithreading.synchronization;

public class Account{
    private String accountType= "Saving";
    private int amount = 0;
    private int accountNumber;
    public void deposite(int depAmount){
        this.amount += depAmount;
    }
    public  void withdraw(int withdrawAmt){
        this.amount -= withdrawAmt;
    }
    public int getBalanceAmount(){
        return this.amount;
    }

    public Account(int amount){
        this.amount = amount;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }
}
