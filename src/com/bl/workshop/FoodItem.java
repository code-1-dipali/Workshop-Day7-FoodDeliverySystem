package com.bl.workshop;
interface IVeg {}
interface  INonVeg {}
public abstract class FoodItem {
    enum Taste {SPICY , SWEET, SALTY, SPICY_SALTY};
    enum Category {MAINCOURSE, STARTER, JUICES, DESERT}
    enum Type {VEG , NON_VEG}

    @Override
    public String toString() {
        return "FoodItem{" +
                "name=" + name +
                ", type=" + type +
                ", taste=" + taste +
                ", price= " + price +
                ", preparationTime=" + preparationTime +
                ", category=" + category +
                '}';
    }

    Type type;
    Taste taste;
    float price;
    short preparationTime;
    Category category;
    String name;

   public abstract void printMainIngredients();


}