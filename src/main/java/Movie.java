public class Movie  {
    String title;
    Time duration;


    public Movie(String title , Time duration) {
        this.title = title;
        this.duration = duration ;
    }

    public String getTitle() {
        return title;
    }

    public Movie setTitle(String title) {
        this.title = title;
        return this;
    }

    public Time getDuration() {
        return duration;
    }

    public Movie setDuration(Time duration) {
        this.duration = duration;
        return this;
    }

    @Override
    public String toString() {
        return "Title: '" + title + '\'' +
                ", duration: " + duration;
    }
}
