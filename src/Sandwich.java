public abstract class Sandwich {

    public Sandwich(String bread, String meat, String cheese, String[] hotToppings,
                    String[] toppings, String[] sauce, String prepare){
        bread(bread);
        meat(meat);
        cheese(cheese);
        cook();
        hotToppings(hotToppings);
        toppings(toppings);
        sauce(sauce);
        prepare(prepare);
    }

    public abstract void bread(String bread);
    public abstract void meat(String meat);
    public abstract void cheese(String cheese);
    public abstract void toppings(String[] toppings);
    public abstract void sauce(String[] sauce);


    public abstract void prepare(String prepare);
    public abstract void cook();

    public void hotToppings(String[] hotToppings){}

}
