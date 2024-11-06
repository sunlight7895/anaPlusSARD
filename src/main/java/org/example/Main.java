package org.example;


public class Main {
    public static void main(String[] args) {

        // new House("선린대로 24가길 6", 0xffffff, new String[]{"은교", "은수"});
        House h = new House("선린대로 24가길 6", 0xffffff,  "은교", "은수");
        Door d = new Door(true);
    }
}