import java.util.*;
public class Inventory {

    public class Crust{
        
        public HashMap<String,Integer> stock=null;
    
        public Crust(){
            stock=new HashMap<>();
            initialInventory();
        }

        void initialInventory(){          
            stock.put("New hand tossed",3);
            stock.put("Wheat thin crust",3);
            stock.put("Cheese Burst",3);
            stock.put("Fresh pan pizza",3);
        }
        public void addInventory(String value,int cnt){
           stock.put(value,cnt);
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
    }//crust end

    public class NonVegPizza{
        public HashMap<String,Integer> stock=null;
        
        public NonVegPizza(){
            stock=new HashMap<>();
            initialInventory();
        }

        void initialInventory(){
       
          
            stock.put("Chicken Tikka",3);
            stock.put("Non-veg Supreme",3);
            stock.put("Pepper Barbecue Chicken",3);
        }
        public void addInventory(String value,int cnt){
           stock.put(value,cnt);
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
     }//non-veg pizza end

    public class VegPizza{
        public HashMap<String,Integer> stock=null;
        
        public VegPizza(){
            stock=new HashMap<>();
            initialInventory();
        }

        void initialInventory(){
       
            stock.put("Delux Veggi",0);
            stock.put("Cheese and corn",3);
            stock.put("Paneer Tikka",3);
          
        }
        public void addInventory(String value,int cnt){
           stock.put(value,cnt);
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
     }//Veg pizza ending
 
     public class VegTopping{
        public HashMap<String,Integer> stock=null;
        public VegTopping(){
                stock=new HashMap<>();
                initialInventory();
            }

            void initialInventory(){       
                stock.put("black Olive",3);
                stock.put("Capsicum",3);
                stock.put("Paneer",3);
                stock.put("Mushroom",3);
                stock.put("Fresh tomato",3);
                          
            }

            public void addInventory(String value,int cnt){
                stock.put(value,cnt);
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

    }//veg topings ending

    public class NonVegTopping{
        public HashMap<String,Integer> stock=null;
        public NonVegTopping(){
                stock=new HashMap<>();
                initialInventory();
            }

            void initialInventory(){       
                stock.put("Chicken tikka",3);
                stock.put("Barbeque chicken",3);
                stock.put("Grilled chicken",3);            
            }

            public void addInventory(String value,int cnt){
                stock.put(value,cnt);
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

    }//non-veg topping

    
    public class Sides{
        public HashMap<String,Integer> stock=null;
        public Sides(){
                stock=new HashMap<>();
                initialInventory();
            }
            void initialInventory(){       
                stock.put("Cold Dring",3);
                stock.put("Mouse Cake",3);
            
            }
    }
}
