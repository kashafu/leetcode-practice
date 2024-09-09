
import java.util.*;
import java.util.stream.Collectors;

public class Cart {
    public List<CartItem> purchasableItems(List<CartItem> items, List<StockSnapshot> stockSnapshots) {
        // Map stock snapshots to productId to available quantity
        Map<String, Integer> stockQuantities = stockSnapshots.stream()
                .collect(Collectors.toMap(
                        stockSnapshot -> stockSnapshot.productId,
                        stockSnapshot -> stockSnapshot.quantity
                ));

        // Track how many items of each product we have added to the purchasable list
        Map<String, Integer> selectedQuantities = new HashMap<>();

        // Filter cart items based on available stock
        List<CartItem> result = new ArrayList<>();
        for (CartItem item : items) {
            int availableQuantity = stockQuantities.getOrDefault(item.productId, 0);
            int selectedQuantity = selectedQuantities.getOrDefault(item.productId, 0);

            // If there's still stock available, add this item to the purchasable list
            if (selectedQuantity < availableQuantity) {
                result.add(item);
                selectedQuantities.put(item.productId, selectedQuantity + 1);
            }
        }
        return result;
    }
}
