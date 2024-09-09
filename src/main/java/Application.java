import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

public class Application {

    public static void main(String[] args) {

        Cart cart = new Cart();

        // Create cart items
        CartItem tShirtS_1 = new CartItem("item-1", "t-shirt", "t-shirt-size-s", new BigDecimal("5"));
        CartItem tShirtS_2 = new CartItem("item-2", "t-shirt", "t-shirt-size-s", new BigDecimal("5"));
        CartItem tShirtS_3 = new CartItem("item-3", "t-shirt", "t-shirt-size-s", new BigDecimal("5"));
        CartItem tShirtS_4 = new CartItem("item-4", "t-shirt", "t-shirt-size-s", new BigDecimal("5"));

        CartItem tShirtM_5 = new CartItem("item-5", "t-shirt", "t-shirt-size-m", new BigDecimal("6"));
        CartItem tShirtM_6 = new CartItem("item-6", "t-shirt", "t-shirt-size-m", new BigDecimal("6"));

        CartItem skirtM_7 = new CartItem("item-7", "skirt", "skirt-size-m", new BigDecimal("8"));
        CartItem skirtM_8 = new CartItem("item-8", "skirt", "skirt-size-m", new BigDecimal("8"));

        // Add items to the cart
        List<CartItem> cartItems = Arrays.asList(
                tShirtS_1, tShirtS_2, tShirtS_3, tShirtS_4, tShirtM_5, tShirtM_6, skirtM_7, skirtM_8
        );

        // Define available stock
        List<StockSnapshot> stock = Arrays.asList(
                new StockSnapshot("t-shirt-size-s", 3),
                new StockSnapshot("t-shirt-size-m", 2)
        );

        // Get purchasable items
        List<CartItem> purchasableItems = cart.purchasableItems(cartItems, stock);

        // Print out purchasable items
        purchasableItems.forEach(item -> System.out.println(item.itemId + " is purchasable"));

        // Counting how many items of each type
        long tShirtsSCount = purchasableItems.stream().filter(i -> i.productId.equals("t-shirt-size-s")).count();
        long tShirtsMCount = purchasableItems.stream().filter(i -> i.productId.equals("t-shirt-size-m")).count();
        long skirtMCount   = purchasableItems.stream().filter(i -> i.productId.equals("skirt-size-m")).count();

        // Output the results
        System.out.println("T-shirts Size S Purchasable: " + tShirtsSCount);
        System.out.println("T-shirts Size M Purchasable: " + tShirtsMCount);
        System.out.println("Skirts Size M Purchasable: " + skirtMCount);
    }
}
