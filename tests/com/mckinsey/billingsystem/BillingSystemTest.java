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
        assertEquals((double) 70, new Bill(100, new Employee(new DateTime())).netPayableAmount());
    }

    public void testAffiliateShouldGet10PercentDiscount() {
        assertEquals((double) 90, new Bill(100, new Affiliate(new DateTime())).netPayableAmount());
    }

    public void testCustomerNewerThan2YearsShouldNotGetAnyDiscount() {
        assertEquals((double) 100, new Bill(100, new Customer(new DateTime())).netPayableAmount());
    }

    public void testCustomerOlderThan2YearsShouldGetAnyDiscount() {
        assertEquals((double) 95, new Bill(100, new Customer(new DateTime(2009, 1, 1, 0, 0, 0, 0))).netPayableAmount());
    }
}
