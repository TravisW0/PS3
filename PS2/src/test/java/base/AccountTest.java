package base;

import static org.junit.Assert.*;
import org.junit.Test;

public class AccountTest {


	@Test
	public void test() throws InsufficientFundsException {
		Account instance = new Account();
		instance.setId(1122);
		instance.setBalance(20000);
		instance.setAnnualInterstRate(4.5);
		instance.withdraw(2500);
		instance.deposit(3000);
		
		assertEquals(1122,instance.getId());
		assertEquals(20500,instance.getBalance(),0);
		assertEquals(4.5,instance.getAnnualInterestRate(),0);
		
		System.out.println(instance.getId());
		System.out.println(instance.getBalance());
		System.out.println(instance.getMonthlyInterestRate());	
	}
	
	@Test(expected=InsufficientFundsException.class)
	public void test2() throws InsufficientFundsException {
		Account instance = new Account();
		instance.deposit(1000);
		instance.withdraw(1010);
	}
	
	
	
}