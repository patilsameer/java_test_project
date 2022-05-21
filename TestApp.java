import java.util.Vector;

public class TestApp {

    void initApp(Vector<Pizza> v){
        Pizza obj=new Pizza("name", 1, 1);
        v.add(obj);

    }

    public static void main(String[] args){
        Vector<Pizza> store=new Vector();
        
        new TestApp().initApp(store);


        for (Pizza pizza : store) {
            System.out.println(pizza.toString());
        }
    }
}
