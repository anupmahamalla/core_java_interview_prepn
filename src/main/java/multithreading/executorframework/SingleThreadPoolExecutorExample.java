package multithreading.executorframework;

import multithreading.synchronization.Account;
import multithreading.synchronization.Bank;
import multithreading.synchronization.Transaction;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingleThreadPoolExecutorExample {

    public static void main(String[] args) {
        Bank bank = new Bank();
        List<Account> accountList = new Bank().getAccountDetailsFromBank();
        bank.setAccountList(accountList);


        ExecutorService executorService = Executors.newFixedThreadPool(3);

        for( int i= 1; i< 10;i++) {
            int toAccountNum = (int) (Math.random() * 10);
            int fromAccountNum = (int) (Math.random() * 10);

            Account fromAccount = accountList.get(fromAccountNum);
            Account toAccount = accountList.get(toAccountNum);

            if(fromAccountNum==0 || toAccountNum ==0){
                String msg = "Either from account or To account is 0 which is not acceptable: fromAccountNum : %d And toAccountNum = %d \n";
                System.out.printf(msg, fromAccountNum, toAccountNum);

            }

            Thread t = new Thread(new Transaction(bank,fromAccount ,toAccount));
            executorService.execute(t);
        }
        executorService.shutdown();





    }
}
