package com.pluralsight.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class FixedList<T> {
    private List<T> items = new ArrayList<>();
    private int maxSize;
    public int count = 0;

    public FixedList(int maxSize) {
        this.maxSize = maxSize;

    }

    public List<T> getItems() {
        return items;
    }

    public boolean addItem(T item) {
        if (items.size() >= maxSize) {
            return false;
        }
        items.add(item);
        count++;
        return true;
    }
}
