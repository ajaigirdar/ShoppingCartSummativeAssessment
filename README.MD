# Shopping Cart Prototype 🛍
#### A prototype for a Point of Sale (POS) system designed for Shopping Inc. This application allows cashiers to ring up customers' purchases, manage their shopping cart, and calculate the total price at checkout.

## Features
- **Add Items to Cart**: Add items with their price and quantity to the cart.
- **Remove Items from Cart**: Remove a specific quantity of items or completely remove an item.
- **Display Cart**: View all items in the cart with their quantities and prices.
- **Checkout**: Calculate the total price and empty the cart.
- **Interactive Console Menu**: Easy-to-use menu-driven interface for the cashier.

## Project Structure
- ` App:` The main entry point of the application.
- ` MainMenuController:` Handles menu navigation and user interactions.
- ` Cart:` Manages the shopping cart's contents.
- ` Item:` Represents individual products.
- ` CartService:` Contains the business logic for cart operations.
- ` ConsoleIO:` Provides utility methods for input and output.

### Example Usage
```
-------------------------------
Welcome To Shopping Cart App 🛍️
-------------------------------
Main Menu:
1. Display Cart
2. Remove an Item
3. Add an Item
4. Checkout
5. Exit
Choose an option:
<span style="color:green">3</span>
Enter item name you want to add: 
<span style="color:green">apple</span>
Enter price of the item: 
<span style="color:green">.22</span>
Enter quantity: 
<span style="color:green">100</span>
APPLE added to your cart successfully.
-------------------------------
Welcome To Shopping Cart App 🛍️
-------------------------------
This text is italic
Main Menu:
1. Display Cart
2. Remove an Item
3. Add an Item
4. Checkout
5. Exit
Choose an option: 
<span style="color:green">3</span>
Enter item name you want to add: 
<span style="color:green">orange</span>
Enter price of the item: 
<span style="color:green">29</span>
Enter quantity: 
<span style="color:green">200</span>
ORANGE added to your cart successfully.
-------------------------------
Welcome To Shopping Cart App 🛍️
-------------------------------
This text is italic
Main Menu:
1. Display Cart
2. Remove an Item
3. Add an Item
4. Checkout
5. Exit
Choose an option: 
<span style="color:green">1</span>
Your Cart:
<span style="color:blue">APPLE</span>(100) @ <span style="color:green">$0.22</span>
-------------------------------
<span style="color:blue">ORANGE</span>(200) @ <span style="color:green">$29.0</span>
-------------------------------
```
### Clone the repository:
   ```sh
   git clone https://github.com/ajaigirdar/ShoppingCartSummativeAssessment.git 
   ```








