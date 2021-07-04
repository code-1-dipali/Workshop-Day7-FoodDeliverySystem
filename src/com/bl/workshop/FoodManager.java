package com.bl.workshop;

import java.util.*;

public class FoodManager {

   // List<FoodItem> foodList = new ArrayList();
    Set<FoodItem> foodList = new HashSet<>();
    private byte foodItem;

    public void add(FoodItem foodItem) {

        foodList.add(foodItem);
    }

    public void print() {
        for (FoodItem element : foodList)
            System.out.println(element);

    }

    public void delete(FoodItem foodItem) {
        foodList.remove(foodItem);
    }

    public int getFoodCount() {
        return foodList.size();
    }

    public void printAllVegItems() {
        System.out.println("printing all the veg items");
        for (FoodItem element : foodList) {
            if (element instanceof IVeg) {
                System.out.println(element);
            }
        }
    }
    FoodItem getFoodItem (String name) {
        Iterator iterator = foodList.iterator();
        for (FoodItem elements : foodList) {
            if (iterator.hasNext()) {
                FoodItem foodItem = (FoodItem) iterator.next();
                if (foodItem.name.equals(name)) {
                    return foodItem;
                }
            }
        }
        return null;
    }

    public void printAllNonVegItems () {
                System.out.println("printing all the INonveg items");
                for (FoodItem element : foodList) {
                    if (element instanceof INonVeg) {
                        System.out.println(element);
                    }
                }
            }
        }

