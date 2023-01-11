package movies;

import java.util.Scanner;

public class MoviesApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to my Movie List Application!  What would you like to do?\n");
        System.out.println("0 - exit");
        System.out.println("1 - view all movies");
        System.out.println("2 - view movies in the animated category");
        System.out.println("3 - view movies in the drama category");
        System.out.println("4 - view movies in the horror category");
        System.out.println("5 - view movies in the scifi category");
        System.out.println("6 - view movies in the comedy category");
        System.out.println("7 - view movies in the musical category");
        System.out.println("8 - add a movie to the list");
        int userInput = scanner.nextInt();
        if (userInput == 0) {
            System.out.println("Goodbye!");
        } else if (userInput == 1) {
            for (Movie movie : MoviesArray.findAll()) {
                System.out.println(movie.getName() + " -- " + movie.getCategory());
            }
        } else if (userInput == 2) {
            for (Movie movie : MoviesArray.findAll()) {
                if (movie.getCategory().equals("animated")) {
                    System.out.println(movie.getName() + " -- " + movie.getCategory());
                }
            }
        } else if (userInput == 3) {
            for (Movie movie : MoviesArray.findAll()) {
                if (movie.getCategory().equals("drama")) {
                    System.out.println(movie.getName() + " -- " + movie.getCategory());
                }
            }
        } else if (userInput == 4) {
            for (Movie movie : MoviesArray.findAll()) {
                if (movie.getCategory().equals("horror")) {
                    System.out.println(movie.getName() + " -- " + movie.getCategory());
                }
            }
        } else if (userInput == 5) {
            for (Movie movie : MoviesArray.findAll()) {
                if (movie.getCategory().equals("scifi")) {
                    System.out.println(movie.getName() + " -- " + movie.getCategory());
                }
            }
        } else if (userInput == 6) {
            for (Movie movie : MoviesArray.findAll()) {
                if (movie.getCategory().equals("comedy")) {
                    System.out.println(movie.getName() + " -- " + movie.getCategory());
                }
            }
        } else if (userInput == 7) {
            for (Movie movie : MoviesArray.findAll()) {
                if (movie.getCategory().equals("musical")) {
                    System.out.println(movie.getName() + " -- " + movie.getCategory());
                }
            }
        } else if (userInput == 8) {
            System.out.println("Enter the name of the movie you would like to add:");
            String movieName = scanner.next();
            System.out.println("Enter the category of the movie you would like to add:");
            String movieCategory = scanner.next();
            Movie newMovie = new Movie(movieName, movieCategory);
        }
    }
}