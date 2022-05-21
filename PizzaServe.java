public class PizzaServe {
    public Pizza pizza;
    public Toppings topping;
    
    public PizzaServe(Pizza pizza,Toppings topping){
        this.pizza=pizza;
        this.topping=topping;
    }

    public String toString(){
        return "Pizza =" + pizza + "Toppings="+ topping;
    }
}
