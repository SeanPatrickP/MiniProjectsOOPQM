class TestConsumption {
public static void main(String [] args) {
     SportCar car1 = new SportCar(200.0,1500.0,220.0);
     double fuelConsumption1 = (1000+(car1.getwieght()/5))*(car1.gettopspeed()/100)*(car1.getaerodynamics()*car1.gethorsepower())/10000;
     SportCar car2 = new SportCar(100.0,1000.0,170.0);
     double fuelConsumption2 = (1000+(car2.getwieght()/5))*(car2.gettopspeed()/100)*(car2.getaerodynamics()*car2.gethorsepower())/10000;
     SportCar car3 = new SportCar(135.0,1100.2,173.0);
     double fuelConsumption3 = (1000+(car3.getwieght()/5))*(car3.gettopspeed()/100)*(car3.getaerodynamics()*car3.gethorsepower())/10000;
     System.out.println("fuel consumption for car 1 = " + fuelConsumption1);
     System.out.println("fuel consumption for car 2 = " + fuelConsumption2);
     System.out.println("fuel consumption for car 3 = " + fuelConsumption3);
}
}