public class CustomerClassDemo{
    public static void main(String[] aaa){
        
        //#######your code starts here.  you can change anything in
        //this area.  If you change anything outside of this area the
        //Test will fail for some problems you may need to create
        //other files in addition to this one.

        //actually for this problem you don't need to change anything
        //in this starter file.  you just need to create the Customer
        //class and the Person class in different files.

        //#######your code ends here

        //don't change anything here!! not even a space
        // Create a Customer object for Julie James.
        Customer myCustomer = new Customer("Julie James", "123 Main Street", "555-1212", "147-A049", true);
        Person pp = myCustomer;
        System.out.println("myCustomer instanceof Person: " + (myCustomer instanceof Person));
        System.out.println("myCustomer instanceof Customer: " + (myCustomer instanceof Customer));
        System.out.println("pp instanceof Person: " + (pp instanceof Person));
        System.out.println("pp instanceof Customer: " + (pp instanceof Customer));
        System.out.println("Name: " + pp.getName());
        System.out.println("Address: " + pp.getAddress());
        System.out.println("Telephone: " + pp.getPhone());
        // Display the object's data.
        System.out.println("Name: " + myCustomer.getName());
        System.out.println("Address: " + myCustomer.getAddress());
        System.out.println("Telephone: " + myCustomer.getPhone());
        System.out.println("Customer Number: " + myCustomer.getCustomerNumber());
        if (myCustomer.getMailingList())
            System.out.println("Mailing List: YES");
        else
            System.out.println("Mailing List: NO");
    }
}
