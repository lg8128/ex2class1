package com.example.ex2class1;

public class Fish extends Animal{
    @Override
    public void makeSound(){
        System.out.println("the fish do blue blue");
    }
    public void move(){
        System.out.println("the fish swim");
    }
    public void eat(){
        System.out.println("the fish eat other fish");
    }
}


