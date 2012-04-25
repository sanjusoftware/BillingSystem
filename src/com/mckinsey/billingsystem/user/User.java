package com.mckinsey.billingsystem.user;

import org.joda.time.DateTime;

/**
 * Created with IntelliJ IDEA.
 * User: Sanjeev
 * Date: 4/25/12
 * Time: 3:45 PM
 * To change this template use File | Settings | File Templates.
 */
public abstract class User {
    protected final DateTime joiningDate;

    protected User(DateTime joiningDate) {
        this.joiningDate = joiningDate;
    }

    public abstract double getDiscount();
}
