public class ProductManager {
    public void Add(Product product){
        //JDBS ile veri tabanına kaydedilir.
        System.out.println("Ürün eklendi: " + product.getName());
    }

    public void Add2(int id, String name, String description, int stockAmount, double price){ //Hoş olmayan kullanım

    }

}

