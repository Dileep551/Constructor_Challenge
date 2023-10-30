// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Customer customer = new Customer("Dileep", 100.0, "dxk@gmail.com");

        System.out.println(customer.getName());
        System.out.println(customer.getCreditLimit());
        System.out.println(customer.getEmailAddress());


        Customer secondCustomer = new Customer();
        System.out.println(secondCustomer.getName());
        System.out.println(secondCustomer.getCreditLimit());
        System.out.println(secondCustomer.getEmailAddress());

        Customer thirdCustomer = new Customer("joe", "Joe@email.com");

        System.out.println(thirdCustomer.getName());
        System.out.println(thirdCustomer.getCreditLimit());
        System.out.println(thirdCustomer.getEmailAddress());




    }
}