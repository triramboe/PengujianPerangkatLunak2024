
import org.example.Wallet;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class TestWallet {

        @Test
        public void testAddMoney() {
            Wallet wallet = new Wallet("Ram");
            wallet.addMoney(10000);
            Assertions.assertEquals(1, wallet.getMoneys());
        }

        @Test
        public void testAddCoin() {
            Wallet wallet = new Wallet("Ram");
            wallet.addCoin(500);
            wallet.addCoin(200);
            Assertions.assertEquals(2, wallet.getCoins());
        }

        @Test
        public void testAddCard() {
            Wallet wallet = new Wallet("Ram");
            wallet.addCard("Credit Card");
            wallet.addCard("ATM Card");
            Assertions.assertEquals(2, wallet.getCards().size());
        }

        @Test
        public void testTakeCard() {
            Wallet wallet = new Wallet("Ram");
            wallet.addCard("Credit Card");
            wallet.addCard("Credit Card");
            wallet.takeCard("Credit Card");
            Assertions.assertEquals(0, wallet.getCards().size());
        }


        @Test
        public void testTakeCoins() {
            Wallet wallet = new Wallet("Ram");
            wallet.addCoin(500);
            wallet.takeCoins(500);
            Assertions.assertEquals(0, wallet.getCoins());
        }

        @Test
        public void testTakeMoneys() {
            Wallet wallet = new Wallet("Ram");
            wallet.addMoney(10000);
            wallet.takeMoneys(10000);
            Assertions.assertEquals(0, wallet.getMoneys());
        }

        @Test
        public void testCalculateCoins() {
            Wallet wallet = new Wallet("Ram");
            wallet.addCoin(500);
            wallet.addCoin(100);
            Assertions.assertEquals(600, wallet.calculateCoins());
        }

        @Test
        public void testCalculateMoneys() {
            Wallet wallet = new Wallet("Ram");
            wallet.addMoney(10000);
            wallet.addMoney(5000);
            Assertions.assertEquals(15000, wallet.calculateMoneys());
        }

        @Test
        public void testGetMoneyAvailable() {
            Wallet wallet = new Wallet("Ram");
            wallet.addMoney(10000);
            wallet.addCoin(500);
            Assertions.assertEquals(10500, wallet.getMoneyAvailable());
        }
    }



