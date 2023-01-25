
import org.junit.*;
import org.junit.rules.TestWatcher;


public class TestCinema {

    public Movie movie;
    public Seance seance;


    @Rule
    public TestWatcher testWatcher = new TestWatcher() {
        protected void failed(Throwable e, org.junit.runner.Description description) {
            System.out.println();
        System.out.println("FAILED--> " + description.getMethodName());
        };

        protected void succeeded(org.junit.runner.Description description) {
            System.out.println();
            System.out.println("SUCCEED--> " + description.getMethodName());
        };
    };

    @Before
    public void beforeTest() {
        movie = new Movie("TestMovie", new Time(2, 40));
        seance = new Seance(movie, new Time(10, 0));
    }

    @After
    public void afterTest() {
        movie = null;
        seance = null;
    }

    @Test
    public void testAddSeance() throws InterruptedException {

        Time testTime = new Time(10, 0);

        testTime.hour = testTime.getHour() + movie.duration.getHour();
        testTime.min = testTime.getMin() + movie.duration.getMin();
        if (testTime.min >= 60) {
            testTime.hour++;
            testTime.min = testTime.min - 60;
        }
        if (testTime.hour > 24) {
            testTime.hour = testTime.hour - 24;
        } else if (testTime.hour == 24) {
            testTime.hour = 0;
        }

        Assert.assertEquals(seance.getEndTime().hour, testTime.hour);
        Assert.assertEquals(seance.getEndTime().min, testTime.min);
    }

    @Test
    public void testGetTitle() {
      String expectedTitle = "TestMovie";
      Assert.assertEquals(expectedTitle,movie.getTitle());
    }
}


