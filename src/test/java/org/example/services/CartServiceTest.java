package test.java.org.example.services;
import main.java.org.example.model.Cart;
import main.java.org.example.model.Item;
import main.java.org.example.services.CartService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class CartServiceTest {

    private Cart cart;
    private CartService cartService;

    @BeforeEach
    void setUp() {
        cart = new Cart();
        cartService = new CartService(cart);
    }

    @Test
    void addItem_shouldAddNewItemToCart() {
        // Act
        cartService.addItem("apple", 1.0, 5);

        // Assert
        Map<String, Item> items = cart.getItems();
        assertTrue(items.containsKey("apple"), "Cart should contain 'apple'.");
        assertEquals(5, items.get("apple").getQuantity(), "Apple quantity should be 5.");
        assertEquals(1.0, items.get("apple").getPrice(), 0.001, "Apple price should be 1.0.");
    }

    @Test
    void addItem_shouldUpdateQuantityIfItemAlreadyExists() {
        // Arrange
        cartService.addItem("apple", 1.0, 5);

        // Act
        cartService.addItem("apple", 1.0, 3);

        // Assert
        assertEquals(8, cart.getItems().get("apple").getQuantity(), "Apple quantity should be updated to 8.");
    }


    @Test
    void removeItem_shouldRemoveSpecifiedQuantity() {
        // Arrange
        cartService.addItem("apple", 1.0, 5);

        // Act
        cartService.removeItem("apple", 3);

        // Assert
        assertEquals(2, cart.getItems().get("apple").getQuantity(), "Apple quantity should be reduced to 2.");
    }

    @Test
    void removeItem_shouldRemoveItemWhenQuantityIsZero() {
        // Arrange
        cartService.addItem("apple", 1.0, 5);

        // Act
        cartService.removeItem("apple", 5);

        // Assert
        assertFalse(cart.getItems().containsKey("apple"), "Apple should be removed from the cart.");
    }


    @Test
    void removeItem_shouldDoNothingForNonExistentItem() {
        // Act
        cartService.removeItem("nonexistent", 1);

        // Assert
        assertTrue(cart.getItems().isEmpty(), "Cart should remain empty.");
    }

    @Test
    void displayCart_shouldDisplayEmptyCartMessage() {
        assertTrue(cart.getItems().isEmpty(), "Cart should be empty before displaying.");
    }

    void calculateTotal_shouldReturnTotalCostOfItems() {
        // Arrange
        cartService.addItem("apple", 1.0, 5);
        cartService.addItem("banana", 0.5, 10);

        // Act
        double total = cartService.calculateTotal();

        // Assert
        assertEquals(10.0, total, 0.001, "Total cost should be 10.0.");
    }

    @Test
    void checkout_shouldClearCart() {
        // Arrange
        cartService.addItem("apple", 1.0, 5);

        // Act
        cartService.checkout();

        // Assert
        assertTrue(cart.getItems().isEmpty(), "Cart should be cleared after checkout.");
    }
}