public class Person {


    String name, address, phone, cust_ID;
    boolean mailingList = false;

    public Person(String name, String address, String telephoneNo, String cust_ID, boolean mailingList) {

        this.name = name;
        this.address = address;
        this.phone = telephoneNo;
        this.cust_ID = cust_ID;
        this.mailingList = mailingList;

    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    public String getCustomerNumber() {
        return cust_ID;
    }

    public boolean getMailingList() {
        return mailingList;
    }


}
