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

  public void showMood(boolean moodType){
    if (moodType == true){
      System.out.println("Cat 'spinder'");
    } else {
      System.out.println("Cat 'hvæser'");
    }
  }
}
