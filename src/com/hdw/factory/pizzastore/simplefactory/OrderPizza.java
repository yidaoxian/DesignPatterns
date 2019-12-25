package com.hdw.factory.pizzastore.simplefactory;

import com.hdw.factory.pizzastore.pizza.AbstractPizza;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class OrderPizza {

    SimplePizzaFactory simplePizzaFactory;

    public OrderPizza(SimplePizzaFactory simplePizzaFactory){
        setFactory(simplePizzaFactory);
    }

    public void setFactory(SimplePizzaFactory factory) {
        AbstractPizza pizza = null;
        String orderType;
        this.simplePizzaFactory = factory;
        do {
            orderType = getType();
            pizza = simplePizzaFactory.createPizza(orderType);
            if (pizza != null) {
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            }
        } while (true);
    }

    private String getType(){
        String type = null;
        try {
            BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("input pizza type");
            type = strin.readLine();

        }catch (Exception e){
            e.printStackTrace();
        }
        return type;
    }
}
