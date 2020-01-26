class Vehicle {
    private double horsepower;
    private double aerodynamics;
    private double weight;

public Vehicle(double horsepw, double aerodn, double wei) {
    horsepower = horsepw;
    aerodynamics = aerodn;
    weight = wei;
}
public double gethorsepower(){   
    return(horsepower);
}
public double getaerodynamics(){   
    return(aerodynamics);
}    
public double getwieght(){   
    return(weight);
} 
public double acceleration() {
    return((100/horsepower)*aerodynamics*weight/100);
}       
}