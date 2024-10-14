
public class IndividualCustomer extends Customer  {//bireysel müşteri bir müşteridir
    //Sadece bireysel müşterimize özel şeyleri tanımlayacağız.
    private String firstName;
    private String lastName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
