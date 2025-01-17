package test.java.org.example.services;
import main.java.org.example.model.Cart;
import main.java.org.example.model.Item;
import main.java.org.example.services.CartService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class CartServiceTest {

    Cart testCart;
    CartService cartService;

    @BeforeEach
    void setUp() {
        testCart = new Cart();
        cartService = new CartService(testCart);
    }

    @Test
    void CartService_addItem_itemAddedSuccessfully_itemExistsInTheCart() {
        // arrange
        cartService.addItem("apple", 20, 100);

        // act
        Map<String, Item> testMap = testCart.getItems();

        //assert
        assertTrue(testMap.containsKey("apple"));
        assertEquals(20, testMap.get("apple").getPrice(), "Price should be 20");
        assertEquals(100, testMap.get("apple").getQuantity(), "Quantity should be 100");
    }

    @Test
    void CartService_removeItem_itemRemovedSuccessfully() {
        // arrange
        cartService.addItem("apple",20,100);

        // act
        cartService.removeItem("apple", 100);

        //assert
        assertFalse(testCart.getItems().containsKey("apple"));
        assertNull(testCart.getItems().get("apple"));
    }

    @Test
    void CartService_displayCart_displayAllTheItemsInTheCart() {
        // arrange
        testCart.addItem("Orange", .25,100);

        // act
        Map<String, Item> testMap = testCart.getItems();

        // assert
        assertEquals(testMap.toString(), testCart.items.toString());
    }

    @Test
    void calculateTotal() {
        // arrange


        // act


        // assert

    }

    @Test
    void checkout() {
        // arrange
        cartService.addItem("apple", .25,200);
        cartService.addItem("banana", .50, 100);


        // act
        cartService.checkout();

        // assert
        assertTrue(testCart.getItems().isEmpty());

    }
}