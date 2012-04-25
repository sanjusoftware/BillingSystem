package com.mckinsey.billingsystem;

/**
 * Created with IntelliJ IDEA.
 * User: Sanjeev
 * Date: 4/25/12
 * Time: 3:15 PM
 * To change this template use File | Settings | File Templates.
 */
public class AffiliateBill extends Bill {
    public AffiliateBill(double amount) {
        super(amount);
    }

    @Override
    public int getDiscount() {
        return 90;
    }
}
