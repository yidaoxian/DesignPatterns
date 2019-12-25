package com.hdw.factory.pizzastore.factoryMethod;

import com.hdw.factory.pizzastore.pizza.AbstractPizza;
import com.hdw.factory.pizzastore.pizza.LdCheesePizza;
import com.hdw.factory.pizzastore.pizza.LdPeeperPizza;

public class LDOrderPizza extends OrderPizza {
    @Override
    AbstractPizza createPizza(String orderType) {
        AbstractPizza pizza = null;
        if (orderType.equals("cheese")) {
            pizza = new LdCheesePizza();
        } else if (orderType.equals("pepper")) {
            pizza = new LdPeeperPizza();
        }
        return pizza;
    }
}
