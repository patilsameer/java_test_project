public class Pizza{
    public String name;
    public int size;
    public int price;
    public boolean veg;
    public String crust; 

    public Pizza(String name,int size,int price,boolean veg,String crust){
        this.name=name;
        this.size=size;
        this.price=price;
        this.veg=veg;
        this.crust=crust;
    }

    public void setPrice(int price){
        this.price=price;

    }
    public String toString(){
        return " Name = "+ name + ", Size = " + size + ", price = " + price + ", veg = " + veg + ", Crust = " + crust;
    }
}