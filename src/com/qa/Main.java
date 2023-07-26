package com.qa;

import com.qa.model.Cat;
import com.qa.model.Dog;
import com.qa.model.Rabbit;

public class Main {
    public static void main(String[] args) {

        Cat c = new Cat("Whiskers", 10);
        Cat c2 = new Cat("Midas", 8);
        Dog d = new Dog("Spot", 2);
        Rabbit r = new Rabbit("Peter", 2);
        Rabbit r2 = new Rabbit("Cottontail",3);
    }
}