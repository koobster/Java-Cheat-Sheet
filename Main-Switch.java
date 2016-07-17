/**
 * Created by Dan K on 12/16/2015.
 */
public class Main {
    public static void main(String[] args)
    {
        char switchValue = 'A';

        switch(switchValue)
        {
            case 'A':
                System.out.println("Value was A");
                break;

            case 'B':
                System.out.println("Value was B");
                break;

            case 'C':
            case 'D':
            case 'E':
                System.out.println("was a C, or a D, or a E");
                System.out.println("Actually it was a " + switchValue);
                break;

            default:
                System.out.println("A, B, C, D, or E was not typed");
                break;
        }

        String month = "January";
        switch(month.toLowerCase())
        {
            case "january":
                System.out.println("Jan");
                break;
            case "june":
                System.out.println("Jun");
                break;
            default:
                System.out.println("Not sure");
        }
    }
}
