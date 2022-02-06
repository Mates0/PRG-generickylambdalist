package com.company;

public class Main {

    public static void main(String[] args) {
        LambdaList<Integer> lam = new LambdaList<>();
        for (int i = 0; i < 5; i++) {
            lam.add(i + 1);
        }
        System.out.println(lam.all(x -> x < 6));
        System.out.println(lam.any(x -> x > 6));
        System.out.println(lam.min((x, y) -> x - y));
        System.out.println(lam.max((x, y) -> x - y));
    }
}
