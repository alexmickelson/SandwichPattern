import java.security.InvalidParameterException;

public class Subway extends Sandwich {
    public Subway(String bread, String meat, String cheese, String[] hotToppings, String[] toppings, String[] sauce) {
        super(bread, meat, cheese, hotToppings, toppings, sauce);
    }

    @Override
    public void bread(String bread) {
        switch (bread.toLowerCase()){
            case "italian":
            case "flat":
            case "wheat":
                System.out.println("Using "+bread+" Bread");
                break;
            default:
                throw new InvalidParameterException("Wrong kind of bread: "+bread);
        }

    }

    @Override
    public void meat(String meat) {
        switch (meat.toLowerCase()){
            case "pepperoni":
            case "salami":
            case "meatballs":
            case "turkey":
            case "ham":
            case "chicken":
                System.out.println("Using "+meat+" meat");
                break;
            default:
                throw new InvalidParameterException("Wrong kind of meat: "+meat);
        }

    }

    @Override
    public void cheese(String cheese) {
        switch (cheese.toLowerCase()){
            case "pepperjack":
            case "american":
            case "cheddar":
            case "provolone":
                System.out.println("Using "+cheese+" cheese");
                break;
            default:
                throw new InvalidParameterException("Wrong kind of cheese: "+cheese);
        }

    }

    @Override
    public void toppings(String[] toppings) {
        for (String topping : toppings) {
            switch (topping.toLowerCase()){
                case "cucumbers":
                case "spinach":
                case "lettuce":
                case "peppers":
                case "jalapenos":
                case "olives":
                    System.out.println("Using "+topping+" topping");
                    break;
                default:
                    throw new InvalidParameterException("Wrong kind of topping: "+topping);
            }

        }

    }

    @Override
    public void sauce(String[] sauce) {
        for (String s : sauce) {
            switch (s.toLowerCase()){
                case "mayo":
                case "mayonnaise":
                case "oil":
                case "mustard":
                case "ranch":
                    System.out.println("Using "+s+" topping");
                    break;
                default:
                    throw new InvalidParameterException("Wrong kind of sauce: "+s);
            }

        }

    }

    @Override
    public void prepare() {

    }

    @Override
    public void cook() {
        System.out.println("Toasting in toaster oven");
    }
}
