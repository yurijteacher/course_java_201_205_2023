package group202.practical3;

public class Main {

    public static void main(String[] args) {

        CacheProducts cacheProducts = new CacheProducts();

        Product product = new Product();
        product.setId(1L);
        product.setName("apple");
        product.setPrice(1000);

        cacheProducts.map.put(1L, product);

        Product product2 = new Product();
        product2.setId(2L);
        product2.setName("car");
        product2.setPrice(2000);

        cacheProducts.map.put(2L, product2);


        System.out.println(cacheProducts.map.get(2L));

    }
}
