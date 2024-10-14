

public class Customer {
    private int id; //Bir datayı diğerinden ayırt etmek için kullandığımız veri kaynağı numarası
    private String customerNumber;
    private String phone; //Üstünde matematiksel işlem yapmadığımız şeyler string

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getCustomerNumber() {
        return customerNumber;
    }
    public void setCustomerNumber(String customerNumber) {
        this.customerNumber = customerNumber;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
}
