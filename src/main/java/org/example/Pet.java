package org.example;

public class Pet {
    private String name;
    private int age;

    public Pet() {
        this.name = "";
        this.age = 0;
    }

    public Pet(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int newAge) {
        this.age = newAge;
    }

    public String toString() {
        return this.name + " is " + this.age + " years old.";
    }
}
