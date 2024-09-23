package org.example;

public class Dog extends Pet {
    private String breed;

    public Dog() {
        super();
        this.breed = "";
    }

    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void speak() {
        System.out.println("Woof, I am " + this.getName() + " and I am a " + this.getAge() + " year old " + this.breed);
    }
}
