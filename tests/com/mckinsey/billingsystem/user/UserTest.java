package com.mckinsey.billingsystem.user;

import junit.framework.Assert;
import org.joda.time.DateTime;
import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * User: Sanjeev
 * Date: 4/25/12
 * Time: 6:21 PM
 * To change this template use File | Settings | File Templates.
 */
public class UserTest {
    @Test
    public void testGetDiscountPercentage() throws Exception {
        Assert.assertEquals(30.0, new Employee(new DateTime()).getDiscountPercentage());
        Assert.assertEquals(10.0, new Affiliate(new DateTime()).getDiscountPercentage());
        Assert.assertEquals(0.0, new Customer(new DateTime()).getDiscountPercentage());
        Assert.assertEquals(5.0, new Customer(new DateTime(2009, 1, 1, 0, 0, 0, 0)).getDiscountPercentage());
    }
}
