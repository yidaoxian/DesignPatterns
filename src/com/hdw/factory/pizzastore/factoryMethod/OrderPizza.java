package com.hdw.factory.pizzastore.factoryMethod;

import com.hdw.factory.pizzastore.pizza.AbstractPizza;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public abstract class OrderPizza {
    public OrderPizza() {
        AbstractPizza pizza = null;
        String orderType;

        do {
            orderType = getType();
            pizza = createPizza(orderType);
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        } while (true);

    }

    abstract AbstractPizza createPizza(String orderType);

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
