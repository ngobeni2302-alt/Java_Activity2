package com.library;

public class Main {
    public static void main(String[] args){
        Book theLongWalk = new Book("The Hobbt","B101", "J.R.R Tolkien");
        Magazine animalGeo = new Magazine("National Geographic", "M202", 145);

        System.out.println(theLongWalk);
        System.out.println(animalGeo);

        System.out.println();

        theLongWalk.displayDetails();
        animalGeo.displayDetails();

        System.out.println();

        theLongWalk.checkOut();
        animalGeo.checkOut();

        System.out.println();

        theLongWalk.checkOut();
        animalGeo.checkOut();

        System.out.println();

        theLongWalk.returnItem();
        animalGeo.returnItem();
    }



}
