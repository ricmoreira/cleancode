package afterrefactor;

public class Refactor1 {
    private int counter;

    public Refactor1(int counterInitialValue) {
        this.counter = counterInitialValue;
    }

    public void increaseCounter() {
        this.counter++;
    }

    public void decreaseCounter() {
        this.counter--;
    }

    public int counterValue(){
        return this.counter;
    }
}
