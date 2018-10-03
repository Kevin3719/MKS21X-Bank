public class BankAccount {
  private double balance;
  private int accountID;
  private String password;

  public BankAccount(double b,int a, String p) {
    balance = b;
    accountID = a;
    password = p;
  }
  public double getBalance() {
    return balance;
  }
  public int getAccountID() {
    return accountID;
  }
  public void setPassword(String newPassword) {
    password = newPassword;
  }
  public String toString() {
    return accountID + "      " + balance;
  }
  public boolean deposit(double money) {
    if (money >= 0) {
      balance += money;
      return true;
    }
    return false;
  }
}
