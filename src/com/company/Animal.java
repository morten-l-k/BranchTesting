package com.company;

public abstract class Animal {
  private String name;

  public Animal(String name) {
    this.name = name;
  }

  public abstract void makeSound();

  public abstract boolean eatFood(String foodType);

}
