package com.doubly_linked_list.library_management_system;

public class Library {
    public static void main(String[] args) {
        LibraryManagementSystem lms = new LibraryManagementSystem();

        lms.addBookAtBeginning("1984", "George Orwell", "Dystopian", 1, true);
        lms.addBookAtEnd("To Kill a Mockingbird", "Harper Lee", "Fiction", 2, true);
        lms.addBookAtPosition("The Great Gatsby", "F. Scott Fitzgerald", "Classic", 3, true, 2);

        System.out.println("Books in forward order:");
        lms.displayBooksForward();

        System.out.println("\nBooks in reverse order:");
        lms.displayBooksReverse();

        System.out.println("\nSearching for books by George Orwell:");
        lms.searchBook(null, "George Orwell");

        System.out.println("\nUpdating availability of book with ID 1:");
        lms.updateBookAvailability(1, false);
        lms.displayBooksForward();

        System.out.println("\nRemoving book with ID 2:");
        lms.removeBookById(2);
        lms.displayBooksForward();

        System.out.println("\nTotal number of books: " + lms.countTotalBooks());
    }
}
