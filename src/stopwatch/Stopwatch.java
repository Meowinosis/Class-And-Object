package stopwatch;

import java.util.Date;

public class Stopwatch {
    private long startTime;
    private long endTime;

    public Stopwatch() {
        this.startTime = new Date().getTime();
    }

    public long getStartTime() {
        return startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public void start(){
        startTime = new Date().getTime();
    }

    public void stop(){
        endTime = new Date().getTime();
    }

    public long getElapsedTime(){
        return endTime - startTime;
    }
}
