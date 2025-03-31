import java.util.*;

class Television {
    private int currentChannel;
    private static final int TOTAL_CHANNELS = 10;

    public Television() {
        this.currentChannel = 1;
    }
    public void watchChannels(int count) {
        for (int i = 0; i < count; i++) {
            System.out.println("Watching channel " + currentChannel);
            currentChannel++;
            if (currentChannel > TOTAL_CHANNELS) {
                currentChannel = 1;
            }
        }
    }
}

class TelevisionViewer {
    public static void main(String[] args) {
        Television tv = new Television();
        for (int day = 1; day <= 10; day++) {
            System.out.println("Woke up, day " + day);
            if (day % 2 == 1) {
                tv.watchChannels(6);
            } else {
                tv.watchChannels(4);
            }
            System.out.println("Falling asleep");
        }
    }
}