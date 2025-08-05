/* 
   🔥 OOP Project: Food Delivery System (Task 3)

   Goal: Demonstrate inheritance, polymorphism, and ArrayList in Java.
   - 'food' is a base class containing common properties (name + price).
   - Burger, Pizza, Coffee are child classes extending 'food'.
   - In main(), we use ArrayList<food> to store different food objects
     using polymorphism and display them dynamically.

   Concepts Used:
   ✔ Inheritance      ✔ Constructor Chaining (super)
   ✔ Polymorphism     ✔ ArrayList
*/
import java.util.ArrayList;
class food {
    String item;
    double price;

    food(String item,double price){
        this.item=item;
        this.price=price;
    }
    void display(){
        System.out.printf("%s -- %.2f Taka.\n",item,price);
    }
}
class Burger extends food{
    Burger(String item, double price){
        super(item,price);
    }
}
class pizza extends food{
    pizza(String item,double price){
        super(item,price);
    }
}
class Coffee extends food{
    Coffee(String item,double price){
        super(item,price);
    }
}


public class FoodItem {
    public static void main(String[] args) {

        ArrayList<food>manu = new ArrayList<>();
        manu.add(new Burger("burger",230));
        manu.add(new pizza("Pizza", 1100));
        manu.add(new Coffee("Coffee", 300));

        for (food f : manu) {
            f.display();
        }

    }
}
