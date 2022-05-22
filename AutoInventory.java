//this class is an attempt to auto-create Inventory sub classes in file Inventory.java
/*using generic programming- current code
if owner attempts to add a new Item, the coding is required

attempt- the code below will automatically add menu items and inventory if the new item 
gets added to inventory.
*/
import java.util.*;
public class AutoInventory {
    public class Item{
        public String itemName; //crust, PIzza, Slide
        public HashMap<String,Integer> stock=null;//keep subitems
    
        public Item(String name){
            itemName=name;
            stock=new HashMap<>();
        }

        public void addInventory(String key,int value){
           stock.put(key,value);
        }
    
        public  boolean getInventory(String key){
            if(stock.get(key)>0)
                return true;
            return false;
        }

        public void setInventory(String key,int value){

            int cnt=stock.get(key);
            stock.replace(key, cnt, cnt+value);
        }
    }//c
}
