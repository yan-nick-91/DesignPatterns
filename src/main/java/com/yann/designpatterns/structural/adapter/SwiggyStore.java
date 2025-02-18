package com.yann.designpatterns.structural.adapter;

import lombok.Getter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Getter
@ToString
public class SwiggyStore {
    private final List<Item> items = new ArrayList<>();

    public void addItems(Item item) {
        items.add(item);
    }
}
