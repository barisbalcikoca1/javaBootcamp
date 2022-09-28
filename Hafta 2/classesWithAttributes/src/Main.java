public class Main {

    public static void main(String[] args) {
        Product product = new Product();
        product.setName("Laptop");
        product.setId(1);
        product.setDescription("Excalibur Laptop");
        product.setPrice(15000);
        product.setStockAmount(2);

        ProductManager productManager = new ProductManager();
        productManager.add(product);

    }
}
