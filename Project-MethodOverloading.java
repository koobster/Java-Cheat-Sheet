/**
 * Created by Dan K on 12/16/2015.
 */
public class Project
{
    public static void main(String[] args)
    {
        calcFeetAndInchesToCentimeters(6.0, 10.0);
        calcFeetAndInchesToCentimeters(5.0 * 12.0);

    }
    public static double calcFeetAndInchesToCentimeters(double feet, double inches)
    {
        double centimeters = (feet * 12.0) * 2.54;
        centimeters += (inches * 2.54);
        System.out.println("Centimeters total is " + centimeters);

        return centimeters;

    }
    public static double calcFeetAndInchesToCentimeters(double inches)
   {
       double feet = (inches / 12.0);
       double remainingInches = inches - (feet * 12.0);
       calcFeetAndInchesToCentimeters(feet, remainingInches);

       return 0.0;

   }

}
