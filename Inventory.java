import java.util.*;
public class Inventory {
    public HashMap<String,Integer> stock=null;
    public Inventory(){
        stock=new HashMap<>();
        initialInventory();
    }

     void initialInventory(){
       
        stock.put("Delux Veggi",2);
        stock.put("Cheese and corn",3);
        stock.put("Paneer Tikka",3);
        stock.put("Chicken Tikka",3);
        stock.put("Non-veg Supreme",3);
        stock.put("Pepper Barbecue Chicken",3);
        
        stock.put("black Olive",3);
        stock.put("Capsicum",3);
        stock.put("Paneer",3);
        stock.put("Mushroom",3);
        stock.put("Fresh tomato",3);
        stock.put("Chicken tikka",3);
        stock.put("Barbeque chicken",3);
        stock.put("Grilled chicken",3);


        stock.put("Cold Dring",3);
        stock.put("Mouse Cake",3);
        
    }

    boolean getInventory(String key){
        if(stock.get(key)>0)
             return true;
        return false;
    }

    void setInventory(String key,int value){

        int cnt=stock.get(key);
        stock.replace(key, cnt, cnt+value);
    }
}
