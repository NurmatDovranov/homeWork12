package com.company;

public class Main {

    public static void main(String[] args) {
	Fish fish = new Fish();
    fish.setName("Jonny");
    fish.setColor("Blue");
    fish.setAge(12);
    System.out.println("Name of fish: "+fish.getName());
    System.out.println("Color of fish: "+fish.getColor());
    System.out.println("Age of fish: "+fish.getAge());

    parrot parrot = new parrot();
    parrot.setName("Laika");
    parrot.setcolor("Green");
    parrot.setAge(-9);
    System.out.println("Name of parrot: "+parrot.getName());
        System.out.println("Color of parrot: "+parrot.getColor());
        System.out.println("Age of parrot: "+parrot.getAge());

        Cat cat = new Cat();
        cat.setName("Bobby");
        cat.setColor("");
        cat.setAge(8);
        System.out.println("Name of cat: "+cat.getName());
        System.out.println("Color of cat: "+cat.getColor());
        System.out.println("Age of cat: "+cat.getAge());

        Dog dog = new Dog();
        dog.setName("");
        dog.setColor("Black");
        dog.setAge(11);
        System.out.println("Name of dog: "+dog.getName());
        System.out.println("Color of dog: "+dog.getColor());
        System.out.println("Age of dog: "+dog.getAge());
               }


    }

