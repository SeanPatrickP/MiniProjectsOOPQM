class TestCounter {
    public static void main(String [] args) {
        Counter ctr = new Counter();
        ctr.increment();
        System.out.println(ctr.getValue());    
        ctr.reset();
        System.out.println(ctr.getValue());  
        Counter ctr2 = new Counter(10);
        
        
        
    }
}   