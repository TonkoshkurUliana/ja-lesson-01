public class Seance implements Comparable<Seance> {
    Movie movie;
    Time startTime;
    Time endTime;

    public Seance(Movie movie, Time startTime) {
        this.movie = movie;
        int hour = startTime.getHour() + movie.duration.getHour();
        int min = startTime.getMin() + movie.duration.getMin();
        if (min >= 60) {
            hour++;
            min = min - 60;
        }
        if (hour > 24) {
            hour = hour - 24;
        } else if (hour == 24) {
            hour = 0;
        }

        Time tempTime = new Time(hour, min);
        this.startTime = startTime;
        this.endTime = tempTime;
    }

    public Movie getMovie() {
        return movie;
    }

    public Seance setMovie(Movie movie) {
        this.movie = movie;
        return this;
    }

    public Time getStartTime() {
        return startTime;
    }

    public Seance setStartTime(Time startTime) {
        this.startTime = startTime;
        return this;
    }

    public Time getEndTime() {
        return endTime;
    }

    public Seance setEndTime(Time endTime) {
        this.endTime = endTime;
        return this;
    }

    @Override
    public String toString() {
        return "Seance{" +
                "Movie=" + movie +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                '}';
    }

    @Override
    public int compareTo(Seance o) {
        return 0;
    }
}
