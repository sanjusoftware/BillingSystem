package com.mckinsey.billingsystem;

/**
 * Created with IntelliJ IDEA.
 * User: Sanjeev
 * Date: 4/25/12
 * Time: 5:25 PM
 * To change this template use File | Settings | File Templates.
 */
public class Grocery extends Item {

    public Grocery(double price) {
        super(price);
    }

    @Override
    public double discountableAmount() {
        return 0;
    }
}
