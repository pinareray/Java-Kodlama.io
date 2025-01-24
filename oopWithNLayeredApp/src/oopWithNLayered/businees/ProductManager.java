package oopWithNLayered.businees;

import oopWithNLayered.core.logging.Logger;
import oopWithNLayered.dataAccess.HibernateProductDao;
import oopWithNLayered.dataAccess.ProductDao;
import oopWithNLayered.entities.Product;

public class ProductManager {
    private ProductDao productDao;
    private Logger[] loggers;

    public ProductManager(ProductDao productDao, Logger[] loggers) {
        this.productDao = productDao;
        this.loggers = loggers;
    }

    public ProductManager(HibernateProductDao hibernateProductDao) {

    } //Alpe sor

    public void add(Product product) throws Exception {
        //business rules
        if(product.getUnitPrice()<10){
            throw new Exception("Ürün fiyatı 10'dan küçük olamaz");
        }

        //HibernateProductDao productDao = new HibernateProductDao();
        productDao.add(product);

        for(Logger logger : loggers){ //[db,mail]
            logger.log(product.getName());
        }
    }

}
