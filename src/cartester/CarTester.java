/*
 * Angus Henry
 * 22/ 03/ 2019
 */

package cartester;
import javax.swing.*;
/**
 *
 * @author anhen3335
 */
public class CarTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Car car1 = new Car("Subaru", "Forester", 27995, 2019, 12000, 4);
    Car car2 = new Car("Honda", "Fit");
    Car car3 = new Car();

       //Print the details of each car
    System.out.println(car1.toString());
    System.out.println("--------------------------");

    System.out.println(car2.toString());
    System.out.println("--------------------------");

    //toString() is called by default, no need to write it!
    System.out.println(car3);
    System.out.println("--------------------------"); 
    car1.honk();
    car2.beep();
    }
    
    

    
}
