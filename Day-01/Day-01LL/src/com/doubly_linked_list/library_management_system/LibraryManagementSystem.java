package com.doubly_linked_list.library_management_system;

class LibraryManagementSystem {
    private Book head;
    private Book tail;
    private int totalBooks;

    public LibraryManagementSystem() {
        head = null;
        tail = null;
        totalBooks = 0;
    }

    // Add a book at the beginning
    public void addBookAtBeginning(String title, String author, String genre, int bookId, boolean isAvailable) {
        Book newBook = new Book(title, author, genre, bookId, isAvailable);
        if (head == null) {
            head = tail = newBook;
        } else {
            newBook.next = head;
            head.prev = newBook;
            head = newBook;
        }
        totalBooks++;
    }

    // Add a book at the end
    public void addBookAtEnd(String title, String author, String genre, int bookId, boolean isAvailable) {
        Book newBook = new Book(title, author, genre, bookId, isAvailable);
        if (tail == null) {
            head = tail = newBook;
        } else {
            tail.next = newBook;
            newBook.prev = tail;
            tail = newBook;
        }
        totalBooks++;
    }

    // Add a book at a specific position
    public void addBookAtPosition(String title, String author, String genre, int bookId, boolean isAvailable, int position) {
        if (position <= 1) {
            addBookAtBeginning(title, author, genre, bookId, isAvailable);
            return;
        }
        Book newBook = new Book(title, author, genre, bookId, isAvailable);
        Book temp = head;
        int currentPosition = 1;
        while (temp != null && currentPosition < position - 1) {
            temp = temp.next;
            currentPosition++;
        }
        if (temp == null) {
            addBookAtEnd(title, author, genre, bookId, isAvailable);
        } else {
            newBook.next = temp.next;
            newBook.prev = temp;
            if (temp.next != null) {
                temp.next.prev = newBook;
            }
            temp.next = newBook;
            if (newBook.next == null) {
                tail = newBook;
            }
        }
        totalBooks++;
    }

    // Remove a book by Book ID
    public void removeBookById(int bookId) {
        Book temp = head;
        while (temp != null && temp.bookId != bookId) {
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Book not found.");
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
        totalBooks--;
        System.out.println("Book removed successfully.");
    }

    // Search for a book by Title or Author
    public void searchBook(String title, String author) {
        Book temp = head;
        boolean found = false;
        while (temp != null) {
            if ((title != null && temp.title.equalsIgnoreCase(title)) ||
                    (author != null && temp.author.equalsIgnoreCase(author))) {
                System.out.println("Title: " + temp.title + ", Author: " + temp.author + ", Genre: " + temp.genre + ", ID: " + temp.bookId + ", Available: " + temp.isAvailable);
                found = true;
            }
            temp = temp.next;
        }
        if (!found) {
            System.out.println("No matching books found.");
        }
    }

    // Update a book's Availability Status
    public void updateBookAvailability(int bookId, boolean isAvailable) {
        Book temp = head;
        while (temp != null && temp.bookId != bookId) {
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Book not found.");
        } else {
            temp.isAvailable = isAvailable;
            System.out.println("Availability status updated successfully.");
        }
    }

    // Display all books in forward order
    public void displayBooksForward() {
        Book temp = head;
        while (temp != null) {
            System.out.println("Title: " + temp.title + ", Author: " + temp.author + ", Genre: " + temp.genre + ", ID: " + temp.bookId + ", Available: " + temp.isAvailable);
            temp = temp.next;
        }
    }

    // Display all books in reverse order
    public void displayBooksReverse() {
        Book temp = tail;
        while (temp != null) {
            System.out.println("Title: " + temp.title + ", Author: " + temp.author + ", Genre: " + temp.genre + ", ID: " + temp.bookId + ", Available: " + temp.isAvailable);
            temp = temp.prev;
        }
    }

    // Count the total number of books
    public int countTotalBooks() {
        return totalBooks;
    }
}
