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
