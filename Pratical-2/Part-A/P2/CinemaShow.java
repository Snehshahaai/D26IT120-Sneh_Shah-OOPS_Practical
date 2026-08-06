class CinemaShow {

    // Private variables
    private String title;
    private int seatsAvailable;
    private final int capacity;

    // Static variable
    private static int totalBooked = 0;

    // Constructor with title and capacity
    public CinemaShow(String title, int capacity) {
        this.title = title;
        this.capacity = capacity;
        this.seatsAvailable = capacity;
    }

    // Constructor with only title
    public CinemaShow(String title) {
        this(title, 100);
    }

    // Book seats
    public boolean book(int n) {
        if (n <= seatsAvailable) {
            seatsAvailable -= n;
            totalBooked += n;
            return true;
        }
        return false;
    }

    // Cancel seats
    public void cancel(int n) {
        seatsAvailable += n;

        if (seatsAvailable > capacity) {
            seatsAvailable = capacity;
        }
    }

    // Getter
    public int getSeatsAvailable() {
        return seatsAvailable;
    }

    // Static Getter
    public static int getTotalBooked() {
        return totalBooked;
    }

    // Main Method
    public static void main(String[] args) {

        CinemaShow show = new CinemaShow("Avengers", 50);

        System.out.println("Book 20: " + show.book(20));
        System.out.println("Seats Available: " + show.getSeatsAvailable());

        System.out.println("Book 15: " + show.book(15));
        System.out.println("Seats Available: " + show.getSeatsAvailable());

        System.out.println("Cancel 10");
        show.cancel(10);
        System.out.println("Seats Available: " + show.getSeatsAvailable());

        System.out.println("Book 40: " + show.book(40));
        System.out.println("Seats Available: " + show.getSeatsAvailable());

        System.out.println("Book 25: " + show.book(25));
        System.out.println("Seats Available: " + show.getSeatsAvailable());

        System.out.println("Total Booked: " + CinemaShow.getTotalBooked());
    }
}