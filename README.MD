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
This text is italic
Main Menu:
1. Display Cart
2. Remove an Item
3. Add an Item
4. Checkout
5. Exit
Choose an option: 
3
Enter item name you want to add: 
apple
Enter price of the item: 
.25
Enter quantity: 
200
APPLE added to your cart successfully.
Do you want to add more item? (Y/N): 
y
Enter item name you want to add: 
Orange
Enter price of the item: 
.33
Enter quantity: 
100
ORANGE added to your cart successfully.
Do you want to add more item? (Y/N): 
n
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
1
Your Cart:
APPLE(200) @ $0.25
-------------------------------
ORANGE(100) @ $0.33
-------------------------------
```
### Clone the repository:
   ```sh
   git clone https://github.com/ajaigirdar/ShoppingCartSummativeAssessment.git 
   ```








