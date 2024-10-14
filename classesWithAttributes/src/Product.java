
public class Product {

    public Product(int id, String name, int price, String description,int stockAmount) {
        System.out.println("Yapıcı blok çalıştı");
        this.id = id;
        this.name = name;
        this.price = price;
        this.description = description;
        this.stockAmount = stockAmount;
    }

    public Product(){

    }

    //attribute - field
     private String name;
     private String description;
     private double price;
     private int stockAmount;
     private int id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    //setter kısmını silersek kodu kullanıcının yazmasını engelleriz??

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStockAmount() {
        return stockAmount;
    }

    public void setStockAmount(int stockAmount) {
        this.stockAmount = stockAmount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    //Bunları private yapsaydık başka bir blok içinde veya sınıf içinde ulaşamazdık.



    }


