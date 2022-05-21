public class Toppings {
    public String name;
    public int price;
    public boolean veg;

    public Toppings(String name,int price,boolean veg){
        this.name=name;
        this.price=price;
        this.veg=veg;
    }

    public void setPrice(int price){
        this.price=price;

    }
    public String toString(){
        return " Topping Name = "+name+ ", price = "+price+", veg = " + veg; 
    }
}
