package week_09;

public class StopWatch {
    private long startTime;
    private long endTime;

    StopWatch() {
        startTime = System.currentTimeMillis();
    }

    long getStartTime() {
        return startTime;
    }

    long getEndTime() {
        return endTime;
    }
    void start(){
        startTime = System.currentTimeMillis();
    }
    void stop(){
        endTime = System.currentTimeMillis();
    }
    long elapsedTime(){
        return endTime - startTime;
    }
}
