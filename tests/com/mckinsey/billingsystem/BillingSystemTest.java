package com.mckinsey.billingsystem;

import junit.framework.TestCase;

/**
 * Created with IntelliJ IDEA.
 * User: Sanjeev
 * Date: 4/25/12
 * Time: 2:01 PM
 * To change this template use File | Settings | File Templates.
 */

public class BillingSystemTest extends TestCase {

    public void testEmployeeShouldGet30PercentDiscount() {
        assertEquals((double) 70, new EmployeeBill(100).netPayableAmount());
    }

    public void testAffiliateShouldGet10PercentDiscount() {
        assertEquals((double) 90, new AffiliateBill(100).netPayableAmount());
    }

    public void testCustomerOlderThan2YearsShouldGet5PercentDiscount() {
        assertEquals((double) 90, new AffiliateBill(100).netPayableAmount());
    }
}
