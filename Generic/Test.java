class Animal {
    void speak() {
        System.out.println("Animal speaks");
    }
}

class Dog extends Animal {
    void speak() {
        System.out.println("Dog barks");
    }
}

class Container<T extends Animal> {
    T animal;

    Container(T animal) {
        this.animal = animal;
    }

    void makeSound() {
        animal.speak();
    }
}

public class Test {
    public static void main(String[] args) {
        Container<Dog> dogContainer = new Container<>(new Dog());
        dogContainer.makeSound(); // Output: Dog barks
    }
}
