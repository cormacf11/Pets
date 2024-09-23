package org.example;

public class Cat extends Pet {
    private String breed;

    public Cat() {
        super();
        this.breed = "";
    }

    private Cat(String name, int age, String breed) {
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
