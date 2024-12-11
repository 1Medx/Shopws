package ma.fsr.shopws.exception;

public class ProductNotFoundException extends Exception {
    private int productId;
    public ProductNotFoundException(int productId) {
        super("Product with id = " + productId + " was not found!");
    }
}
