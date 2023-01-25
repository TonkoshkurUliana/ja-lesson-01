import java.util.Scanner;

public class Main {
    static void menu(){
        System.out.println("Enter 1 to add session");
        System.out.println("Enter 2 to remove the session");
        System.out.println("Enter 3 to remove the movie");
        System.out.println("Enter 4 to display all movies");
        System.out.println("Enter 5 to display all sessions");
        System.out.println("Enter 6 to enter the same day session");
    }
    public static void main(String[] args) {
        Cinema cinema = new Cinema();


        while (true) {
            menu();
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        switch (number) {
            case 1 -> cinema.addSeance();
            case 2 -> cinema.removeSeance();
            case 3 -> cinema.removeMovie();
            case 4 -> cinema.showAllMovie();
            case 5 -> cinema.showAllSeances();
            case 6 -> cinema.showSeanceOfDay();
            default -> throw new IllegalStateException("Unexpected value: " + number);
        }
    }
    }
}