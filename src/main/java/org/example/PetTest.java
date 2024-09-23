package org.example;

public class PetTest {
    public static void main(String[] args) {
        Dog dog = new Dog("Fido", 3, "Golden Retriever");
        Cat cat = new Cat("Whiskers", 2, "Siamese");

        System.out.println(dog);
        System.out.println(cat);

        dog.speak();
        cat.speak();
    }
}
