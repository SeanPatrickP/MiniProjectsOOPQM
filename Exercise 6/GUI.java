import java.awt.event.*;
import java.awt.*;
//The below implements the interface ActionListener which is a Java class that allows for this event binding, we also extend the frame to use as acontainer for these components - this is a form of multiple inheritence
public class GUI extends Frame implements ActionListener
{
    //We create instance variables for the textfield objects so we can then obtain the value from them in a separate method
    
    private TextField horsepower;
    private TextField aerodynamics;
    private TextField weight;
    private TextField carryWeight;
    private TextField topSpeed;
    private TextField details =  new TextField("",10);
    private static String newDetails;
    
    public GUI()
    {
      //In this below block we inherit the Java class frame (container) which we then use the constructor in this class to set the properties of the window fram
      super("button");
      setSize(800,800);
      setVisible(true);
      setLayout(new FlowLayout());
      newDetails = "";
      //The below buttons we create 
      Button van = new Button("Add Van");
      //Add to the frame as a component
      add(van);
      van.addActionListener(this);
      Button car = new Button("Add Sport Car");
      //Add to the frame as a component
      add(car);
      //Then event bind the component
      car.addActionListener(this);
      
      Button refresh = new Button("Refresh");
      add(refresh);
      refresh.addActionListener(this);
      
      Label detailsLabel = new Label("acceleration (from 0-60mph)");
      add(detailsLabel);

      add(details);
    }
    public GUI(String typeOfVehicle)
    {
      super("pop up");
      setSize(800,800);
      setVisible(true);
      setLayout(new FlowLayout());
      
      Label horsepowerLabel = new Label("horsepower");
      add(horsepowerLabel);
      
      horsepower=new TextField("", 10);
      add(horsepower);
      
      Label aerodynamicsLabel = new Label("aerodynamics");
      add(aerodynamicsLabel);
      
      if(typeOfVehicle.equals("Van"))
     {
      aerodynamics = new TextField("", 10);
      add(aerodynamics);
     }
      else if(typeOfVehicle.equals("Sport Car"))
     {
      aerodynamics = new TextField("0.5", 10);
      add(aerodynamics);
     }  
      
     if(typeOfVehicle.equals("Van"))
     {
      Label carryWeightLabel = new Label("carry weight");
      add(carryWeightLabel);
      carryWeight = new TextField("", 10);
      add(carryWeight);
     }
     if(typeOfVehicle.equals("Sport Car"))
     {
      Label topSpeedLabel = new Label("top speed");
      add(topSpeedLabel);
      topSpeed = new TextField("", 10);
      add(topSpeed);
     }
      
      Label weightLabel = new Label("weight");
      add(weightLabel);
      
      weight = new TextField("", 10);
      add(weight);
      
     if(typeOfVehicle.equals("Van"))
     {
      Button add = new Button("Add Van To Calculate");
      add(add);
      add.addActionListener(this);
     }
      else if(typeOfVehicle.equals("Sport Car"))
     {
      Button add = new Button("Add Sport Car To Calculate");
      add(add); 
      add.addActionListener(this);
     } 
    }
    //The below abstract method from the implementation of ActionListener has to be overriden by this class 
    public void actionPerformed(ActionEvent event)
    {
        //in the below we obtain the label from the button and perform an the perform an event based on this
        String ButtonLabel = event.getActionCommand();
        
        if(ButtonLabel.equals("Add Van"))
        {
           new GUI("Van");
           System.out.println("Van");
        }
        else if(ButtonLabel.equals("Add Sport Car"))
        {
           new GUI("Sport Car"); 
           System.out.println("Car");
        }
        else if(ButtonLabel.equals("Add Van To Calculate"))
        {
           newDetails = createVan(horsepower.getText(), aerodynamics.getText(), weight.getText(), carryWeight.getText());
           System.out.println(newDetails);
           dispose();
           setVisible(false);
        }
        else if(ButtonLabel.equals("Add Sport Car To Calculate"))
        {
           newDetails = createSportCar(horsepower.getText(), weight.getText(), topSpeed.getText());
           System.out.println(newDetails);
           dispose();
           setVisible(false);
        }
        else if(ButtonLabel.equals("Refresh"))
        {
           //We now need to write that value to the textbox within the first window - we do this here because we can only update within an event that is linked to the frame we want to set the value in, hence the refresh button callback is to set this
           System.out.println(newDetails);
           details.setText(newDetails);
           
        }
    }
    //The below 2 methods we have and example of polymorphism and dyamic binding of the Vehicle class
    public String createVan(String horsepower, String aerodynamics, String weight, String carryWeight)
    {
    double hpw = Double.parseDouble(horsepower);
    double aerod = Double.parseDouble(aerodynamics);
    double wei = Double.parseDouble(weight);
    double carryWei = Double.parseDouble(carryWeight);
        
    Vehicle van = new Van(hpw, aerod, wei, carryWei);
    String valueToSet = String.valueOf(van.acceleration());
    newDetails = valueToSet;

    System.out.println(newDetails);
    return(newDetails);
    }
    
    public String createSportCar(String horsepower, String weight, String topSpeed)
    {
    double hpw = Double.parseDouble(horsepower);
    double wei = Double.parseDouble(weight);
    double topSp = Double.parseDouble(topSpeed);
        
    Vehicle car = new SportCar(hpw, wei, topSp);
    
    String valueToSet = String.valueOf(car.acceleration());
    newDetails = valueToSet;

    System.out.println(newDetails);
    return(newDetails);
    }
    //The below method is what we call to spawn the GUI
    public static void main(String[] args)
    {
        
        new GUI();      
    }
}
