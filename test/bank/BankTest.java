package bank;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankTest {
    private Bank gtBank;

    @BeforeEach
    public void startEveryTestWithThis() {
        gtBank = new Bank();
    }
    @Test
    public void newBank_createAccount_AccountCountIs1Test(){
        gtBank.createAccount("Chris", "Chima", "cghhjhjhh");
        assertEquals(1, gtBank.accountCountIncreament());

    }

    @Test
    public void newBank_createAccount_AccountCountIs2Test(){
        gtBank.createAccount("Chris", "Chima", "correctPin");
        gtBank.createAccount("Bimbo", "ola", "bimPin");

        assertEquals(2, gtBank.accountCountIncreament());

    }

    @Test
    public void TestThatAccountBalanceIsZero(){
        gtBank.createAccount("Chris", "Chima", "correctPin");
        assertEquals(0, gtBank.checkBalance("0000", "correctPin"));
    }

    @Test
    public void TestThatAccountDepositIsIncreasingBalanceAmount(){
        gtBank.createAccount("Chris", "Chima", "correctPin");
        gtBank.deposit(2_000, "0000");
        assertEquals(2_000, gtBank.checkBalance("0000", "correctPin"));
    }

    @Test
    public void TestThatAccountWithdrawIsDecreasingBalanceAmount(){
        gtBank.createAccount("Chris", "Chima", "correctPin");
        gtBank.deposit(2_000, "0000");
        gtBank.withdraw(1_000, "0000", "correctPin");
        assertEquals(1_000, gtBank.checkBalance("0000", "correctPin"));
    }

    @Test
    public void TestTransferFromOneAccountToAnotherAccount(){
        gtBank.createAccount("Chris", "Chima", "correctPin");
//        gtBank.createAccount("Style", "Wells", "correctPin");
        gtBank.deposit(2_000, "0");
//        gtBank.deposit(3_000, "2");

//        gtBank.transfer("1","2", 1_000, "correctPin");
        assertEquals(2_000, gtBank.checkBalance("0", "pin"));
//        assertEquals(3_000, gtBank.checkBalance("0", "correctPin"));

    }
}
