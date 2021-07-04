package com.bl.workshop;

import java.lang.invoke.SwitchPoint;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
    FoodManager foodManager = new FoodManager();

    public static void main(String[] args) {
        Biryani biryani = new Biryani();
        biryani.price = 150;
        AppleJuice appleJuice = new AppleJuice();
        appleJuice.price = 25;
        Dosa dosa = new Dosa();
        dosa.price = 40;
        PaniPuri paniPuri = new PaniPuri();
        paniPuri.price = 30;

        Main mainObj = new Main();

        mainObj.foodManager.add(dosa);
        mainObj.foodManager.add(appleJuice);
        mainObj.foodManager.add(biryani);
        mainObj.foodManager.add(paniPuri);
        //mainObj.foodManager.printAllVegItems();
       // System.out.println(mainObj.foodManager.getFoodCount());
        //mainObj.foodManager.printAllNonVegItems();
        //mainObj.foodManager.printAllNonVegItems();
        mainObj.foodManager.print();
        mainObj.ShowMenu();
        mainObj.foodManager.print();
        //mainObj.foodManager.printAllVegItems();

    }
    public void ShowMenu() {
        System.out.println("1.To Update Food Items");
        Scanner sc = new Scanner(System.in);
        int Choice = sc.nextInt();
        switch(Choice) {
            case 1:
                updateFoodItems();
                break;
            default:
                System.out.println("Error");
        }
    }
    private void updateFoodItems(){
        Scanner sc = new Scanner(System .in);
        System.out.println("Enter Food Item");
        String item = sc.nextLine();

        FoodItem foodItem = foodManager.getFoodItem(item);
        System.out.println(foodItem);
        System.out.println("press 1 to change taste");
        System.out.println("press 2 to change Preparation time");
        System.out.println("press 3 to change Category");
        System.out.println("press 4 to change name");
        int parameter = sc.nextInt();

        switch (parameter){
            case 1:
                System.out.println("to change taste");
                System.out.println("press 1 to change SPICY");
                System.out.println("press 2 to change SWEET");
                System.out.println("press 3 to change SALTY");
                System.out.println("press 4 to change SPICY_SALTY");
                int taste = sc.nextInt();

                switch (taste){
                    case 1:
                    foodItem.taste = FoodItem.Taste.SPICY;
                    break;
                    case 2:
                        foodItem.taste = FoodItem.Taste.SWEET;
                        break;
                    case 3:
                        foodItem.taste = FoodItem.Taste.SALTY;
                        break;
                    case 4:
                        foodItem.taste = FoodItem.Taste.SPICY_SALTY;
                        break;
                    default:
                        System.out.println("Enter right ");


                }
                System.out.println("Updated foodItem = " +foodItem);
                break;
            case 2:
                System.out.println("Enter Preparation time: ");
                short time = sc.nextShort();
                foodItem.preparationTime = time;
                break;






        }
    }
}
