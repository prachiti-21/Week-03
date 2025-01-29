package com.circular_linked_list.online_ticket_reservation;

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
}