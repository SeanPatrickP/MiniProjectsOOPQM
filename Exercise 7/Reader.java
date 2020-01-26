import java.io.File; 
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileReader;
class Reader {
   static ArrayList<Double> population = new ArrayList<Double>();
   static String input; 
   static int Ichecker;
    public static void main(String[] args) throws Exception 
  { 
   File file = new File("/homes/spp30/Documents/NEW/Exercise 7/TextFileToRead"); 
   try (BufferedReader br = new BufferedReader(new FileReader(file))) {
    String line;
    while ((line = br.readLine()) != null)
        saveInput(line);
}
   String Schecker = args[0];
   Ichecker = Integer.parseInt(Schecker);
   getAnswer();
  } 
    
  public static void saveInput(String input) { 
    String populationString = getStringVal(input);
    Double populationInt = Double.parseDouble(populationString); //could use Double.valueOf
    population.add(populationInt); 
  }

  public static String getStringVal(String input) {
      System.out.println(input);
      String [] split = input.split(" ");
      return split[1];
  }
  
  public static void getAnswer() {
      int tally = 0;
  for(int i = 0 ; i < population.size() ; i ++)
  {
      if(population.get(i) >= Ichecker)
        tally ++;
  }
    System.out.println(tally);
  }
}
