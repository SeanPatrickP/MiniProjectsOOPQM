class Van extends Vehicle{
    private double carryweight;
    
public Van(double horsepw, double aerodn, double wei, double cwei) {
    super(horsepw, aerodn, wei);
    carryweight = cwei;  
}   
public double getcarryweight() {
    return carryweight;
}
public double acceleration() {
    return((100/gethorsepower())*(getaerodynamics()/2)*getwieght()/100);
}   
}