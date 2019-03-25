/*
 * Angus Henry
 * 25/03/2019
 */

package cartester;

/**
 *
 * @author anhen3335
 */
public class Car {
    private String make, model;
  private int price, year, miles, tires;  
      public Car() {
    make = "Angus Car";
    model = "The Amazing";
    price = 10000;
    year = 2015;
    miles = 5550;
    tires = 4; 
  }
      
    public Car(String mk, String mdl, int prc, int yr, int mls, int trs) {
    make = mk;
    model = mdl;
    price = prc;
    year = yr;
    miles = mls;
    tires = trs;
  }
    
    public Car(String mk, String mdl) {
    //This constructor only uses the make and model
    //Set the price,year, miles, and tires to random #s

    make = mk;
    model = mdl;
    price = (int) (Math.random() * 100000) + 1;
    year = (int) (Math.random() * 10) + 2000;
    miles = (int) (Math.random()* 100) + 1000;
    tires = 4;
  }
    /**
 * This method prints out the honking
 */
  public void honk() {
    System.out.println("Honk! Honk!");
  }
/**
 * This method prints out the beeping
  */
  public void beep() {
    System.out.println("Beep! Beep!");
  }
        public String toString() {
    String output = "Company: " + make + "\n";
    output += "Model: " + model + "\n";
    output += "Price: " + price + "$" + "\n";
    output += "Year: " + year + "\n";
    output += "Miles: " + miles + "\n";
    output += "Tires: " + tires + "\n";
    //output string is complete, return it
    return output;
  }  
}
