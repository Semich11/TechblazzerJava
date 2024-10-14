package bank;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountTest {
    private Account account;

    @BeforeEach
    public void startEveryTestWithThis(){
        account = new Account("Chris", "Chima", "1", "correctPin");
    }

    @Test
    public void newAccount_balance(){
        assertEquals(0, account.getBalance("correctPin"));
    }

    @Test
    public void newAccount_balanceIsZeroTest(){
        assertEquals(0, account.getBalance("correctPin"));
    }

    @Test
    public void newAccountBalance2k_deposit1kBalanceIs3k(){
        account.deposit(2_000);
        account.deposit(1_000);
        assertEquals(3_000, account.getBalance("correctPin"));
    }

    @Test
    public void newAccount_balanceIs2KTest(){
        account.deposit(2_000);
        assertEquals(2_000, account.getBalance("correctPin"));
    }


    @Test
    public void newAccount_balanceIsStill2K(){
        account.deposit(2_000);
        account.deposit(-1_000);
        assertEquals(2_000, account.getBalance("correctPin"));
    }

    @Test
    public void newAccount_balanceIsStill0kWhenWithdraw1K(){
        account.withdraw(-1_000, "correctPin");
        assertEquals(0, account.getBalance("correctPin"));
    }

    @Test
    public void newAccount_balanceIs0kWhenWithdraw2K(){
        account.deposit(2_000);
        account.withdraw(2_000, "correctPin");
        assertEquals(0, account.getBalance("correctPin"));
    }

    @Test
    public void newAccount_balanceIsStill2KWhenWithdraw10K(){
        account.deposit(2_000);
        account.withdraw(10_000, "correctPin");
        assertEquals(2_000, account.getBalance("correctPin"));
    }

    @Test
    public void newAccount_balanceIs2KWithdraw1KBalanceIs1K(){
        account.deposit(2_000);
        account.withdraw(1_000, "correctPin");
        assertEquals(1_000, account.getBalance("correctPin"));
    }

    @Test
    public void newAccount_balanceIs1KWithdrawNegativeAmountBalanceIs1K(){
        account.deposit(1_000);
        account.withdraw(-1_000, "correctPin");
        assertEquals(1_000, account.getBalance("correctPin"));
    }

    @Test
    public void newAccount_changePinTest(){
        account.changePin("correctPin","wrongPin");
        account.deposit(5_000);
        account.withdraw(1_000, "wrongPin");
        assertEquals(4_000, account.getBalance("wrongPin"));

    }

    @Test
    public void newAccount_testThatTheOldPinIsIncorrect(){
        account.changePin("correctpin","wrongPin");
        account.deposit(5_000);
        assertEquals(0, account.getBalance("wrongPin"));
    }

}
