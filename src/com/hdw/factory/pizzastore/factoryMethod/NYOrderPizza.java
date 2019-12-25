package com.hdw.factory.pizzastore.factoryMethod;

import com.hdw.factory.pizzastore.pizza.AbstractPizza;
import com.hdw.factory.pizzastore.pizza.NyCheesePizza;
import com.hdw.factory.pizzastore.pizza.NyPepperPizza;

public class NYOrderPizza extends OrderPizza {
    @Override
    AbstractPizza createPizza(String orderType) {
        AbstractPizza pizza = null;
        if (orderType.equals("cheese")) {
            pizza = new NyCheesePizza();
        } else if (orderType.equals("pepper")) {
            pizza = new NyPepperPizza();
        }
        return pizza;
    }
}
