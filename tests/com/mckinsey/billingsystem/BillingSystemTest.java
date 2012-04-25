package com.mckinsey.billingsystem;

import com.mckinsey.billingsystem.user.Affiliate;
import com.mckinsey.billingsystem.user.Customer;
import com.mckinsey.billingsystem.user.Employee;
import junit.framework.TestCase;
import org.joda.time.DateTime;

/**
 * Created with IntelliJ IDEA.
 * User: Sanjeev
 * Date: 4/25/12
 * Time: 2:01 PM
 * To change this template use File | Settings | File Templates.
 */

public class BillingSystemTest extends TestCase {

    public void testEmployeeShouldGet30PercentDiscount() {
        assertEquals(7.0, new Bill(10, new Employee(new DateTime())).netPayableAmount());
    }

    public void testAffiliateShouldGet10PercentDiscount() {
        assertEquals(9.0, new Bill(10, new Affiliate(new DateTime())).netPayableAmount());
    }

    public void testCustomerNewerThan2YearsShouldNotGetAnyDiscount() {
        assertEquals(10.0, new Bill(10, new Customer(new DateTime())).netPayableAmount());
    }

    public void testCustomerOlderThan2YearsShouldGetAnyDiscount() {
        assertEquals(9.5, new Bill(10, new Customer(new DateTime(2009, 1, 1, 0, 0, 0, 0))).netPayableAmount());
    }

    public void testForEvery100DollarOnBillUserShouldGet5DollarDiscount() {
        assertEquals((double) 945, new Bill(990, new Customer(new DateTime())).netPayableAmount());
    }
}
