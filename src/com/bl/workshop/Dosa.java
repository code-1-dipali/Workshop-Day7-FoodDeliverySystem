package com.bl.workshop;
public class Dosa extends FoodItem implements IVeg {
    public Dosa() {
        type = Type.VEG;
        taste = Taste.SPICY;
        preparationTime = 10;
        category = Category.STARTER;
        name = "Dosa";
    }

    public void printMainIngredients() {
        System.out.println(( "1.Atta, 2.Chapati" ));
    }
}
