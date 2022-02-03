package controllers;

public class Stopwatch {

    private final long start;

    public Stopwatch()

    { start = System.currentTimeMillis(); }

    public double elapsedTime()
    {
        long now = System.currentTimeMillis();
        return (now - start) / 1000.0;
    }

    public String timeInText(double initialTime) {
        double time = this.elapsedTime();
        double timePassed = initialTime - time;
        double minutes = timePassed / 60.0;
        double seconds = timePassed % 60.0;
        String secondsText;
        String minutesText;
        if (seconds < 10) {
            secondsText = "0" + (int) seconds;
        }
        else secondsText = "" + (int) seconds;

        if (minutes < 10) {
            minutesText = "0" + (int) minutes;
        }
        else minutesText = "" + (int) minutes;

        String timeInText = minutesText + ":" + secondsText;
        return timeInText;
    }

}