package model;

import static model.constants.Colour.red;
import static model.constants.Discount.discount;

public class Apple extends Food {
    private String colour;

    public Apple (int amount, double price, String colour) {
        this.amount = amount;
        this.price = price;
        this.colour = colour;
        isVegetarian = true;

    }

    public String getColour(){
        return colour;
    }

    public double getDiscountedPrice (){
        if (colour == red){
            return price * discount / 100;
        } else {
            return price;
        }
    }
}
