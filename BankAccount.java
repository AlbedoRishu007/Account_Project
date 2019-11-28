import java.util.Scanner;
import java.io.*;

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
  
}  
 
class AccountTest{
    public static void main(String[] args){
    Scanner in = new Scanner(System.in);

    BankAccount account = new BankAccount(1000);
    BankAccount account1 = new BankAccount(500);
    account.deposit(500);
    account.withdraw(50);
    

    System.out.println("BankAccount " + account.getNumber());
    System.out.println("Has a balance of " + account.getBalance());
  try{
     File file = new File("C:\\Users\\cdac\\Desktop\\Bank_Project\\Bank.docx");
     BufferedWriter out = new BufferedWriter(new FileWriter("Bank.docx"));
     out.write(String.valueOf("AccountNumber"+ "\t" + "Amount"+"\n"));
     out.close();
     if(file.createNewFile())
     System.out.println("Success!");
     else
     System.out.println("Error! File already Exists");
    }
    catch(IOException e)
    {
    e.printStackTrace();
    }

  try{
     BufferedWriter out = new BufferedWriter(new FileWriter("Bank.docx",true));
     out.write(String.valueOf(account.getNumber() + "\t"));
     out.write(String.valueOf(account.getBalance() +"\n"));
     out.write(String.valueOf(account1.getNumber() +"\t"));
     out.write(String.valueOf(account1.getBalance()+"\n"));

     
     out.close();
     System.out.println("File Created successfully");
  }
  catch(IOException e){}
}
}

