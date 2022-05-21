import java.util.Scanner;

public class Menu {
    
    

    public static void main(String[] args){
        Inventory inventory=new Inventory();
        Scanner sc=new Scanner(System.in);
        int ch;
        while(true){
            System.out.println("Welcom to Vikasietum Pizza");

         
            
            ch=sc.nextInt();
            switch(ch){
                case 1:
                    System.out.println("Veg Options :-");
                    System.out.println("Cheese and corn");
                    System.out.println("Paneer Tikka");
                    System.out.println("Delux Veggi");
                    System.out.println("Delux Veggi");
                    
                break;
                case 2:
                break;
                case 3:
                break;
                default:
                    System.out.println("Invalid Option");

            }
        }
    }
}
