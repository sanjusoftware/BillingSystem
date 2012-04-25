package com.mckinsey.billingsystem;

import com.mckinsey.billingsystem.user.Affiliate;
import com.mckinsey.billingsystem.user.Customer;
import com.mckinsey.billingsystem.user.Employee;
import org.joda.time.DateTime;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static junit.framework.Assert.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * User: Sanjeev
 * Date: 4/25/12
 * Time: 2:01 PM
 * To change this template use File | Settings | File Templates.
 */

public class BillTest {
    @Test
    public void testEmployeeShouldGet30PercentDiscount() {
        assertEquals(7.0, new Bill(getNonGroceryItemsWorth(10), new Employee(new DateTime())).netPayableAmount());
    }

    @Test
    public void testAffiliateShouldGet10PercentDiscount() {
        assertEquals(9.0, new Bill(getNonGroceryItemsWorth(10), new Affiliate(new DateTime())).netPayableAmount());
    }

    @Test
    public void testCustomerNewerThan2YearsShouldNotGetAnyDiscount() {
        assertEquals(10.0, new Bill(getNonGroceryItemsWorth(10), new Customer(new DateTime())).netPayableAmount());
    }

    @Test
    public void testCustomerOlderThan2YearsShouldGetAnyDiscount() {
        assertEquals(9.5, new Bill(getNonGroceryItemsWorth(10), new Customer(new DateTime(2009, 1, 1, 0, 0, 0, 0))).netPayableAmount());
    }

    @Test
    public void testForEvery100DollarOnBillUserShouldGet5DollarDiscount() {
        assertEquals((double) 945, new Bill(getNonGroceryItemsWorth(990), new Customer(new DateTime())).netPayableAmount());
    }

    @Test
    public void testThePercentageBasedDiscountsDoNotApplyOnGroceries() {
        assertEquals((double) 945, new Bill(getGroceryItemsWorth(990), new Customer(new DateTime())).netPayableAmount());
    }

    private List<Item> getNonGroceryItemsWorth(int price) {
        Item item = new Item(price);
        List<Item> items = new ArrayList<Item>();
        items.add(item);
        return items;
    }

    private List<Item> getGroceryItemsWorth(int price) {
        Item item = new Grocery(price);
        List<Item> items = new ArrayList<Item>();
        items.add(item);
        return items;
    }
}
