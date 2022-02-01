package staticanalysis;

public class Case3 {
    private class Job {
        public boolean isRunning() {return true;}
        public boolean hasErrors() {return true;}
    }
    public String getReadableStatus(Job j) {
        return j.isRunning() ? "Running" : j.hasErrors() ? "Failed" : "Succeeded";
    }
}
