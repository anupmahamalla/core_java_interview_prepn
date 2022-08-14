package multithreading.synchronization;

import java.util.List;

public class Transaction implements Runnable {
    private Account fromAccount;
    private Account toAccount;
    private List<Account> accountList;
    private Bank bank;


    public Transaction(Bank bank,  Account fromAccount, Account toAccount) {
        this.bank = bank;
        this.fromAccount = fromAccount;
        this.toAccount = toAccount;
    }

    public void run() {
        for(int i=0;i<5;i++){

            if (toAccount == fromAccount) continue;

            int amount = (int) (Math.random() * 10);

            if (amount == 0) continue;

            bank.transfer(fromAccount, toAccount, amount);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}