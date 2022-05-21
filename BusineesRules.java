public class BusineesRules {
    public static boolean pizzaTest(Pizza pizza,Toppings toppings){
        if((pizza.veg && toppings.veg) || !pizza.veg && !toppings.veg)
            return true;
        return false;
    }
}
