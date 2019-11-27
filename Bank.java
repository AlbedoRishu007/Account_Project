import java.util.Scanner;
import java.io.File;
import java.io. IOException;
class BankAccount{
 
  private double balance;
  private int accountNumber;
  private static int lastAccountNumber = 0;


  public BankAccount(double intialBalance)
  {
    balance = intialBalance;
    accountNumber = lastAccountNumber + 1;
    lastAccountNumber = accountNumber;
  }


  public void deposit(double depositAmount)
  {
    balance += depositAmount;
  }


  public boolean withdraw(double withdrawAmount)
  {
    if (withdrawAmount > balance){    
      System.out.println("Insufficient Funds!!!");
      return false;
    } else {
      balance -= withdrawAmount;
      return true;
    }
  }


  public int getNumber()
  {
    return accountNumber;
  }


  public double getBalance()
  {
    return balance;
  }


    public static void main(String[] args){
    Scanner in = new Scanner(System.in);

    BankAccount account = new BankAccount(1000);
    account.deposit(500);
    account.withdraw(50);

    System.out.println("BankAccount " + account.getNumber());
    System.out.println("Has a balance of " + account.getBalance());
  }

}
 
class BankTest{
    public static void main(String[] args){
    Scanner in = new Scanner(System.in);

    BankAccount account = new BankAccount(1000);
    account.deposit(500);
    account.withdraw(50);

    System.out.println("BankAccount " + account.getNumber());
    System.out.println("Has a balance of " + account.getBalance());
  try{
     File file = new File("C:\\Users\\cdac\\Desktop\\Bank_Project\\Bank.txt");
     if(file.createNewFile())
     System.out.println("Success!");
     else
     System.out.println("Error! File already Exists");
  }catch(IOException e){
    e.printStackTrace();
  }



}
}