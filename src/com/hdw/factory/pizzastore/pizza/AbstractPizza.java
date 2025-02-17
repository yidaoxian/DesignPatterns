package com.hdw.factory.pizzastore.pizza;

public abstract class AbstractPizza {
    String name;

    /**
     * 准备
     */
    public abstract void prepare();
    public void bake(){
        System.out.println(name + " breaking;");
    }
    public void cut(){
        System.out.println(name + " cutting;");
    }
    public void box(){
        System.out.println(name + " boxing;");
    }
    void setName(String name){
        this.name = name;
    }
}
