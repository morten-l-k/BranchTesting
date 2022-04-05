package com.company;

public class Dog extends Animal {
  public Dog(String name){
    super(name);
  }

  public void makeSound(){
    System.out.println("Vuf");
  }

  public boolean eatFood(String foodType){
    return true;
  }

  public void showMood(boolean moodType){
    if (moodType == true){
      System.out.println("Dog 'logrer'");
    } else {
      System.out.println("Dog 'knurrer'");
    }
  }
}
