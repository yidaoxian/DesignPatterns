package com.hdw.factory.pizzastore.pizza;

public class NyPepperPizza extends AbstractPizza {

    @Override
    public void prepare() {
        super.setName("NyPeeperPizza");
        System.out.println(name + " preparing;");
    }
}
