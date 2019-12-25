package com.hdw.factory.pizzastore.pizza;


public class LdCheesePizza extends AbstractPizza {
    @Override
    public void prepare() {
        super.setName("LdCheesePizza");
        System.out.println(name + " preparing;");
    }
}
