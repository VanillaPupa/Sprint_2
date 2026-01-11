import model.Apple;
import model.Food;
import model.Meat;
import service.ShoppingCart;

import static model.constants.Colour.GREEN_COLOR;
import static model.constants.Colour.RED_COLOR;

public class Main {

    public static void main(String[] args) {

        Food meat = new Meat(5, 100);
        Food redApple = new Apple(10, 5, RED_COLOR);
        Food greenApple = new Apple(8, 7.5, GREEN_COLOR);

        Food [] shoppingCart = {meat, redApple, greenApple};

        ShoppingCart cart = new ShoppingCart(shoppingCart);

        System.out.println(cart.getCartFullPrice());
        System.out.println(cart.getCartDiscountedPrice());
        System.out.println(cart.getVegetarianCartFullPrice());
    }
}

