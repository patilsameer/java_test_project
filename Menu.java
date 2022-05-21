import java.util.Scanner;

public class Menu {
    
    public static String getCrust(MenuItems.Crust crust){
        int number=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Curst  options:-"); 
        for(String item:crust.stock.values()){
                System.out.println("\t"+number+" "+item);
                number++;
        }
        int crustChoice;
        String crustName;
    crustChoice=sc.nextInt();
    crustName=crust.stock.get(crustChoice);
    System.out.println("You selected "+crustName);
    return crustName;
    }
    

    public static void main(String[] args){
        //create initial inventory
        Inventory inventory=new Inventory(); // creating inventory object
        Inventory.VegPizza vegPizzaInventory=inventory.new VegPizza();// vegpizza inventory 
        Inventory.NonVegPizza nonVegPizzaInventory=inventory.new NonVegPizza();//nonvegpizza inventory
        Inventory.VegTopping vegToppingInventory=inventory.new VegTopping();//vegtoping inventory;
        Inventory.NonVegTopping nonVegToppingInventory=inventory.new NonVegTopping();//nonVegToppings;
        Inventory.Sides sidesInventory=inventory.new Sides();//sides inventory;
        Inventory.Crust crustInventory=inventory.new Crust();



        // initial Menu
        MenuItems menuItem=new MenuItems(); // creating MenuItem object
        MenuItems.VegPizza vegPizzaMenuItem=menuItem.new VegPizza();// vegpizza MenuItem 
        MenuItems.NonVegPizza nonVegPizzaMenuItem=menuItem.new NonVegPizza();//nonvegpizza MenuItem
        MenuItems.VegTopping vegToppingMenuItem=menuItem.new VegTopping();//vegtoping MenuItem;
        MenuItems.NonVegTopping nonVegMenuItem=menuItem.new NonVegTopping();//nonVegToppings MenuItem;
        MenuItems.Sides sidesMenuItem=menuItem.new Sides();//sides MenuItem;
        MenuItems.Crust crustMenuItem=menuItem.new Crust();//crust MenuItem
       
        Scanner sc=new Scanner(System.in);
        int ch;
        int number;
        
        while(true){
            System.out.println("Welcom to Vikasietum Pizza");
            System.out.println("Select Option 1.VegPizza 2.NonVeg Pizza 2.Sides");
            ch=sc.nextInt(); 
            int pizzaChoice;  
            String pizzaName;
            String crust;    
            switch(ch){
                case 1:
                number =1; 
                System.out.println("Veg Pizza options:-"); 
                    for(String item:vegPizzaMenuItem.stock.values()){
                            System.out.println("\t"+number+" "+item);
                            number++;
                    }
                pizzaChoice=sc.nextInt();
                pizzaName=vegPizzaMenuItem.stock.get(pizzaChoice);
                System.out.println("You selected "+pizzaName);
                crust=getCrust(crustMenuItem);
                break;
                case 2:
                number =1; 
                System.out.println("Veg Pizza options:-"); 
                    for(String item:nonVegPizzaMenuItem.stock.values()){
                            System.out.println("\t"+number+" "+item);
                            number++;
                    }
                    crust=getCrust(crustMenuItem);
                break;
                case 3:
                break;
                default:
                    System.out.println("Invalid Option");

            }
        }
    }
}
