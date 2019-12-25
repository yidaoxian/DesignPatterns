package com.hdw.factory.pizzastore.pizza;

public class PepperPizza extends AbstractPizza {
    @Override
    public void prepare() {
        super.setName("PepperPizza");
        System.out.println(name + " preparing;");
    }
}
