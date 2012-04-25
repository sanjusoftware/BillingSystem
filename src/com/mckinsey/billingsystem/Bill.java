package com.mckinsey.billingsystem;

import com.mckinsey.billingsystem.user.User;

/**
 * Created with IntelliJ IDEA.
 * User: Sanjeev
 * Date: 4/25/12
 * Time: 3:16 PM
 * To change this template use File | Settings | File Templates.
 */
public class Bill {
    protected double amount;
    private User user;

    public Bill(double amount, User user) {
        this.amount = amount;
        this.user = user;
    }

    public double netPayableAmount() {
        return amount - amount * user.getDiscount() / 100;
    }

}
