package com.hdw.factory.pizzastore.absfactory;

import com.hdw.factory.pizzastore.pizza.AbstractPizza;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class OrderPizza {

    private AbsFactory factory;

    public OrderPizza(AbsFactory absFactory) {
        setFactory(absFactory);
    }

    public void setFactory(AbsFactory absFactory) {
        AbstractPizza pizza;
        this.factory = absFactory;
        do {
            String orderType = getType();
            pizza = factory.createPizza(orderType);
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
