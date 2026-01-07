package service;

import model.Food;

public class ShoppingCart {
    private Food[] foodInCart;
    private double fullPrice = 0;
    private double fullVegetarianPrice = 0;
    private double discountedPrice = 0;

    public ShoppingCart(Food[] args) {
        for (int i = 0; i < args.length; i++) {
            int amount = args[i].getAmount();
            double price = args[i].getPrice();
            boolean isVegetarian = args[i].isVegetarian();
            //String colour = args[i].colour;
            fullPrice = fullPrice + (price * amount);
            if (isVegetarian) {
                fullVegetarianPrice = fullVegetarianPrice + (price * amount);
            }
        }
    }


    public double getCartFullPrice() {
        return fullPrice;
    }

    public double getCartDiscountedPrice() {
        return discountedPrice;
    }

    public double getVegetarianCartFullPrice() {
        return fullVegetarianPrice;
    }
}