package com.example.ex2class1;

public class Bird extends Animal {
    @Override
    public void makeSound(){
        System.out.println("the bird tweets");
    }
    public void move(){
        System.out.println("the bird fly");
    }
    public void eat(){
        System.out.println("the bird eat kernels");
    }
}

}
