package com.hdw.factory.pizzastore.absfactory;

import com.hdw.factory.pizzastore.pizza.AbstractPizza;
import com.hdw.factory.pizzastore.pizza.LdCheesePizza;
import com.hdw.factory.pizzastore.pizza.LdPeeperPizza;

public class LdFactory implements AbsFactory {
    @Override
    public AbstractPizza createPizza(String orderType) {
        AbstractPizza abstractPizza = null;
        if ("cheese".equals(orderType)){
            abstractPizza = new LdCheesePizza();
        }else if ("pepper".equals(orderType)){
            abstractPizza = new LdPeeperPizza();
        }
        return abstractPizza;
    }
}
