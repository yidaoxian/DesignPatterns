package com.hdw.factory.pizzastore.simplefactory;

import com.hdw.factory.pizzastore.pizza.AbstractPizza;
import com.hdw.factory.pizzastore.pizza.CheesePizza;
import com.hdw.factory.pizzastore.pizza.GreekPizza;
import com.hdw.factory.pizzastore.pizza.PepperPizza;

public class SimplePizzaFactory {
    public AbstractPizza createPizza(String orderType) {
        AbstractPizza pizza = null;
        if (orderType.equals("cheese")) {
            pizza = new CheesePizza();
        } else if (orderType.equals("greek")) {
            pizza = new GreekPizza();
        } else if (orderType.equals("pepper")) {
            pizza = new PepperPizza();
        }
        return pizza;
    }
}
