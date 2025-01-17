package test.java.org.example.services;
import main.java.org.example.model.Cart;
import main.java.org.example.model.Item;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class CartServiceTest {

    Cart testCart;

    @BeforeEach
    void setUp() {
        testCart = new Cart();
    }

    @Test
    void addItem() {
        // arrange
        testCart.addItem("apple", 20, 100);

        // act
        Map<String, Item> testMap = testCart.getItems();

        //assert
        assertTrue(testMap.containsKey("apple"));
        assertEquals(20, testMap.get("apple").getPrice(), "Price should be 20");
        assertEquals(100, testMap.get("apple").getQuantity(), "Quantity should be 100");
    }

    @Test
    void removeItem() {
    }

    @Test
    void displayCart() {
    }

    @Test
    void calculateTotal() {
    }

    @Test
    void checkout() {
    }
}