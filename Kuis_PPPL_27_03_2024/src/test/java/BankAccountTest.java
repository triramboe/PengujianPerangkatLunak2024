import org.example.BankAccount;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BankAccountTest {

    @Test
    public void testAccountNumber(){
        BankAccount account = new BankAccount("12345", 1000);
        Assertions.assertTrue(account.getAccountNumber().equals("12345"));
    }

    @Test
    public void testDeposit(){
        BankAccount account = new BankAccount("12345", 1000);
        account.deposit(400);
        Assertions.assertEquals(1400, account.getBalance());
    }

    @Test
    public void testWithdraw(){
        BankAccount account = new BankAccount("12345", 1000);
        account.withdraw(100);
        Assertions.assertEquals(900, account.getBalance());
    }

//    @Test
//    public void testTransferFunds(){
//        BankAccount account = new BankAccount("12345", 1000);
//        account.transferFunds(new BankAccount("6789", 800), 600);
//        Assertions.assertEquals(400, account.getBalance());
//    }

    @Test
    public void testTransferFunds(){
        BankAccount account = new BankAccount("12345", 1000);
        BankAccount recipient = new BankAccount("6789", 800);
        account.transferFunds(recipient, 600);
        Assertions.assertEquals(400, account.getBalance());
        Assertions.assertEquals(1400, recipient.getBalance());
    }

}
