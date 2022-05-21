import java.nio.channels.CancelledKeyException;
import java.util.Vector;

public class TestApp {

    void initPizza(Vector<Pizza> v){

        Pizza obj1=new Pizza("Delux Veggi", 1, 150,true, "New hand toasted");
        Pizza obj2=new Pizza("Delux Veggi", 2, 200, true,"wheat thin crust");
        Pizza obj3=new Pizza("Non-veg Supreme", 1, 150,false, "New hand toasted");
        Pizza obj4=new Pizza("Delux Veggi", 2, 200, false,"wheat thin crust");
        
        
        v.add(obj1);
        v.add(obj2);
        v.add(obj3);
        v.add(obj4);

    }

    void initToppings(Vector<Toppings> store){
            Toppings obj1=new Toppings("black Olive",
             20, true);
            Toppings obj2=new Toppings("Capsicum", 35, false);
            store.add(obj1);
            store.add(obj2);
    }

    void initSlides(Vector<Slide> store){
        Slide obj1=new Slide("Cold Dring", 55);
        Slide obj2=new Slide("Mouse Cake", 90);
        store.add(obj1);
        store.add(obj2);
    }

    public static void main(String[] args){
        //create inventory
        Inventory inventory=new Inventory();
        inventory.stock.put("Delux Veggi",2);
        inventory.stock.put("Non-veg Supreme",3);
        inventory.stock.put("black Olive",3);
        inventory.stock.put("Capsicum",3);
        inventory.stock.put("Cold Dring",3);
        inventory.stock.put("Mouse Cake",3);
        
        

        // initilize all data of pizzafactory
        Vector<Pizza> pizzaStore=new Vector<>();
        Vector<Toppings> toppingStore=new Vector<>();
        Vector<Slide> slideStore=new Vector<>();
        Vector<OrderItem> orderItems=new Vector<>();
        new TestApp().initPizza(pizzaStore);
        new TestApp().initToppings(toppingStore);
        new TestApp().initSlides(slideStore);

        
        for (Pizza pizza : pizzaStore) {
            System.out.println(pizza.toString());
        }

        for (Toppings topping : toppingStore) {
            System.out.println(topping.toString());
        }
        
        for(Slide slide: slideStore){
            System.out.print(slide.toString());
        }
        boolean result=BusineesRules.pizzaTest(pizzaStore.firstElement(), toppingStore.firstElement());
        Slide slideItem=slideStore.elementAt(0);
        PizzaServe pizzaServe1=new PizzaServe(pizzaStore.firstElement(), toppingStore.firstElement());
        OrderItem order=new OrderItem();
        order.pizzaServes.add(pizzaServe1);
        order.slide.add(slideItem);
        orderItems.add(order);
        System.out.println("\n");
        System.out.println("Your order details are as below:-");
        for(OrderItem o: orderItems){
        
            System.out.println(o.pizzaServes.toString());
            System.out.println(o.slide.toString());
        }

        
        if(result){

            System.out.println("Confirm order with -\n");
            System.out.println(pizzaStore.firstElement().toString());
            System.out.println(toppingStore.firstElement().toString());
        }
    }
}
