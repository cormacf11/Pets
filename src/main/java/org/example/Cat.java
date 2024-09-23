package org.example;

public class Cat extends Pet {
    private String breed;

    public Cat() {
        super();
        this.breed = "";
    }

    public Cat(String name, int age, String breed) {
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
        System.out.println("Meow, I am " + this.getName() + " and I am a " + this.getAge() + " year old " + this.breed);
    }
}
