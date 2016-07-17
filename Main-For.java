/**
 * Created by Dan K on 12/19/2015.
 */
public class Main {
    public static void main(String[] args)
    {
        // gotta put it on the outside so it actually does something
        int count = 0;
        // for(init; termination; decriment/increment)
        for    (int i = 1; i < 50; i=i+1)
        //                          or i++
        {
            if (isPrime(i))
            {
                System.out.println("Number " + i + " is a prime number");
                count=count+1;
            }
            if (count == 3)
            {
                System.out.println("Exiting...");
                break;
            }
        }

    }
    public static boolean isPrime(int n)
    {
        if (n == 1)
        {
            return false;
        }
        for (int i = 2; i <= n / 2; i++)
        {
            if (n % i == 0)
            {
                return false;
            }

        }
        return true;
    }


    public static double calculateInterest(double amount, double interestRate)
    {
        return (amount * (interestRate / 100.0));

    }
}
