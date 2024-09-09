import java.math.BigDecimal;

public class CartItem {
    public final String itemId;
    public final String productGroup;
    public final String productId;
    public final BigDecimal productPrice;

    public CartItem(String itemId, String productGroup, String productId, BigDecimal productPrice) {
        this.itemId = itemId;
        this.productGroup = productGroup;
        this.productId = productId;
        this.productPrice = productPrice;
    }
}
