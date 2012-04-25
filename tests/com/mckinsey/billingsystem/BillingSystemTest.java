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

    public void testEmployeeShouldGet30percentDiscount(){

        assertEquals((double) 70, new EmployeeBill(100).netPayableAmount());
    }
}
