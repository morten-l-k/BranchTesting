package com.company;

public class Cat extends Animal {

  public Cat(String name){
    super(name);
  }

  public void makeSound(){
    System.out.println("Miav");
  }

  public boolean eatFood(String foodType) {
    return true;
  }
}
