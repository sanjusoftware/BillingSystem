package com.mckinsey.billingsystem.user;

import org.joda.time.DateTime;

/**
 * Created with IntelliJ IDEA.
 * User: Sanjeev
 * Date: 4/25/12
 * Time: 3:50 PM
 * To change this template use File | Settings | File Templates.
 */

public class Employee extends User {

    public Employee(DateTime joiningDate) {
        super(joiningDate);
    }

    @Override
    public double getDiscount() {
        return 30;
    }
}
