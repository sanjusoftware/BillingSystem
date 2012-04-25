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
    public static final int DISCOUNT_RATE_PER_100 = 5;
    protected double amount;
    private User user;

    public Bill(double amount, User user) {
        this.amount = amount;
        this.user = user;
    }

    public double netPayableAmount() {
        return amount - getUserDiscount() - getBillDiscount();
    }

    private double getUserDiscount() {
        return amount * user.getDiscountPercentage() / 100;
    }

    private double getBillDiscount() {
        return (int) (amount / 100) * DISCOUNT_RATE_PER_100;
    }

}
