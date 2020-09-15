package com.company;

public class Main {

    public static void main(String[] args) {
        DalmatianDog dalmatianDog = new DalmatianDog("Джек", 5, "мальчик");
        GermanShepherdDog germanShepherdDog = new GermanShepherdDog("Боня", 8, "девочка");
        dalmatianDog.tell();
        dalmatianDog.walkToDog();
        germanShepherdDog.tell();
        germanShepherdDog.walkToDog();

    }
}
