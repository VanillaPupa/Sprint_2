import model.Apple;
import model.Food;
import model.Meat;
import service.ShoppingCart;

public class Main {

    public static void main(String[] args) {

        Food meat = new Meat(5, 100);
        Food redApple = new Apple(10, 50, "red");
        Food greenApple = new Apple(8, 60, "green");

        Food [] shoppingCart = {meat, redApple, greenApple};

        ShoppingCart cart = new ShoppingCart(shoppingCart);

        System.out.println(cart.getCartFullPrice(shoppingCart));
        System.out.println(cart.getCartDiscountedPrice());
        System.out.println(cart.getVegetarianCartFullPrice(shoppingCart));
    }
}

/*Все переменные класса должны быть недоступны извне, если не указано иное.
Доступ к ним реализуй через известные тебе методы: создавай только те,
которые действительно нужны для реализации описанной функциональности. */