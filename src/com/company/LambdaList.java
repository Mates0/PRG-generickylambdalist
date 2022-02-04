package com.company;

import java.util.ArrayList;

public class LambdaList<T> {
    private ArrayList<T> arrayList = new ArrayList<>();

    void add(T item) {
        arrayList.add(item);
    }

    void get(int i) {
        arrayList.get(i);
    }
}
