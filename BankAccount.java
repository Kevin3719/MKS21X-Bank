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
  public boolean withdraw(double money) {
    if (money <= balance) {
      balance -= money;
      return true;
    }
    return false;
  }
  private boolean authenticate(String password) {
	return this.password.equal(password);
}
  public boolean transferTo(BankAccount other, double amount, String password) {
	if (authenticate(password))
		{if (withdraw(amount) && other.deposit(amount)}
			{return true;}
	return false;
}
}
