package com.mckinsey.billingsystem;

/**
 * Created with IntelliJ IDEA.
 * User: Sanjeev
 * Date: 4/25/12
 * Time: 3:16 PM
 * To change this template use File | Settings | File Templates.
 */
public abstract class Bill {
    protected double amount;

    public Bill(double amount) {
        this.amount = amount;
    }

    public double netPayableAmount() {
        return amount * getDiscount() / 100;
    }

    public abstract int getDiscount();
}
