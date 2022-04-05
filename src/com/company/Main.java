package com.company;

public class Main {

    public static void main(String[] args) {
      Dog dog = new Dog("Thomas");
      Cat cat = new Cat("Jørgen");

      dog.makeSound();
      cat.makeSound();

      dog.eatFood("Grain");
      cat.eatFood("Fish");

      dog.showMood(false);
      cat.showMood(true);
    }
}
