import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
import javax.imageio.ImageTranscoder;

public class Menu {
    
    public static String getCrust(MenuItems.Crust crust){
        int number=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Crust  options:-"); 
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
        /*Inventory inventory=new Inventory(); // creating inventory object
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
       */

        //attempt to crate automenut class
        HashMap<Integer,AutoMenuItems> aMTV=new HashMap();
        Scanner sc=new Scanner(System.in);
        int ch;
        int number;
        
        while(true){
            System.out.println("-------------------------------------------");
            System.out.println("Welcom to Vikasietum Pizza");
            System.out.println("-------------------------------------------");
            System.out.println("Select Option\n1 Order"+
                                "\n2.Add New Item"+
                                "\n3.Add SubMenu"+
                                "\n4.Add Inventory"+
                                "\n5.\n");
            ch=sc.nextInt(); 
            int pizzaChoice;  
            String pizzaName;
            String crust;    
            switch(ch){
                case 1:
                if(aMTV.size()==0){
                    System.out.println("No Menu available, please add menu");
                    
                }else{
                System.out.println("You can Order these:-");
                for(int i:aMTV.keySet()){
                    System.out.println("Memu NUmber:-"+i+" "+aMTV.get(i).itemName);
                    
                }// for
                }//else
                System.out.println("Select Menu:-");
                int mm=sc.nextInt();
                System.out.println("\t SubMenu:-");
                    for(int i1:aMTV.get(mm).stock.keySet()){
                        System.out.println("\t\tSubMenuNo:-"+i1+" "+aMTV.get(mm).stock.get(i1).toString());
                    }//
                    System.out.println("Select Sub Menu:-");
                    int sm=sc.nextInt();
                    

                //else
                /* //this code works using Inventory.java & MenuItems.java file
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
                
                */
                //this code uses AutoInventory & AutoMenuItem files either above or this code
                //shall be used.
                break;
                case 2:
                //New code to add MenuItem
                System.out.println("\nHard coded Menu Item VegPizza & NonVegPizza added");
                AutoMenuItems aMT=new AutoMenuItems("VegPizza");
                aMTV.put(aMTV.size(),aMT);
                AutoMenuItems aMT2=new AutoMenuItems("NonVegPizza");
                aMTV.put(aMTV.size(),aMT2);
                //addint New Menu Item
                // we can use user input- current code set using hard values


              /*//this code works using Inventory.java & MenuItems.java file
                number =1; 
                System.out.println("Veg Pizza options:-"); 
                    for(String item:nonVegPizzaMenuItem.stock.values()){
                            System.out.println("\t"+number+" "+item);
                            number++;
                    }
                    crust=getCrust(crustMenuItem);
                break;
                */
                break;
                case 3:
                //New code to add SubMenu
                System.out.println("Select Menu to add sub item:-");
                for(int i:aMTV.keySet()){
                    System.out.println(i+" "+aMTV.get(i).itemName);
                }
                System.out.println("Harde coded to add VeggiPizza please select 0");
                int subchoice=sc.nextInt();
                AutoMenuItems temp=aMTV.get(subchoice);
                temp.stock.put(1,"VeggiPizza");
                //adding inventory
                //we can take input from user- current values are passed using hardset values

                break;
                case 4:
                System.out.println("Work in progress");
                break;
                case 5:
                System.out.println("Work in progress");
                break;
                default:
                    System.out.println("Invalid Option");

            }
        }
    }
}
