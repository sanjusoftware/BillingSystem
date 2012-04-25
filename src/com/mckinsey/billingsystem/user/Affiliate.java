package com.mckinsey.billingsystem.user;

import org.joda.time.DateTime;

/**
 * Created with IntelliJ IDEA.
 * User: Sanjeev
 * Date: 4/25/12
 * Time: 3:54 PM
 * To change this template use File | Settings | File Templates.
 */
public class Affiliate extends User {

    public Affiliate(DateTime joiningDate) {
        super(joiningDate);
    }

    @Override
    public double getDiscount() {
        return 10;
    }

}
