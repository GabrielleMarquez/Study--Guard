package quarter2.practicalexam;

import java.util.Scanner;

public class CinimaTicketingMenu {

    private static final int MIN_AGE = 18;
    private static final int ROWS = 5;   // A-E
    private static final int COLS = 8;   // 1-8

    private static final String[] THEATRES = {"2D", "3D", "Premium", "VIP"};
    private static final double[] THEATRE_PRICES = {250.00, 320.00, 400.00, 550.00};

    private static final String[] MOVIES = {"Space Odyssey", "Haunted Manor", "Laugh Riot"};

    private static final String[] SNACKS = {"Popcorn", "Nachos", "Hotdog", "Soda", "Water"};
    private static final double[] SNACK_PRICES = {120.00, 110.00, 90.00, 60.00, 40.00};

    // One seat map per theatre type; true = taken
    private final boolean[][][] seats = new boolean[THEATRES.length][ROWS][COLS];

    private int ticketsSold = 0;
    private double ticketSales = 0.0;
    private double snackSales = 0.0;

    // Dependency Injection: the Scanner is passed in, never created here.
    public void start(Scanner scanner) {
        boolean running = true;

        while (running && scanner.hasNextLine()) {
            printMenu();
            int choice = readChoice(scanner, 1, 3);

            if (choice == 1) {
                buyTicket(scanner);
            } else if (choice == 2) {
                snackAndGo(scanner);
            } else if (choice == 3) {
                running = false;
                System.out.println("Thank you for visiting! Goodbye.");
            } else {
                System.out.println("Invalid choice. Try again.");
            }
        }
        printSummary();
    }

    private void printMenu() {
        System.out.println("\n===== CINEMA MENU =====");
        System.out.println("1. Buy Ticket");
        System.out.println("2. Snack & Go (Snack Bar)");
        System.out.println("3. Exit");
        System.out.print("Choose an option: ");
    }

    // ---------- TICKET FLOW: age -> theatre -> movie -> seat ----------
    private void buyTicket(Scanner scanner) {
        System.out.print("Enter your age: ");
        int age = readChoice(scanner, 0, 120);
        if (age < 0) {
            System.out.println("Invalid age. Ticket purchase cancelled.");
            return;
        }
        if (age < MIN_AGE) {
            System.out.println("Access Denied: You must be 18 or older.");
            return;
        }

        int theatre = selectTheatre(scanner);
        if (theatre < 0) return;

        int movie = selectMovie(scanner);
        if (movie < 0) return;

        String seat = selectSeat(scanner, theatre);
        if (seat == null) return;

        ticketsSold++;
        ticketSales += THEATRE_PRICES[theatre];
        System.out.println("\n*** TICKET PRINTED ***");
        System.out.println("Movie:   " + MOVIES[movie]);
        System.out.println("Theatre: " + THEATRES[theatre]);
        System.out.println("Seat:    " + seat);
        System.out.println("Price:   PHP " + THEATRE_PRICES[theatre]);
    }

    private int selectTheatre(Scanner scanner) {
        System.out.println("\n-- Theatre Selection --");
        for (int i = 0; i < THEATRES.length; i++) {
            System.out.println((i + 1) + ". " + THEATRES[i] + " - PHP " + THEATRE_PRICES[i]);
        }
        System.out.print("Choose theatre: ");
        int c = readChoice(scanner, 1, THEATRES.length);
        if (c < 0) {
            System.out.println("Invalid theatre. Purchase cancelled.");
            return -1;
        }
        return c - 1;
    }

    private int selectMovie(Scanner scanner) {
        System.out.println("\n-- Movie Selection --");
        for (int i = 0; i < MOVIES.length; i++) {
            System.out.println((i + 1) + ". " + MOVIES[i]);
        }
        System.out.print("Choose movie: ");
        int c = readChoice(scanner, 1, MOVIES.length);
        if (c < 0) {
            System.out.println("Invalid movie. Purchase cancelled.");
            return -1;
        }
        return c - 1;
    }

