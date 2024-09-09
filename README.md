"Purchasable Cart Items Based on Stock Availability"

It addresses a common problem in e-commerce or inventory management systems, where you need to determine which items from a customer's cart can be purchased based on available stock.

Problem Statement (Question):
You are given two lists:

A list of items in a shopping cart.
A list of stock snapshots indicating the available quantity for each product.
Each item in the cart belongs to a specific product, and multiple items in the cart can belong to the same product. The goal is to determine which items in the cart can be purchased, ensuring that the number of items for each product does not exceed the available quantity in the stock.

Input:

A list of CartItem objects, where each object contains:

itemId: Unique ID for the item.
productGroup: The group the product belongs to (e.g., "t-shirt").
productId: Unique ID for the product (e.g., "t-shirt-size-s").
productPrice: Price of the item.
A list of StockSnapshot objects, where each object contains:

productId: Unique ID of the product.
quantity: Available quantity of that product in stock.
Output:

A list of CartItem objects that can be purchased, where the number of items selected for each product does not exceed the available quantity in the stock.


Example:

List<CartItem> cartItems = Arrays.asList(
new CartItem("item-1", "t-shirt", "t-shirt-size-s", new BigDecimal("5")),
new CartItem("item-2", "t-shirt", "t-shirt-size-s", new BigDecimal("5")),
new CartItem("item-3", "t-shirt", "t-shirt-size-s", new BigDecimal("5")),
new CartItem("item-4", "t-shirt", "t-shirt-size-s", new BigDecimal("5")),
new CartItem("item-5", "t-shirt", "t-shirt-size-m", new BigDecimal("6")),
new CartItem("item-6", "t-shirt", "t-shirt-size-m", new BigDecimal("6")),
new CartItem("item-7", "skirt", "skirt-size-m", new BigDecimal("8")),
new CartItem("item-8", "skirt", "skirt-size-m", new BigDecimal("8"))
);

List<StockSnapshot> stock = Arrays.asList(
new StockSnapshot("t-shirt-size-s", 3),
new StockSnapshot("t-shirt-size-m", 2)
);


Output:
A list of items that can be purchased:

Items 1, 2, and 3 (3 t-shirts size S) because stock is limited to 3.
Items 5 and 6 (2 t-shirts size M) because stock is limited to 2.
No skirts are purchasable since the stock of skirts is not available.
Solution Outline:
Map the available stock quantities for each product.
Track the number of selected items for each product as you iterate through the cart.
For each item, compare the selected quantity with the available stock. If there's stock available, add the item to the purchasable list.
Return the list of purchasable items.
