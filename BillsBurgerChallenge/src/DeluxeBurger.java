public class DeluxeBurger extends Hamburger{

    Addition additionChips = new Addition("Chips",2.00);
    Addition additionDrink = new Addition("Drink",2.50);



    public DeluxeBurger(String hamburgerName, String breadType, String meat) {
        super(hamburgerName, breadType, meat);
        super.addAdditions(additionChips);
        super.addAdditions(additionDrink);
    }


    @Override
    public void addAdditions(Addition addition){
        System.out.println("No extra additions allowed");
    }
}