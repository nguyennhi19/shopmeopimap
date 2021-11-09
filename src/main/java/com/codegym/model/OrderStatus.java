package com.codegym.model;

public enum OrderStatus {
    CONFIRMED(1),PICKUP(2),DELIVERING(3),DELIVERED(4),CANCELLED(5),RETURNS(6);

    private int value;


    private OrderStatus(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }

    public static OrderStatus fromValue(int value) {
        OrderStatus[] var1 = values();
        int var2 = var1.length;

        for (int var3 = 0; var3 < var2; ++var3) {
            OrderStatus c = var1[var3];
            if (c.value == value) {
                return c;
            }
        }

        throw new IllegalArgumentException("Invalid user status value: " + value);
    }
}
