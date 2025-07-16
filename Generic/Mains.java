class MyClass {
    MyClass() {
        System.out.println("Default Constructor");
    }

    // Generic constructor
    <T> MyClass(T value) {
        System.out.println("Generic Constructor called with: " + value);
    }
}

public class Mains {
    public static void main(String[] args) {
        MyClass obj1 = new MyClass();
        MyClass obj2 = new MyClass("Hello");
        MyClass obj3 = new MyClass(100);
    }
}
