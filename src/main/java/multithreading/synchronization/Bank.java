package multithreading.synchronization;

import java.util.ArrayList;
import java.util.List;

public class Bank {

    public static int MAX_BANK_ACCOUNTS = 10;
    private int MAX_BANK_DEPOSITE = 10;
    private int MAX_BANK_WITHDRAW = 10;
    private int INITIAL_BALANCE = 100;
    Account account;
    List<Account> accountList = new ArrayList<Account>(MAX_BANK_ACCOUNTS);

    public synchronized void   transfer(Account fromAccount, Account toAccount, int amount) {

        if (amount > fromAccount.getBalanceAmount()) {
        } else if (fromAccount.getAccountNumber() == toAccount.getAccountNumber()) {
        } else {

            int beforeAmountforto = toAccount.getBalanceAmount();
            int beforeAmountforfrom = fromAccount.getBalanceAmount();

            fromAccount.withdraw(amount);
            toAccount.deposite(amount);
            int toAccountNumber = toAccount.getAccountNumber();
            int fromAccountNumber = fromAccount.getAccountNumber();

            String message = "%s transfered %d from Account: %d to Account: %d\n";
            String threadName = Thread.currentThread().getName();

            System.out.printf(message, threadName, amount, fromAccountNumber, toAccountNumber);

            String message3 = "Total balance: From_Account : %d is : %d from %d\n";
            System.out.printf(message3, fromAccountNumber, fromAccount.getBalanceAmount(), beforeAmountforfrom);

            String message2 = "Total balance: To_Account : %d is : %d from %d\n";
            System.out.printf(message2, toAccountNumber, toAccount.getBalanceAmount(), beforeAmountforto);

            accountList.add(toAccount);
            accountList.add(fromAccount);
        }
    }

    public List getAccountDetailsFromBank() {
        List<Account> accountList = new ArrayList<>(MAX_BANK_ACCOUNTS);
        for (int i = 1; i <= MAX_BANK_ACCOUNTS; i++) {
            Account account = new Account(INITIAL_BALANCE);
            account.setAccountNumber(i);
            accountList.add(account);
        }
        return accountList;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public List<Account> getAccountList() {
        return accountList;
    }

    public void setAccountList(List<Account> accountList) {
        this.accountList = accountList;
    }
}