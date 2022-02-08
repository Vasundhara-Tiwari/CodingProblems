package solutions;

class Parent {
    public Parent(){
        System.out.println("p");
    }
}
public class Child extends Parent{
    public Child(String s){
        System.out.println("sub");
    }

    public static void main(String[] args) {
        Child p = new Child("count");
    }
}
