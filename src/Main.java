public class Main {
    public static void main(String[] args){
        String[] empty = new String[0];
        String[] toppings = new String[]{"cucumbers", "spinach"};
        String[] sauce = new String[]{"mayo", "oil"};
        Subway sub = new Subway("italian","pepperoni", "pepperjack",
                                empty, toppings, sauce, "prep");

        String[] hotToppings = new String[]{"grilledOnions", "meltedCheese"};
        toppings = new String[]{"lettuce", "tomatoes"};
        sauce = new String[]{"mayo", "ketchup"};

        System.out.println("\n\n\n");
        Burger burger = new Burger("bread", "quarter pound hamburger", "cheddar",
                                    hotToppings, toppings, sauce, "go");
    }
}
