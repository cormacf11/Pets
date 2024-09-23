package org.example;

public class Dog extends Pet {
    private String breed;

    public Dog() {
        super();
        this.breed = "";
    }

    private Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
}
