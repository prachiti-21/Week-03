package com.doubly_linked_list.movie_management_system;

class Movie {
    String title;
    String director;
    int yearOfRelease;
    double rating;
    Movie next;
    Movie prev;

    public Movie(String title, String director, int yearOfRelease, double rating) {
        this.title = title;
        this.director = director;
        this.yearOfRelease = yearOfRelease;
        this.rating = rating;
        this.next = null;
        this.prev = null;
    }
}

/*class MovieManagementSystem {
    private Movie head;
    private Movie tail;

    public MovieManagementSystem() {
        head = null;
        tail = null;
    }

    // Add movie at the beginning
    public void addMovieAtBeginning(String title, String director, int yearOfRelease, double rating) {
        Movie newMovie = new Movie(title, director, yearOfRelease, rating);
        if (head == null) {
            head = tail = newMovie;
        } else {
            newMovie.next = head;
            head.prev = newMovie;
            head = newMovie;
        }
    }

    // Add movie at the end
    public void addMovieAtEnd(String title, String director, int yearOfRelease, double rating) {
        Movie newMovie = new Movie(title, director, yearOfRelease, rating);
        if (tail == null) {
            head = tail = newMovie;
        } else {
            tail.next = newMovie;
            newMovie.prev = tail;
            tail = newMovie;
        }
    }

    // Add movie at a specific position
    public void addMovieAtPosition(String title, String director, int yearOfRelease, double rating, int position) {
        if (position <= 1) {
            addMovieAtBeginning(title, director, yearOfRelease, rating);
            return;
        }
        Movie newMovie = new Movie(title, director, yearOfRelease, rating);
        Movie temp = head;
        int currentPosition = 1;
        while (temp != null && currentPosition < position - 1) {
            temp = temp.next;
            currentPosition++;
        }
        if (temp == null) {
            addMovieAtEnd(title, director, yearOfRelease, rating);
        } else {
            newMovie.next = temp.next;
            newMovie.prev = temp;
            if (temp.next != null) {
                temp.next.prev = newMovie;
            }
            temp.next = newMovie;
            if (newMovie.next == null) {
                tail = newMovie;
            }
        }
    }

    // Remove movie by title
    public void removeMovieByTitle(String title) {
        Movie temp = head;
        while (temp != null && !temp.title.equals(title)) {
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Movie not found.");
            return;
        }
        if (temp.prev != null) {
            temp.prev.next = temp.next;
        } else {
            head = temp.next;
        }
        if (temp.next != null) {
            temp.next.prev = temp.prev;
        } else {
            tail = temp.prev;
        }
        System.out.println("Movie removed successfully.");
    }

    // Search movie by director or rating
    public void searchMovie(String director, Double rating) {
        Movie temp = head;
        boolean found = false;
        while (temp != null) {
            if ((director != null && temp.director.equals(director)) ||
                    (rating != null && temp.rating == rating)) {
                System.out.println("Title: " + temp.title + ", Director: " + temp.director + ", Year: " + temp.yearOfRelease + ", Rating: " + temp.rating);
                found = true;
            }
            temp = temp.next;
        }
        if (!found) {
            System.out.println("No matching movies found.");
        }
    }

    // Display movies in forward order
    public void displayMoviesForward() {
        Movie temp = head;
        while (temp != null) {
            System.out.println("Title: " + temp.title + ", Director: " + temp.director + ", Year: " + temp.yearOfRelease + ", Rating: " + temp.rating);
            temp = temp.next;
        }
    }

    // Display movies in reverse order
    public void displayMoviesReverse() {
        Movie temp = tail;
        while (temp != null) {
            System.out.println("Title: " + temp.title + ", Director: " + temp.director + ", Year: " + temp.yearOfRelease + ", Rating: " + temp.rating);
            temp = temp.prev;
        }
    }

    // Update movie rating
    public void updateMovieRating(String title, double newRating) {
        Movie temp = head;
        while (temp != null && !temp.title.equals(title)) {
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Movie not found.");
        } else {
            temp.rating = newRating;
            System.out.println("Rating updated successfully.");
        }
    }
}

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
}*/

