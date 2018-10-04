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
  //should print false
  if(a.withdraw(100)) {
    System.out.println("withdraw Success");
  } else {
    System.out.println("withdraw Failure");
  }
  // should print Success
  if(a.withdraw(1000)) {
    System.out.println("withdraw Success");
  } else {
    System.out.println("withdraw Failure");
  }
  // should print Failure
  BankAccount b = new BankAccount(200.00,124,"efg456");
  if(a.transferTo(b,100,"abc123")) {
    System.out.println("withdraw Success");
  } else {
    System.out.println("withdraw Failure");
  }
  //should be Success
  System.out.println(a);
  //should print 123 25.00
  System.out.println(b);
  //should print 124 300.00
  if(b.transferTo(a,400,"efg456")) {
    System.out.println("withdraw Success");
  } else {
    System.out.println("withdraw Failure");
  }
  //should be Failure
  System.out.println(a);
  //should print 123 25.00
  System.out.println(b);
  //should print 124 300.00
}
}
