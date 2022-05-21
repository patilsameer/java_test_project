public class Pizza{
    public String name;
    public int size;
    public int price;

    public Pizza(String name,int size,int price){
        this.name=name;
        this.size=size;
        this.price=price;
    }

    public String toString(){
        return name + " " + size + " " + price;
    }
}