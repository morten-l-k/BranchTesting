package com.company;

public class Main {

    public static void main(String[] args) {
      Dog dog = new Dog("Thomas");
      Cat cat = new Cat("Jørgen");

      System.out.println(dog.makeSound());
      System.out.println(cat.makeSound());
    }
}
