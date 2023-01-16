package com.driver;

import org.w3c.dom.ls.LSOutput;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private boolean CheeseEx;
    private boolean Toppings;
    private boolean TakeAway;
    private int total;
    //Veg pizza base price = 300
    //Non-veg pizza base price = 400
    //Extra Cheese Price = 80
    //Extra Toppings For Veg Pizza = 70
    //Extra Toppings For Non-veg Pizza = 120
    //Paper bag Price = 20

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        price = this.isVeg?300:400;
        // your code goes here
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if (!CheeseEx){
            CheeseEx = true;
            price +=80;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(!Toppings){
            Toppings=true;
            price += isVeg?70:120;
        }
    }

    public void addTakeaway(){
        // your code goes here

        if(!TakeAway){
            TakeAway = true;
            price += 20;
        }

    }

    public String getBill(){
        // your code goes here

        //Base Price Of The Pizza: 300
        //Extra Cheese Added: 80
        //Extra Toppings Added: 70
        //Paperbag Added: 20
        //Total Price: 470
        bill = "Base Price Of The Pizza: "+(isVeg?300:400)+"\n"+(CheeseEx?("Extra Cheese Added: "+80+"\n"):"")+(Toppings?("Extra Toppings Added: "+(isVeg?70:120)+"\n"):"")+
                (TakeAway?("Paperbag Added: "+20+"\n"):"")+"Total Price: "+price;
//        System.out.println("Base Price of The Pizza: "+(isVeg?300:400));
//        if(CheeseEx){
//            System.out.println("Extra Cheese Added: "+80);
//        }
//        if(Toppings){
//            System.out.println("Extra Toppings Added: "+(isVeg?70:120));
//        }
//        if(TakeAway){
//            System.out.println("Paperbag Added: "+20);
//        }
//        System.out.println("Total Price: "+price);
        return this.bill;
    }
}
