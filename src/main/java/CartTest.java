
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import java.math.BigDecimal;
import java.util.*;

public class CartTest {

    @Test
    public void stockTest() {
        Cart cart = new Cart();

        CartItem tShirtS_1 = new CartItem("item-1", "t-shirt", "t-shirt-size-s", new BigDecimal("5"));
        CartItem tShirtS_2 = new CartItem("item-2", "t-shirt", "t-shirt-size-s", new BigDecimal("5"));
        CartItem tShirtS_3 = new CartItem("item-3", "t-shirt", "t-shirt-size-s", new BigDecimal("5"));
        CartItem tShirtS_4 = new CartItem("item-4", "t-shirt", "t-shirt-size-s", new BigDecimal("5"));

        CartItem tShirtM_5 = new CartItem("item-5", "t-shirt", "t-shirt-size-m", new BigDecimal("6"));
        CartItem tShirtM_6 = new CartItem("item-6", "t-shirt", "t-shirt-size-m", new BigDecimal("6"));

        CartItem skirtM_7 = new CartItem("item-7", "skirt", "skirt-size-m", new BigDecimal("8"));
        CartItem skirtM_8 = new CartItem("item-8", "skirt", "skirt-size-m", new BigDecimal("8"));

        List<CartItem> cartItems = Arrays.asList(
                tShirtS_1, tShirtS_2, tShirtS_3, tShirtS_4, tShirtM_5, tShirtM_6, skirtM_7, skirtM_8
        );

        List<StockSnapshot> stock = Arrays.asList(
                new StockSnapshot("t-shirt-size-s", 3),
                new StockSnapshot("t-shirt-size-m", 2)
        );

        List<CartItem> purchasableItems = cart.purchasableItems(cartItems, stock);

        long tShirtsSCount = purchasableItems.stream().filter(i -> i.productId.equals("t-shirt-size-s")).count();
        long tShirtsMCount = purchasableItems.stream().filter(i -> i.productId.equals("t-shirt-size-m")).count();
        long skirtMCount   = purchasableItems.stream().filter(i -> i.productId.equals("skirt-size-m")).count();

        assertEquals(3, tShirtsSCount);  // Expected 3 t-shirts size S
        assertEquals(2, tShirtsMCount);  // Expected 2 t-shirts size M
        assertEquals(0, skirtMCount);    // Expected 0 skirts size M
    }
}
