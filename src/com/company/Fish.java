package com.company;

public class Fish {
        private String name;
        private String color;
        private int age;


        void setName(String a) {
            if (a.isEmpty()) {
                System.out.println("Balyktyn atyn jazbadynyz");
            } else {
                name = a;
            }
        }

        void setColor(String a) {
            if (a.isEmpty()) {
                System.out.println("Balyktyn tusun jazbadynyz");
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


