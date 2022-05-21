import java.util.*;
public class MenuItems {
      public class Crust{
        
        public HashMap<Integer,String> stock=null;
    
        public Crust(){
            stock=new HashMap<>();
            menuItems();
        }

        void menuItems(){          
            stock.put(1,"New hand tossed");
            stock.put(2,"Cheese Burst");
            stock.put(3,"Wheat thin crust");
            stock.put(4,"Fresh pan pizza");
        }
        public void addMenuItem(int key,String value){
           stock.put(key,value);
        }
    
    

       
    }//crust end

    public class NonVegPizza{
        public HashMap<Integer,String> stock=null;
        
        public NonVegPizza(){
            stock=new HashMap<>();
            menuItems();
        }

        void menuItems(){          
            stock.put(1,"Chicken Tikka");
            stock.put(2,"Non-veg Supreme");
            stock.put(3,"Pepper Barbecue Chicken");
            
        }
        public void addMenuItem(int key,String value){
            stock.put(key,value);
         }
     
       
     }//non-veg pizza end

    public class VegPizza{
        public HashMap<Integer,String> stock=null;
        
        public VegPizza(){
            stock=new HashMap<>();
            menuItems();
        }
        void menuItems(){          
            stock.put(1,"Delux Veggi");
            stock.put(2,"Cheese and corn");
            stock.put(3,"Paneer Tikka");
            
        }
        public void addMenuItem(int key,String value){
            stock.put(key,value);
         }
     
       
     }//Veg pizza ending
 
     public class VegTopping{
        public HashMap<Integer,String> stock=null;
        public VegTopping(){
                stock=new HashMap<>();
                menuItems();
            }

            void menuItems(){          
                stock.put(1,"black Olive");
                stock.put(2,"Capsicum");
                stock.put(3,"Paneer");
                stock.put(4,"Mushroom");
                 stock.put(5,"Fresh tomato");
                
            }
            public void addMenuItem(int key,String value){
                stock.put(key,value);
             }
            

            

    }//veg topings ending

    public class NonVegTopping{
        public HashMap<Integer,String> stock=null;
        public NonVegTopping(){
                stock=new HashMap<>();
                menuItems();
            }
            void menuItems(){          
                stock.put(1,"Chicken tikka");
                stock.put(2,"Barbeque chicken");
                stock.put(3,"Grilled chicken");
               
                
            }
            public void addMenuItem(int key,String value){
                stock.put(key,value);
             }

    }//non-veg topping

    
    public class Sides{
        public HashMap<Integer,String> stock=null;
        public Sides(){
                stock=new HashMap<>();
                menuItems();
            }
        
            void menuItems(){          
                stock.put(1,"Cold Dring");
                stock.put(2,"Mouse Cake");
                
               
                
            }
            public void addMenuItem(int key,String value){
                stock.put(key,value);
             }
    }
}


