package model;

import java.util.Objects;

import static model.constants.Colour.RED_COLOR;
import static model.constants.Discount.DISCOUNT;

public class Apple extends Food {
    private String colour;

    public Apple (int amount, double price, String colour) {
        this.amount = amount;
        this.price = price;
        this.colour = colour;
        isVegetarian = true;

    }

    @Override
    public double getDiscount () {
        if (Objects.equals(colour, RED_COLOR)){
            return DISCOUNT;
        } else {
            return 0;
        }
    }

    public String getColour(){
        return colour;
    }
}
