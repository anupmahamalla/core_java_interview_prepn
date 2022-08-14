package multithreading.synchronization;

import java.util.List;

public class BankAccountSyncExample {

    public static void main(String[] args) {
        Bank bank = new Bank();
        List<Account> accountList = new Bank().getAccountDetailsFromBank();
        bank.setAccountList(accountList);


        for( int i= 0; i< 10;i++) {
            int toAccountNum = (int) (Math.random() * 10);
            int fromAccountNum = (int) (Math.random() * 10);

            Account fromAccount = accountList.get(fromAccountNum);
            Account toAccount = accountList.get(toAccountNum);

            Thread t = new Thread(new Transaction(bank,fromAccount ,toAccount));
            t.start();
        }
        }
}