    private String selectSeat(Scanner scanner, int theatre) {
        printSeatMap(theatre);
        System.out.print("Enter seat (e.g. A3): ");
        // Text read after nextInt: buffer was already cleared in readChoice()
        if (!scanner.hasNextLine()) {
            System.out.println("No seat entered. Purchase cancelled.");
            return null;
        }
        String input = scanner.nextLine().trim().toUpperCase();

        if (input.length() < 2) {
            System.out.println("Invalid seat. Purchase cancelled.");
            return null;
        }
        int row = input.charAt(0) - 'A';
        int col;
        try {
            col = Integer.parseInt(input.substring(1)) - 1;
        } catch (NumberFormatException e) {
            System.out.println("Invalid seat. Purchase cancelled.");
            return null;
        }
        if (row < 0 || row >= ROWS || col < 0 || col >= COLS) {
            System.out.println("Seat does not exist. Purchase cancelled.");
            return null;
        }
        if (seats[theatre][row][col]) {
            System.out.println("Seat already taken. Purchase cancelled.");
            return null;
        }
        seats[theatre][row][col] = true;
        return input;
    }

    private void printSeatMap(int theatre) {
        System.out.println("\n-- Seat Selection (" + THEATRES[theatre] + ") [X = taken] --");
        System.out.print("   ");
        for (int c = 1; c <= COLS; c++) System.out.print(c + " ");
        System.out.println();
        for (int r = 0; r < ROWS; r++) {
            System.out.print((char) ('A' + r) + "  ");
            for (int c = 0; c < COLS; c++) {
                System.out.print((seats[theatre][r][c] ? "X" : "O") + " ");
            }
            System.out.println();
        }
    }

    // ---------- SNACK & GO ----------
    private void snackAndGo(Scanner scanner) {
        double orderTotal = 0.0;
        boolean ordering = true;

        while (ordering) {
            System.out.println("\n-- Snack Bar --");
            for (int i = 0; i < SNACKS.length; i++) {
                System.out.println((i + 1) + ". " + SNACKS[i] + " - PHP " + SNACK_PRICES[i]);
            }
            System.out.println("0. Done");
            System.out.print("Choose item: ");
            int item = readChoice(scanner, 0, SNACKS.length);

            if (item < 0) {
                System.out.println("Invalid item or no more input. Closing order.");
                break;
            }
            if (item == 0) {
                ordering = false;
            } else {
                System.out.print("Quantity: ");
                int qty = readChoice(scanner, 1, 20);
                if (qty < 0) {
                    System.out.println("Invalid quantity. Closing order.");
                    break;
                }
                double line = SNACK_PRICES[item - 1] * qty;
                orderTotal += line;
                System.out.println("Added " + qty + " x " + SNACKS[item - 1] + " = PHP " + line);
            }
        }
        snackSales += orderTotal;
        System.out.println("Snack order total: PHP " + orderTotal + ". Enjoy the show!");
    }

    // ---------- HELPERS ----------
    // Reads an int in [min, max] and clears the leftover Enter (String & Integer Trap).
    // Returns -1 on bad or missing input, so the test can never crash it.
    private int readChoice(Scanner scanner, int min, int max) {
        if (!scanner.hasNextInt()) {
            if (scanner.hasNextLine()) scanner.nextLine();
            return -1;
        }
        int value = scanner.nextInt();
        if (scanner.hasNextLine()) scanner.nextLine();
        return (value >= min && value <= max) ? value : -1;
    }

    private void printSummary() {
        System.out.println("\n--- SUMMARY ---");
        System.out.println("Tickets sold: " + ticketsSold);
        System.out.println("Ticket sales: PHP " + ticketSales);
        System.out.println("Snack sales:  PHP " + snackSales);
        System.out.println("Total sales:  PHP " + (ticketSales + snackSales));
    }
}