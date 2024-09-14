package ru.itgirl;

public class App {
    public static void main( String[] args ) {
        System.out.println(Days.valueOf(args[0]).getRussianName());
    }
}