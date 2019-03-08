import org.junit.Test;

import java.security.InvalidParameterException;

import static org.junit.Assert.*;

public class myTest {

    @Test
    public void HookNotTaken_SubSandwich(){
        String[] empty = new String[0];
        String[] toppings = new String[]{"cucumbers", "spinach"};
        String[] sauce = new String[]{"mayo", "oil"};
        Subway sub = new Subway ( "blablabla", "pepperoni", "pepperjack",
                                    sauce, toppings, sauce, "prep" );


    }


    @Test(expected = InvalidParameterException.class)
    public void BadBread_SubSandwich(){
        String[] empty = new String[0];
        String[] toppings = new String[]{"cucumbers", "spinach"};
        String[] sauce = new String[]{"mayo", "oil"};
        Subway sub = new Subway ( "blablabla", "pepperoni", "pepperjack",
                                    empty, toppings, sauce, "prep" );


    }

    @Test(expected = InvalidParameterException.class)
    public void BadTopping_SubSandwich(){
        String[] empty = new String[0];
        String[] toppings = new String[]{"cucers", "spinach"};
        String[] sauce = new String[]{"mayo", "oil"};
        Subway sub = new Subway ( "italian", "pepperoni", "pepperjack",
                                    empty, toppings, sauce, "prep" );
    }
    @Test(expected = InvalidParameterException.class)
    public void BadSauce_SubSandwich(){
        String[] empty = new String[0];
        String[] toppings = new String[]{"cucumbers", "spinach"};
        String[] sauce = new String[]{"teriakaii", "oil"};
        Subway sub = new Subway ( "italian", "pepperoni", "pepperjack",
                                    empty, toppings, sauce, "prep" );
    }
    @Test(expected = InvalidParameterException.class)
    public void Badcheese_SubSandwich(){
        String[] empty = new String[0];
        String[] toppings = new String[]{"cucumbers", "spinach"};
        String[] sauce = new String[]{"oil"};
        Subway sub = new Subway ( "italian", "pepperoni", "papajaaaaakkkk",
                                    empty, toppings, sauce, "prep" );
    }

    @Test(expected = InvalidParameterException.class)
    public void BadMeat_SubSandwich(){
        String[] empty = new String[0];
        String[] toppings = new String[]{"cucumbers", "spinach"};
        String[] sauce = new String[]{"oil"};
        Subway sub = new Subway ( "italian", "", "pepperJack",
                                    empty, toppings, sauce, "prep" );
    }
    @Test
    public void ValidWorks_SubSandwich(){
        String[] empty = new String[0];
        String[] toppings = new String[]{"cucumbers", "spinach"};
        String[] sauce = new String[]{"oil"};
        Subway sub = new Subway ( "italian", "pepperoni", "pepperJack",
                                    empty, toppings, sauce, "prep" );
    }

}


