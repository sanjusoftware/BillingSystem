package com.mckinsey.billingsystem;

/**
 * Created with IntelliJ IDEA.
 * User: Sanjeev
 * Date: 4/25/12
 * Time: 5:18 PM
 * To change this template use File | Settings | File Templates.
 */
public class Item {
    private double amount;

    public Item(double amount) {
        this.amount = amount;
    }

    public double discountableAmount() {
        return amount();
    }

    public double amount() {
        return amount;
    }
}
