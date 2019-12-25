package com.hdw.factory.pizzastore.absfactory;

import com.hdw.factory.pizzastore.pizza.AbstractPizza;
import com.hdw.factory.pizzastore.pizza.NyCheesePizza;
import com.hdw.factory.pizzastore.pizza.NyPepperPizza;

public class NyFactory implements AbsFactory {
    @Override
    public AbstractPizza createPizza(String orderType) {
        AbstractPizza abstractPizza = null;
        if ("cheese".equals(orderType)){
            abstractPizza = new NyCheesePizza();
        }else if ("pepper".equals(orderType)){
            abstractPizza = new NyPepperPizza();
        }
        return abstractPizza;
    }
}
