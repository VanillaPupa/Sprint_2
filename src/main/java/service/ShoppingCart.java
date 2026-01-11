package service;

import model.Food;

public class ShoppingCart {
    private Food[] foodInCart;

    public ShoppingCart(Food[] args) {
        foodInCart = args;
    }


    public double getCartFullPrice() {
        double fullPrice = 0;
        for (int i = 0; i < foodInCart.length; i++) {
            int amount = foodInCart[i].getAmount();
            double price = foodInCart[i].getPrice();
            fullPrice = fullPrice + (price * amount);
        }
        return fullPrice;
    }

    public double getCartDiscountedPrice() {
        double discountedPrice = 0;
        for (int i=0; i<foodInCart.length; i++) {
            int amount = foodInCart[i].getAmount();
            double price = foodInCart[i].getPrice();
            double discount = foodInCart[i].getDiscount();
            discountedPrice = discountedPrice + (price * amount) - (price * amount * discount / 100);
        }
        return discountedPrice;
    }

    public double getVegetarianCartFullPrice() {
        double fullVegetarianPrice = 0;
        for (int i = 0; i < foodInCart.length; i++) {
            boolean isVegetarian = foodInCart[i].isVegetarian();
            if (isVegetarian) {
                int amount = foodInCart[i].getAmount();
                double price = foodInCart[i].getPrice();
                fullVegetarianPrice = fullVegetarianPrice + (price * amount);
            }
        }
        return fullVegetarianPrice;
    }
}
