package com.softserve.homework2;

public class Dog {
    private String name;
    private String breed;
    private int age;

    public Dog(String jik, String americanGang, int i) {
    }

    public enum breed {
        AustralianTerrier, AmericanGang, RoughFoxTerrier, IrishWolfhound
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
