public class Driver {
  public static void main(String[]args){
  //new BankAccount using constructor
  BankAccount a =  new BankAccount(125.00,123,"abc123");
  System.out.println(a);
  // should print 123     125.00
  System.out.println(a.deposit(100));
  //should print true;
  System.out.println(a.getBalance());
  //should print 225
  System.out.println(a.deposit(-100));
}
}
