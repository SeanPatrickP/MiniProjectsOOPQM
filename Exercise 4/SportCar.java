class SportCar extends Vehicle{
    private double topspeed;
    
public SportCar(double arg1, double arg3, double arg4) {
    super(arg1, 0.5, arg3);
    topspeed = arg4;
}    
    public double gettopspeed(){   
    return(topspeed);
}    
}