package com.circular_linked_list.online_ticket_reservation;

class Ticket {
    int ticketId;
    String customerName;
    String movieName;
    int seatNumber;
    String bookingTime;
    Ticket next;

    public Ticket(int ticketId, String customerName, String movieName, int seatNumber, String bookingTime) {
        this.ticketId = ticketId;
        this.customerName = customerName;
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.bookingTime = bookingTime;
        this.next = null;
    }
}

/*class TicketReservationSystem {
    private Ticket head;

    public TicketReservationSystem() {
        head = null;
    }

    // Add a new ticket reservation at the end of the circular list
    public void addTicket(int ticketId, String customerName, String movieName, int seatNumber, String bookingTime) {
        Ticket newTicket = new Ticket(ticketId, customerName, movieName, seatNumber, bookingTime);
        if (head == null) {
            head = newTicket;
            head.next = head;
        } else {
            Ticket temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = newTicket;
            newTicket.next = head;
        }
    }

    // Remove a ticket by Ticket ID
    public void removeTicketById(int ticketId) {
        if (head == null) {
            System.out.println("No tickets available to remove.");
            return;
        }
        Ticket temp = head;
        Ticket prev = null;
        do {
            if (temp.ticketId == ticketId) {
                if (prev != null) {
                    prev.next = temp.next;
                    if (temp == head) {
                        head = temp.next;
                    }
                } else {
                    Ticket last = head;
                    while (last.next != head) {
                        last = last.next;
                    }
                    head = head.next;
                    last.next = head;
                }
                System.out.println("Ticket removed: ID=" + ticketId);
                return;
            }
            prev = temp;
            temp = temp.next;
        } while (temp != head);
        System.out.println("Ticket not found: ID=" + ticketId);
    }

    // Display all tickets in the list
    public void displayTickets() {
        if (head == null) {
            System.out.println("No tickets available.");
            return;
        }
        Ticket temp = head;
        System.out.println("Current Tickets:");
        do {
            System.out.println("Ticket ID: " + temp.ticketId + ", Customer Name: " + temp.customerName + ", Movie Name: " + temp.movieName + ", Seat Number: " + temp.seatNumber + ", Booking Time: " + temp.bookingTime);
            temp = temp.next;
        } while (temp != head);
    }

    // Search for a ticket by Customer Name or Movie Name
    public void searchTicket(String query) {
        if (head == null) {
            System.out.println("No tickets available to search.");
            return;
        }
        Ticket temp = head;
        boolean found = false;
        do {
            if (temp.customerName.equalsIgnoreCase(query) || temp.movieName.equalsIgnoreCase(query)) {
                System.out.println("Found Ticket: ID=" + temp.ticketId + ", Customer Name: " + temp.customerName + ", Movie Name: " + temp.movieName + ", Seat Number: " + temp.seatNumber + ", Booking Time: " + temp.bookingTime);
                found = true;
            }
            temp = temp.next;
        } while (temp != head);
        if (!found) {
            System.out.println("No tickets found for the query: " + query);
        }
    }

    // Calculate the total number of booked tickets
    public int countTickets() {
        if (head == null) {
            return 0;
        }
        int count = 0;
        Ticket temp = head;
        do {
            count++;
            temp = temp.next;
        } while (temp != head);
        return count;
    }
}

public class Main {
    public static void main(String[] args) {
        TicketReservationSystem system = new TicketReservationSystem();

        system.addTicket(1, "Alice", "Inception", 10, "10:00 AM");
        system.addTicket(2, "Bob", "Interstellar", 15, "11:00 AM");
        system.addTicket(3, "Charlie", "Tenet", 20, "12:00 PM");

        System.out.println("Initial Tickets:");
        system.displayTickets();

        System.out.println("Searching for tickets with query 'Inception':");
        system.searchTicket("Inception");

        System.out.println("Total booked tickets: " + system.countTickets());

        System.out.println("Removing ticket with ID 2:");
        system.removeTicketById(2);

        System.out.println("Tickets after removal:");
        system.displayTickets();

        System.out.println("Total booked tickets: " + system.countTickets());
    }
}*/

