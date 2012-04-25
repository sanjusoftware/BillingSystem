package com.mckinsey.billingsystem;

import com.mckinsey.billingsystem.user.User;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Sanjeev
 * Date: 4/25/12
 * Time: 3:16 PM
 * To change this template use File | Settings | File Templates.
 */

public class Bill {
    private static final int DISCOUNT_RATE_PER_100 = 5;
    private double amount;
    private User user;
    private List<Item> items;

    public Bill(List<Item> items, User user) {
        this.items = items;
        this.user = user;
    }

    public double netPayableAmount() {
        amount = getTotalBillableAmount();
        return amount - getBillDiscount() - getUserDiscount();
    }

    private double getTotalBillableAmount() {
        double billableAmount = 0;
        for (Item item : items) {
            billableAmount += item.amount();
        }
        return billableAmount;
    }

    private double getDiscountableAmount() {
        double discountableAmount = 0;
        for (Item item : items) {
            discountableAmount += item.discountableAmount();
        }
        return discountableAmount;
    }

    private double getUserDiscount() {
        return getDiscountableAmount() * user.getDiscountPercentage() / 100;
    }

    private double getBillDiscount() {
        return (int) (amount / 100) * DISCOUNT_RATE_PER_100;
    }

}
