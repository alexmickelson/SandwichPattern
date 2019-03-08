import java.security.InvalidParameterException;

public class Burger extends Sandwich {

    public Burger(String bread, String meat, String cheese, String[] hotToppings,
                  String[] toppings, String[] sauce, String prepare) {
        super(bread, meat, cheese, hotToppings, toppings, sauce, prepare);
    }

    @Override
    public void bread(String bread) {
        System.out.println("Using burger bun");

    }

    @Override
    public void meat(String meat) {
        switch (meat.toLowerCase()){
            case "chicken":
            case "quarter pound hamburger":
            case "half pound hamburger":
                System.out.println("Using "+meat+" meat");
                break;
            default:
                throw new InvalidParameterException("Wrong kind of meat: "+meat);
        }

    }

    @Override
    public void cheese(String cheese) {
        switch (cheese.toLowerCase()){
            case "american":
            case "cheddar":
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
                case "lettuce":
                case "pickles":
                case "onions":
                case "tomatoes":
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
                case "mustard":
                case "ketchup":
                    System.out.println("Using "+s+" topping");
                    break;
                default:
                    throw new InvalidParameterException("Wrong kind of sauce: "+s);
            }

        }

    }

    @Override
    public void prepare(String prepare) {
        switch (prepare.toLowerCase()){
            case "go":
                System.out.println("Preparing to go");
                break;
            case "stay":
                System.out.println("Preparing to stay");
                break;
            default:
                throw new InvalidParameterException("Wrong kind of prep: "+prepare);
        }

    }

    @Override
    public void cook() {
        System.out.println("Grilling");
    }

    @Override
    public void hotToppings(String[] hotToppings){

        for (String s : hotToppings) {
            switch (s.toLowerCase()){
                case "grilledonions":
                case "meltedcheese":
                    System.out.println("Using "+s+" hot topping");
                    break;
                default:
                    throw new InvalidParameterException("Wrong kind of hot topping: "+s);
            }

        }
    }
}
