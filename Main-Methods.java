/**
 * Created by Dan K on 12/14/2015.
 */

public class Main
{
    public static void main(String[] args)
    {
        int Funnel;

        Funnel = calculateFunnel(900);
        displayFunnel("Dan", Funnel);

    }

    public static void displayFunnel(String participant, int location)
    {
        System.out.println(participant + " received " + location + " in the Funnel");

    }
    public static int calculateFunnel(int participantTrack)
    {
        if (participantTrack >= 1000 )
            return 1;
        else if (participantTrack >= 500)
            return 2;
        else if (participantTrack >= 100)
            return 3;
        else
            return 4;

    }

}








