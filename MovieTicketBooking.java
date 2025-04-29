import java.util.Scanner;
public class MovieTicketBooking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Movie options
        String[] movies = {"1. The Adventure", "2. Comedy Nights", "3. Action Blast",”4.Salaar.”,”5.OG”};
        System.out.println("Available Movies:");
        for (String movie : movies) {
            System.out.println(movie);
        }
        // Select movie
        System.out.print("Enter the number of the movie you want to watch: ");
        int movieChoice = scanner.nextInt();
        // Seat selection
        System.out.print("Enter the number of tickets you want to book: ");
        int tickets = scanner.nextInt();

        // Confirmation
        System.out.println("Booking Details:");
        System.out.println("Movie: " + movies[movieChoice - 1]);
        System.out.println("Number of Tickets: " + tickets);
        System.out.println("Enjoy the show!");
        scanner.close();
    }
}
