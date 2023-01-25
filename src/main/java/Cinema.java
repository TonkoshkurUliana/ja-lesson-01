
import java.util.*;
import java.util.function.Predicate;

public class Cinema {

    TreeMap<Days, Schedule> schedules = new TreeMap<>();
    ArrayList<Movie> moviesLibrary = new ArrayList<>();

    Time open;
    Time close;
    Days[] masDays = Days.values();
    Scanner sc = new Scanner(System.in);

    public Cinema() {
        Arrays.stream(Days.values()).forEach(d -> schedules.put(d, new Schedule()));
        Scanner scanner = new Scanner(System.in);
        System.out.println("Open time ");
        open = Methods.getTime();
        System.out.println("Ending time: ");
        close = Methods.getTime();
    }


    //- додає сеанс фільму в розклад (schedules), в конкретний день, який задається параметром String
    void addSeance() {
        System.out.print("Enter day:");
        String day = sc.next();
        Schedule schedule = schedules.get(Days.valueOf(day.toUpperCase()));
        schedule.addSeance();
        schedule.seances.forEach(seance -> moviesLibrary.add(seance.getMovie()));
    }

    // - повністю видаляє фільм з фільмотеки і розкладу, якщо був запланований
    void removeMovie() {
        System.out.print("Enter title movie:");
        String title = sc.next();

        Predicate<Movie> findTitle = movie -> movie.getTitle().equalsIgnoreCase(title);
        Optional<Movie> movieFound = moviesLibrary.stream().filter(findTitle).findFirst();

        if (movieFound.isPresent()) {
            moviesLibrary.remove(movieFound.get());
            System.out.println("Movie remove!");
        }
        Arrays.stream(Days.values()).forEach(days -> {
            Schedule schedule = schedules.get(days);
            schedule.seances.forEach(seance -> moviesLibrary.add(seance.getMovie()));
        });
    }

    // видаляє конкретний сеанс фільму в конкретний день, який задається параметром String
    void removeSeance() {
        System.out.print("Enter day:");
        String day = sc.next();
        schedules.get(Days.valueOf(day.toUpperCase())).removeSeance();
    }

    public void showAllMovie() {
        moviesLibrary.forEach(movie -> System.out.println(movie));
    }

    public void showAllSeances() {
        schedules.forEach((days, schedule) -> System.out.println(days + " ---> " + schedule.getSeances()));
    }

    public void showSeanceOfDay() {
        System.out.print("Enter day:");
        String day = sc.next();

        Schedule schedule = schedules.get(Days.valueOf(day.toUpperCase()));
        System.out.println(schedule.getSeances().toString());
    }
}
