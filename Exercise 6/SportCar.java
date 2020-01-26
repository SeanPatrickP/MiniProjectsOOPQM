class SportCar extends Vehicle{
    private double topspeed;
    
public SportCar(double horsepw, double wei, double topsp) {
    super(horsepw, 0.5, wei);
    topspeed = topsp;
}    
    public double gettopspeed(){   
    return(topspeed);
} 
}