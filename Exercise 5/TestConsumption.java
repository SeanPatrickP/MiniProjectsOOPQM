class TestConsumption {
public static void main(String [] args) {
     Vehicle car1 = new SportCar(200.0,1500.0,220.0);
     Vehicle car2 = new SportCar(100.0,1000.0,170.0);
     Vehicle car3 = new SportCar(135.0,1100.2,173.0);
     Vehicle van1 = new Van(100, 0.9, 3500, 160.4);
     System.out.println("acceleration (from 0-60mph) for car 1 = " + car1.acceleration());
     System.out.println("acceleration (from 0-60mph) for car 2 = " + car2.acceleration());
     System.out.println("acceleration (from 0-60mph) for car 3 = " + car3.acceleration());
     System.out.println("acceleration (from 0-60mph) for van 1 = " + van1.acceleration());
}
}