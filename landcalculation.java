import java.lang.Math;
import java.util.Scanner;

public class landcalculation{
    /**
     * @param args
     */

     public static void main(String[] args) {
        //Header.
        System.out.println("***************************************");
        System.out.println("*       Land Calculation App          *");
        System.out.println("***************************************");
        
        //Variables.
        double acreLand = 43.560;
        double tractLand = 389.767;
        double totalAcreLand;
        double totalTractLand;
        double total;

        //Calculation of Acre in Square Feet.
        totalAcreLand = Math.pow(acreLand, 2.0);
        //totalAcreLand = Math.sqrt(acreLand);

        //Calcualation of Tract in Square Feet.
       totalTractLand = Math.pow(tractLand, 2.0);
       //totalTractLand = Math.sqrt(tractLand);

        //Calculations.
        total = totalTractLand / totalAcreLand;

        //Displaying the total of acre in square feet.
        System.out.println("The total of an acre of land is " + totalAcreLand + " sq.");

        System.out.println("The total of a tract of land is " + totalTractLand + " sq.");

        System.out.println("The total is " + total + " sq.");
        
    }
}