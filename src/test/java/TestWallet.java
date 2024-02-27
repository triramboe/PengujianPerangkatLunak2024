import org.example.Wallet;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestWallet {




    @Test
    void testAddMoney() {
        Wallet wallet = new Wallet("John Doe");
        wallet.addMoney(10000);
        wallet.addMoney(5000);
        assertEquals(1, wallet.getMoneys().get(10000));
        assertEquals(1, wallet.getMoneys().get(5000));
    }

    @Test
    void testAddCoin() {
        Wallet wallet = new Wallet("John Doe");
        wallet.addCoin(500);
        wallet.addCoin(1000);
        assertEquals(1, wallet.getCoins().get(500));
        assertEquals(1, wallet.getCoins().get(1000));
    }

    @Test
    void testAddCard() {
        Wallet wallet = new Wallet("John Doe");
        wallet.addCard("Credit Card");
        wallet.addCard("Debit Card");
        assertEquals(2, wallet.getCards().size());
        assertTrue(wallet.getCards().contains("Credit Card"));
        assertTrue(wallet.getCards().contains("Debit Card"));
    }

    @Test
    void testTakeCard() {
        Wallet wallet = new Wallet("John Doe");
        wallet.addCard("Credit Card");
        wallet.addCard("Debit Card");
        wallet.takeCard("Credit Card");
        assertEquals(1, wallet.getCards().size());
        assertFalse(wallet.getCards().contains("Credit Card"));
    }

    @Test
    void testTakeCoins() {
        Wallet wallet = new Wallet("John Doe");
        wallet.addCoin(500);
        wallet.addCoin(1000);
        wallet.takeCoins(1000);
        assertEquals(1, wallet.getCoins().get(500));
        assertEquals(0, wallet.getCoins().get(1000));
    }

    @Test
    void testTakeMoneys() {
        Wallet wallet = new Wallet("John Doe");
        wallet.addMoney(10000);
        wallet.addMoney(5000);
        wallet.takeMoneys(10000);
        assertEquals(0, wallet.getMoneys().get(10000));
        assertEquals(1, wallet.getMoneys().get(5000));
    }

    @Test
    void testGetMoneyAvailable() {
        Wallet wallet = new Wallet("John Doe");
        wallet.addMoney(10000);
        wallet.addCoin(500);
        assertEquals(10500, wallet.getMoneyAvailable());
    }
}
