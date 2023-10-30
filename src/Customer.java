public class Customer {

    public String name;

    public double creditLimit;

    public String emailAddress;

    public Customer(String name, double creditLimit, String emailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    public Customer(){

        this("Nobody", "nobody@nowhere.com");
    }

    public Customer(String name, String emailAddress){

        this(name, 1234.0, emailAddress);
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
