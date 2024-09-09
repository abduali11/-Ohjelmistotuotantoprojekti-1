import org.junit.Test;
import static org.junit.Assert.*;


public class AccountTest {

    @Test
    public void testDeposit() {
        Account account = new Account();
        account.deposit(100.0);
        assertEquals(100.0, account.getBalance(), 0.0);
    }

    @Test
    public void testWithdraw() {
        Account account = new Account();
        account.deposit(100.0);
        assertEquals(50.0, account.withdraw(50.0), 0.0);
        assertEquals(50.0, account.getBalance(), 0.0);
    }

    @Test
    public void testOverBalance() {
        Account account = new Account();
        account.deposit(100.0);
        assertEquals(0.0, account.withdraw(200.0), 0.0);
        assertEquals(100.0, account.getBalance(), 0.0);
    }
}