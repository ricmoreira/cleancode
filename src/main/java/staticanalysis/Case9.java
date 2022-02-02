package staticanalysis;

import java.util.ArrayList;

public class Case9 {
    void doSomethingIfTrue(ArrayList<String> namesList) {
        if (!namesList.isEmpty()) {
            foo();
        } else {
            bar();
        }

    }

    public void foo() {
        /* TODO document why this method is empty */ }

    public void bar() {
        throw new UnsupportedOperationException();
    }
}
