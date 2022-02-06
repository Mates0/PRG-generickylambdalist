package com.company;

import java.util.ArrayList;

public class LambdaList<T> {
    private final ArrayList<T> arrayList = new ArrayList<>();

    void add(T item) {
        arrayList.add(item);
    }

    T get(int i) {
        return arrayList.get(i);
    }

    void remove(int i) {
        arrayList.remove(i);
    }

    T max(ICompare<T> compare) {
        T x = arrayList.get(0);
        for (int i = 1; i < arrayList.size(); i++) {
            if (compare.compare(x, arrayList.get(i)) < 0) {
                x = arrayList.get(i);
            }
        }
        return x;
    }

    T min(ICompare<T> compare) {
        T x = arrayList.get(0);
        for (int i = 1; i < arrayList.size(); i++) {
            if (compare.compare(x, arrayList.get(i)) > 0) {
                x = arrayList.get(i);
            }
        }
        return x;
    }

    boolean all(IBoolean<T> bool) {
        for (T t : arrayList) {
            if (!bool.bool(t)) {
                return false;
            }
        }
        return true;
    }

    boolean any(IBoolean<T> bool) {
        for (T t : arrayList) {
            if (bool.bool(t)) {
                return true;
            }
        }
        return false;
    }

    LambdaList<T> filter(IBoolean<T> bool) {
        LambdaList<T> lambdaList = new LambdaList<>();
        for (T t : arrayList) {
            if (bool.bool(t)) {
                lambdaList.add(t);
            }
        }
        return lambdaList;
    }
}
