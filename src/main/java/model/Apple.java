package model;

public class Apple extends Food {
    String colour;

    public Apple (int amount, double price, String colour) {
        this.amount = amount;
        this.price = price;
        this.colour = colour;
        isVegetarian = true;
    }
    //дописать метод, возвращающий скидку 60, если цвет красный
}
