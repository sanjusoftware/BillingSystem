package com.mckinsey.billingsystem;

/**
 * Created with IntelliJ IDEA.
 * User: Sanjeev
 * Date: 4/25/12
 * Time: 2:59 PM
 * To change this template use File | Settings | File Templates.
 */
public class EmployeeBill extends Bill {

    public EmployeeBill(double amount) {
        super(amount);
    }

    @Override
    public int getDiscount() {
        return 70;
    }

}
