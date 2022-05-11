package com.company;

public class parrot {
    private String name;
    private String color;
    private int age;


    void setName(String a) {
        if (a.isEmpty()) {
            System.out.println("Popugaidyn atyn jazbadynyz");
        } else {
            name = a;
        }
    }

    void setcolor(String a) {
        if (a.isEmpty()) {
            System.out.println("Popugaidyn tusun jazbadynyz");
        } else {
            color = a;
        }
    }

    void setAge(int a) {
        if (a < 0) {
            System.out.println("***age ters san bolboshu kerek");
        } else {
            age = a;
        }
    }
    String getName() {
        return name;
    }
    String getColor(){
        return color;
    }
    int getAge(){
        return age;
    }
}
