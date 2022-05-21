import java.util.Scanner;

public class Menu {
    
    

    public static void main(String[] args){
        //create initial inventory
        Inventory inventory=new Inventory(); // creating inventory object
        Inventory.VegPizza vegPizzaInventory=inventory.new VegPizza();// vegpizza inventory 
        Inventory.NonVegPizza nonVegPizzaInventory=inventory.new NonVegPizza();//nonvegpizza inventory
        Inventory.VegTopping vegToppingInventory=inventory.new VegTopping();//vegtoping inventory;
        Inventory.NonVegTopping nonVegToppingInventory=inventory.new NonVegTopping();//nonVegToppings;
        Inventory.Sides sidesInventory=inventory.new Sides();//sides inventory;
       
        Scanner sc=new Scanner(System.in);
        int ch;
        while(true){
            System.out.println("Welcom to Vikasietum Pizza");
            System.out.println("Select Option 1.VegPizza 2.NonVeg Pizza 2.Sides");
            int number;

            ch=sc.nextInt();
            switch(ch){
                case 1:
                 number =1;
                System.out.println("Veg Pizza options:-");
                for(String item:vegPizzaInventory.stock.keySet()){
                    System.out.println("\t"+number+" "+item);
                    number++;
                }
              
            
                break;
                case 2:
                 number =1;
                System.out.println("Non - Veg Pizza options:-");
                for(String item:nonVegPizzaInventory.stock.keySet()){
                    System.out.println("\t"+number+" "+item);
                    number++;
                } 
                break;
                case 3:
                break;
                default:
                    System.out.println("Invalid Option");

            }
        }
    }
}
