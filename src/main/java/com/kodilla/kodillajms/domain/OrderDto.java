package com.kodilla.kodillajms.domain;

import java.io.Serializable;

public class OrderDto implements Serializable {
    private int id;

    public OrderDto() {;
    }

    public int getId() {
        return id;
    }
}