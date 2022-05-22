//this class is an attempt to auto-create Inventory sub classes in file Inventory.java
/*using generic programming- current code
if owner attempts to add a new Item, the coding is required

attempt- the code below will automatically add menu items and inventory if the new item 
gets added to inventory.
*/
public class Slide {
    public String name;
    public int price;
    
    public Slide(String name,int price){
        this.name=name;
        this.price=price;
    }

    public void setPrice(int price){
        this.price=price;
    }
    public String toString(){
        return " Slide Name = "+name+ ", price = "+price; 
    }
}
