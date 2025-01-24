
import oopWithNLayered.businees.ProductManager;
import oopWithNLayered.core.logging.DatabaseLogger;
import oopWithNLayered.core.logging.FileLogger;
import oopWithNLayered.core.logging.Logger;
import oopWithNLayered.core.logging.MailLogger;
import oopWithNLayered.dataAccess.HibernateProductDao;
import oopWithNLayered.dataAccess.JdbcProductDao;
import oopWithNLayered.dataAccess.ProductDao;
import oopWithNLayered.entities.Product;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws Exception {

        Product product1 = new Product(1,"Iphone XR", 1000 );

        Logger[] loggers = {new DatabaseLogger() , new FileLogger() , new MailLogger()};

        ProductManager productManager = new ProductManager((ProductDao) new HibernateProductDao(),loggers);
        productManager.add(product1);

    }
}