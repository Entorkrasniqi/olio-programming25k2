public class ClockTest {
    public static void main(String[] args) {
        Clock clock = Clock.getInstance();
        clock.setTime(10);
        System.out.println("Current time: " + clock.getTime());
        clock.advanceTime(5);
        System.out.println("Advanced time: " + clock.getTime());
    }
}
