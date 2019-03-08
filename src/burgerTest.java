import org.junit.Test;
import java.security.InvalidParameterException;


public class burgerTest{
    @Test
    public void HookHappens_Burger(){

        String[] hotToppings = new String[]{"grilledOnions", "meltedCheese"};
        String[] toppings = new String[]{"lettuce", "tomatoes"};
        String[] sauce = new String[]{"mayo", "ketchup"};

        System.out.println("\n\n\n");
        Burger burger = new Burger("bread", "quarter pound hamburger", "cheddar",
                hotToppings, toppings, sauce, "go");
    }
}
