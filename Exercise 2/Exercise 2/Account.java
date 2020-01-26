class Account{
    private double balance;
    private double interestRate;
    public Account(double initialBalance){
        balance = initialBalance;
        
    }
    public Account(){
        balance = 0;
        
    }
    
    public void deposit(double amount) {   
        balance += amount;
    }    
    
    public void withdraw(double amount) {   
        balance -= amount;
    }        
    
    public double getBalance() {  
        return balance;
    }    
    
    public double getInterest() {  
        return interestRate;
    } 
    
    public void setBalance(double newBalance) {  
        balance = newBalance;
    }    
    
    public void setInterest(double rate) {
        interestRate = rate;
    }
    
    public double computeInterest(int n) {
        return( balance * Math.pow((1+interestRate),(n/12)));
    }
}