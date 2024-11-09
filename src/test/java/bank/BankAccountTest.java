package bank;

import com.gdn.testcasemanagement.BankAccount;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BankAccountTest {
    BankAccount bankAccount;
    @Before
    public void initailize(){
        bankAccount = new BankAccount("1","sai");
    }

    @Test
    public void checkAccountNumber(){
        BankAccount bankAccount=new BankAccount();
        bankAccount.setAccountHolderName("ssai");
        System.out.println(bankAccount.getAccountHolderName());
        assertEquals(bankAccount.getAccountHolderName(),"ssa");
    }

    @Test
    public void checkBankConstructor(){
        assertEquals(bankAccount.getAccountNumber(),"1");
        assertEquals(bankAccount.getAccountHolderName(),"sai");
        assertEquals(bankAccount.getBalance(),0,0.0);
    }
    @Test
    public void testDeposit(){
        bankAccount.deposit(10);
        assertEquals(bankAccount.getBalance(),10,0.0);
        assertEquals(bankAccount.getBalance(),10,0.0);
    }
    @Test
    public void testDepositNegative(){
        bankAccount.deposit(-10);
        assertEquals(bankAccount.getBalance(),0,0.0);
    }
    @Test
    public void testDepositZero(){
        bankAccount.deposit(0);
        assertEquals(bankAccount.getBalance(),0,0.0);
    }
    @Test
    public void testWithdraw(){
        bankAccount.deposit(10);
        bankAccount.withdraw(12);
        assertEquals(bankAccount.getBalance(),10,0.0);
    }


}
