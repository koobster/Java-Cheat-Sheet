/**
 * Created by Dan K on 1/2/2016.
 */
public class Main {

    // Create a new class for a bank account
    // Create fields for the account number, balance, customer name, email and phone number.
    //
    // Create getters and setters for each field
    // Create two additional methods
    // 1. To allow the customer to deposit funds (this should increment the balance field).
    // 2. To allow the customer to withdraw funds. This should deduct from the balance field,
    // but not allow the withdrawal to complete if their are insufficient funds.
    // You will want to create various code in the Main class (the one created by IntelliJ) to
    // confirm your code is working.
    // Add some System.out.println's in the two methods above as well.

    public static void main(String [] args)
    {

        vipCustomer bobsaccount = new vipCustomer();
        System.out.println(bobsaccount.getName());
        System.out.println(bobsaccount.getCreditLimit());
        System.out.println(bobsaccount.getEmail());

        vipCustomer robsaccount = new vipCustomer("Rob","rob@rob.net");
        System.out.println(robsaccount.getName());
        System.out.println(robsaccount.getCreditLimit());
        System.out.println(robsaccount.getEmail());

        vipCustomer dansaccount = new vipCustomer("Dan", 500, "dan.kubrak@gmail.com");
        System.out.println(dansaccount.getName());
        System.out.println(dansaccount.getCreditLimit());
        System.out.println(dansaccount.getEmail());


//        BankAccount bobsAccount = new BankAccount(12345, 0,"Bob Funland","bob@funland.com","123-456-7894");
//        bobsAccount.setBalance(0);
//        bobsAccount.setAccountNumber(12345);
//        bobsAccount.setCustomerName("Bob Funland");
//        bobsAccount.setcustomerPhoneNumber("123-456-7894");
//        bobsAccount.withdrawal(100);
//        System.out.println(bobsAccount.getAccountNumber());
//        System.out.println(bobsAccount.getBalance());
//
//        bobsAccount.deposit(50);
//        bobsAccount.withdrawal(100);
//
//        bobsAccount.deposit(51);
//        bobsAccount.withdrawal(100);
//
//        System.out.println(bobsAccount.getBalance());
//
//        BankAccount dansAccount = new BankAccount("Dan", "dan.kubrak@gmail.com", "9494334175");
//        System.out.println(dansAccount.getAccountNumber() + " name " + dansAccount.getCustomerName());

    }
}
