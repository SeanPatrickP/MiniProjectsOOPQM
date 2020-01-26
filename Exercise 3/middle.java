 class middle{
    
 public static void main(String[] args){
     
    if(args.length != 3)
    {
        System.out.println("Error in input");
        System.exit(0);
    } 
    
    double number1 = Double.parseDouble(args[0]);
    double number2 = Double.parseDouble(args[1]);
    double number3 = Double.parseDouble(args[2]);
    findmiddle(number1, number2, number3);
    
    }
 
 public static void findmiddle(double number1, double number2, double number3) {   
    double [] arrayToCompare = {number1, number2, number3};
     
    for(int pass = 0 ; pass < 2; pass++)
    {
        for(int i = 0 ; i < 2 ; i ++)
        {
            if(arrayToCompare[i] > arrayToCompare[i+1])
            {
                double temp = arrayToCompare[i+1];
                arrayToCompare[i+1] = arrayToCompare[i];
                arrayToCompare[i] = temp;
            }
        }    
 
    }
    
    System.out.println(arrayToCompare[1] + " is between " + arrayToCompare[0] + " and " + arrayToCompare[2]);
}
}