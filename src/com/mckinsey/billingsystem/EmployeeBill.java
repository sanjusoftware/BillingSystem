package com.mckinsey.billingsystem;

/**
 * Created with IntelliJ IDEA.
 * User: Sanjeev
 * Date: 4/25/12
 * Time: 2:59 PM
 * To change this template use File | Settings | File Templates.
 */
public class EmployeeBill {
    private double amount;

    public EmployeeBill(double amount) {
        this.amount = amount;
    }


    public double netPayableAmount() {
        return amount * 70 / 100 ;
    }
}
