package com.hdw.factory.pizzastore;

import com.hdw.factory.pizzastore.factoryMethod.LDOrderPizza;
import com.hdw.factory.pizzastore.factoryMethod.NYOrderPizza;

public class PizzaStore {

    public static void main(String[] args) {
        OrderPizza orderPizza1 = new OrderPizza();

        com.hdw.factory.pizzastore.simplefactory.OrderPizza orderPizza2 = new com.hdw.factory.pizzastore.simplefactory.OrderPizza();

        com.hdw.factory.pizzastore.factoryMethod.OrderPizza orderPizza3 = new LDOrderPizza();
        //com.hdw.factory.pizzastore.factoryMethod.OrderPizza orderPizza3 = new NYOrderPizza();

        com.hdw.factory.pizzastore.absfactory.OrderPizza orderPizza4 = new com.hdw.factory.pizzastore.absfactory.OrderPizza();
    }
}
