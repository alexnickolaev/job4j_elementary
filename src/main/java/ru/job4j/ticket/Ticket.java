package ru.job4j.ticket;

public class Ticket {

    // Constants for ticket prices
    private static final int FREE_TICKET = 0;
    private static final int SENIOR_TICKET_SUNDAY = 3;
    private static final int SENIOR_TICKET_OTHER = 5;
    private static final int REGULAR_TICKET_MONDAY = 8;
    private static final int REGULAR_TICKET_OTHER = 10;

    // Constants for days of the week
    private static final String MONDAY = "MONDAY";
    private static final String SUNDAY = "SUNDAY";

    public static void main(String[] args) {
        int age = 23;
        String dayOfWeek = "SATURDAY";

        int ticketPrice = calculateTicketPrice(age, dayOfWeek);
        System.out.println("Цена билета составляет: " + ticketPrice);
    }

    private static int calculateTicketPrice(int age, String dayOfWeek) {
        if (age < 6) {
            return FREE_TICKET;
        } else if (age >= 65) {
            return dayOfWeek.equals(SUNDAY) ? SENIOR_TICKET_SUNDAY : SENIOR_TICKET_OTHER;
        } else {
            return dayOfWeek.equals(MONDAY) ? REGULAR_TICKET_MONDAY : REGULAR_TICKET_OTHER;
        }
    }
}