//this class is an attempt to auto-create Menu sub classes in file MenuItems.java
/*using generic programming- current code
if owner attempts to add a new Item, the coding is required

attempt- the code below will automatically add menu items if the new item 
gets added to Menu.
*/
import java.util.*;
public class AutoMenuItems {
        public String itemName;//crust, pizza,slide
        public HashMap<Integer,String> stock=null;//to keep submenu items

    
        public AutoMenuItems(String name){
            itemName=name;
            stock=new HashMap<>();
        }
        public void addMenuItem(int key,String value){
           stock.put(key,value);
        }
}
