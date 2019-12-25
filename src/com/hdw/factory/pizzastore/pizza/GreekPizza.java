package com.hdw.factory.pizzastore.pizza;

public class GreekPizza extends AbstractPizza {
    @Override
    public void prepare() {
        super.setName("GreekPizza");
        System.out.println(name + " preparing;");
    }
}
