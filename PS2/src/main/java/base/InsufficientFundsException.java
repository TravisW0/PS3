package base;

import java.io.*;
/**
 * Custom class for throwing an insufficient funds exception
 * @author TravisW0
 *
 */
public class InsufficientFundsException extends Exception
{
   private double amount;
   /**
    * Create an instance of the InsufficientFundsException class, to be thrown to the caller
    * @param amount
    */
   public InsufficientFundsException(double amount)
   {
      this.amount = amount;
   } 
   public double getAmount()
   {
      return amount;
   }
}