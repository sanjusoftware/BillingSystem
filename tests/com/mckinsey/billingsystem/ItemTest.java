package com.mckinsey.billingsystem;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * User: Sanjeev
 * Date: 4/25/12
 * Time: 6:11 PM
 * To change this template use File | Settings | File Templates.
 */
public class ItemTest {

    @Test
    public void testDiscountableAmountForNonGroceryItemShouldBeSameAsItsAmount() throws Exception {
        assertEquals(100.0, new Item(100).discountableAmount());
    }

    @Test
    public void testDiscountableAmountForGroceryItemShould0() throws Exception {
        assertEquals(0.0, new Grocery(100).discountableAmount());
    }

    @Test
    public void testAmountForAnItemShouldBeSameAsItsAmount() throws Exception {
        assertEquals(100.0, new Item(100).amount());
        assertEquals(100.0, new Grocery(100).amount());
    }
}
