package com.doubly_linked_list.movie_management_system;

public class MovieManager {
    public static void main(String[] args) {
        MovieManagementSystem mms = new MovieManagementSystem();

        mms.addMovieAtBeginning("Inception", "Christopher Nolan", 2010, 8.8);
        mms.addMovieAtEnd("The Matrix", "Wachowskis", 1999, 8.7);
        mms.addMovieAtPosition("Interstellar", "Christopher Nolan", 2014, 9.0, 2);

        System.out.println("Movies in forward order:");
        mms.displayMoviesForward();

        System.out.println("\nMovies in reverse order:");
        mms.displayMoviesReverse();

        System.out.println("\nSearching for movies directed by Christopher Nolan:");
        mms.searchMovie("Christopher Nolan", null);

        System.out.println("\nUpdating rating for 'Inception':");
        mms.updateMovieRating("Inception", 9.0);
        mms.displayMoviesForward();

        System.out.println("\nRemoving 'The Matrix':");
        mms.removeMovieByTitle("The Matrix");
        mms.displayMoviesForward();
    }
}
