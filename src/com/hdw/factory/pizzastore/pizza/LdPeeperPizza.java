package com.hdw.factory.pizzastore.pizza;

public class LdPeeperPizza extends AbstractPizza{

    @Override
    public void prepare() {
        super.setName("LdPeeperPizza");
        System.out.println(name + " preparing;");
    }
}
