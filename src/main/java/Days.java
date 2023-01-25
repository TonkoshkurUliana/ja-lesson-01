enum Days {
    MONDAY("Monday"),
    TUESDAY("Tuesday"),
    WEDNESDAY("Wednesday"),
    THURSDAY("Thursday"),
    FRIDAY("Friday"),
    SATURDAY("Saturday"),
    SUNDAY("Sunday");

    private final String title;

    Days(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
