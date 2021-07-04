package com.bl.workshop;

public class PaniPuri extends FoodItem implements IVeg {
    public PaniPuri() {
        type = Type.VEG;
        taste = Taste.SALTY;
        preparationTime = 2;
        category = Category.STARTER;
        name = "PaniPuri";
    }

    public void printMainIngredients() {
        System.out.println(( "1.Puri, 2.chat" ));
    }
}