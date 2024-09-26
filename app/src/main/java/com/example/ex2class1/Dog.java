package com.example.ex2class1;

public class Dog extends Animal {

    @Override
    public void makeSound(){
        System.out.println("the dog bark");
    }
    public void move(){
        System.out.println("the dog run");
    }
    public void eat(){
        System.out.println("the dog eat bonzo");
    }
}
