package com.hdw.factory.pizzastore.absfactory;

import com.hdw.factory.pizzastore.pizza.AbstractPizza;

public interface AbsFactory {
    public AbstractPizza createPizza(String orderType);
}
