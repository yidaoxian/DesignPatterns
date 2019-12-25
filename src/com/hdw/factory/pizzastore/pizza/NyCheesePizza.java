package com.hdw.factory.pizzastore.pizza;

public class NyCheesePizza extends AbstractPizza {
    @Override
    public void prepare() {
        super.setName("NyCheesePizza");
        System.out.println(name + " preparing;");
    }
}