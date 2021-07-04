package com.bl.workshop;
public class Biryani extends FoodItem implements INonVeg{
    public Biryani() {
        type = Type.NON_VEG;
        taste = Taste.SPICY;
        preparationTime = 45;
        category = Category.MAINCOURSE;
        name = "Biryani.";
    }
    public void printMainIngredients() {

        System.out.println("1.Rice, 2.Chicken");
    }
}


