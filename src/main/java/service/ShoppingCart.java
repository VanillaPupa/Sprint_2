package service;

import model.Food;

public class ShoppingCart {

    public ShoppingCart (Food [] args) {
    }

    public double getCartFullPrice (Food [] item) {
        double fullPrice = 0;

        for (int i=0; i<item.length; i++) {
            int amount = item[i].getAmount();
            double price = item[i].getPrice();
            fullPrice = fullPrice + (price * amount);
        }
        return fullPrice;
    }

    public double getCartDiscountedPrice () {
        return 0;
    }

    public double getVegetarianCartFullPrice (Food [] item) {
        double fullPrice = 0;

        for (int i=0; i<item.length; i++) {
            boolean isVegetarian = item[i].isVegetarian();

            if (isVegetarian){
                int amount = item[i].getAmount();
                double price = item[i].getPrice();
                fullPrice = fullPrice + (price * amount);
            }
        }
        return fullPrice;
    }
}
