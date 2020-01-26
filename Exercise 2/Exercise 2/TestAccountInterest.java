class TestAccountInterest {
 public static void main(String [] args){
     Account newAcc = new Account(500);
     newAcc.deposit(110);
     newAcc.withdraw(10);
     newAcc.setInterest(0.1);
     System.out.println(newAcc.computeInterest(12));
     System.out.println(newAcc.computeInterest(24));
     
     Account newAcc2 = new Account(100);
     newAcc2.deposit(110);
     newAcc2.withdraw(110);
     newAcc2.setInterest(0.1);
     System.out.println(newAcc2.computeInterest(12));
     System.out.println(newAcc2.computeInterest(24));
     
     Account newAcc3 = new Account();
     newAcc3.deposit(110);
     newAcc3.withdraw(110);
     newAcc3.setInterest(0.1);
     System.out.println(newAcc3.computeInterest(12));
     System.out.println(newAcc3.computeInterest(24));
 }
}