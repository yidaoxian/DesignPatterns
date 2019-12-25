package com.hdw.factory.pizzastore.pizza;

public class CheesePizza extends AbstractPizza {
    @Override
    public void prepare() {
        super.setName("CheesePizza");
        System.out.println(name + " preparing;");
    }
}
