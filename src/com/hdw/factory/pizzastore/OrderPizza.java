package com.hdw.factory.pizzastore;

import com.hdw.factory.pizzastore.pizza.AbstractPizza;
import com.hdw.factory.pizzastore.pizza.CheesePizza;
import com.hdw.factory.pizzastore.pizza.GreekPizza;
import com.hdw.factory.pizzastore.pizza.PepperPizza;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class OrderPizza {

    public OrderPizza() {
        AbstractPizza pizza = null;
        String orderType;

        do {
            orderType = getType();
            if (orderType.equals("cheese")) {
                pizza = new CheesePizza();
            } else if (orderType.equals("greek")) {
                pizza = new GreekPizza();
            } else if (orderType.equals("pepper")) {
                pizza = new PepperPizza();
            } else {
                break;
            }
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
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
