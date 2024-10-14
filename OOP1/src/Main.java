//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String mesaj = "Vade oranı";

        Product product1 = new Product();//Bir class böyle tanımlanır.
        //System.out.println(product1.name); //get- okuma
        product1.setName("Delonghi Kahve Makinesi");//set- yazma
        product1.setDiscount(7);
        product1.setUnitPrice(7500);
        product1.setUnitsInStock(3);
        product1.setImageUrl("image1.jpg");

        Product product2 = new Product();
        product2.setName("Sinbo Kahve Makinesi");
        product2.setDiscount(5);
        product2.setUnitPrice(1500);
        product2.setUnitsInStock(2);
        product2.setImageUrl("image2.jpg");

        Product product3 = new Product();
        product3.setName("Smeg Kahve Makinesi");
        product3.setDiscount(6);
        product3.setUnitPrice(6500);
        product3.setUnitsInStock(4);
        product3.setImageUrl("image3.jpg");

        //Gerçek hayatta bu dataları böyle yazmayız bu datalar bize bir veri kaynağından gelir.

        Product[] products = {product1, product2, product3};

        for (Product product : products) { //productsları gez
            System.out.println(product.getName());
        }

        IndividualCustomer individualCustomer = new IndividualCustomer();
        individualCustomer.setId(1);
        individualCustomer.setPhone("05376842");
        individualCustomer.setCustomerNumber("12345");
        individualCustomer.setFirstName("Pınar");
        individualCustomer.setLastName("Eray");

        CorporateCustomer corporateCustomer = new CorporateCustomer();
        corporateCustomer.setId(2);
        corporateCustomer.setCompanyName("Kodlama.io");
        corporateCustomer.setPhone("053483483");
        corporateCustomer.setTaxNumber("11111111");
        corporateCustomer.setCustomerNumber("54321");

        Customer[] customers = {individualCustomer, corporateCustomer};

    }
}