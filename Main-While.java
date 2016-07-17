/**
 * Created by Dan K on 12/26/2015.
 */
public class Main {

    public static void main(String[] args)
    {
//        int count = 6;
////        while(count != 6)
////        {
////            System.out.println("Count value is" + count);
////            count++;
////        }
////
////        for(int i=6; i != 6; i++)
////        {
////            System.out.println("Count value is " + count);
////        }
//        count = 1;
//        do
//        {
//            System.out.println("Count value was " + count);
//            count++;
//
//            if(count > 100)
//            {
//                break;
//            }
//        } while(count != 6);

        int count = 1;
        int evenNumbersFound = 0;
        int finishNumber = 20;
        while (count <= finishNumber) {
            if (!isEvenNumber(count)) {
                count++;
                continue;
            }


            System.out.println("Number " + count + " is even");
            count++;

            evenNumbersFound++;
            if(evenNumbersFound >=5)
            {
                break;
            }
        }
        System.out.println("Total even numbers found = " + evenNumbersFound);

    }

    public static boolean isEvenNumber(int number)
    {
        if ((number%2) == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
