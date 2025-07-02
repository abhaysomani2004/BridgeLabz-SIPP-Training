package Oops;
// final class Animal{
    
//     public void soundType() {
//         System.out.println("Animal makes sound");
//     }
// }
// we can execute anything before main method using static block
class Animal{
    String color;
    public final void soundType() {
        System.out.println("Animal makes sound");
    }
}
class Dog extends Animal{
    // public void soundType() {
    //     System.out.println("Dog barks");
    // }
}
class Lion extends Animal {

}
public class Product1 {


    static class ProductTpe{

    
    }



    static int a = 10;
    static {
        a = 10;
        System.out.println("This is static variable: " + a);
        System.out.println("This is static block");
    }
    public static void main(String[] args) {
        System.out.println("This is main method");
        Dog obj = new Dog();
        if(obj instanceof Animal) {
            System.out.println("True");
        } 
    }
}

