public class Toppings {
    public String name;
    public int price;
    public boolean veg;

    public Toppings(String name,int price,boolean veg){
        this.name=name;
        this.price=price;
        this.veg=veg;
    }

    public String toString(){
        return " Topping Name = "+name+ ", price = "+price+", veg = " + veg; 
    }
}
