package com.mckinsey.billingsystem.user;

import org.joda.time.DateTime;
import org.joda.time.Years;

/**
 * Created with IntelliJ IDEA.
 * User: Sanjeev
 * Date: 4/25/12
 * Time: 3:59 PM
 * To change this template use File | Settings | File Templates.
 */
public class Customer extends User {

    public Customer(DateTime joiningDate) {
        super(joiningDate);
    }

    @Override
    public double getDiscount() {
        return isOlderThan2Years() ? 5 : 0;
    }

    private boolean isOlderThan2Years() {
        return Years.yearsBetween(joiningDate, new DateTime()).getYears() > 2;
    }
}
