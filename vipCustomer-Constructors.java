/**
 * Created by Dan K on 1/2/2016.
 */
public class vipCustomer
{
    private String name;
    private int creditLimit;
    private String email;

    public vipCustomer()
    {
        this("John Doe", 400, "john@doe.com");
        System.out.println("Default used");
    }

    public vipCustomer(String name, int creditLimit, String email)
    {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
        System.out.println("Constructor with parameters used");
    }

    public vipCustomer(String name, String email)
    {
        this(name, 400, email);
        this.name = name;
        this.email = email;
        System.out.println("Constructor with partial parameters used");
    }

    public String getName() {
        return name;
    }

    public int getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }


}


