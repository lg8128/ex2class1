package com.example.ex2class1;

public class Cat extends Animal {
    @Override
    public void makeSound(){
        System.out.println("the cat howls");
    }
    public void move(){
        System.out.println("the cat sleep");
    }
    public void eat(){
        System.out.println("the cat drink milk");
    }
}

}
