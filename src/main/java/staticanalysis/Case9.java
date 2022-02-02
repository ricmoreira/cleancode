package staticanalysis;

import java.util.ArrayList;

public class Case9 {
    void doSomethingIfTrue(ArrayList<String> namesList) {
        if (namesList.size() > 0) {
            foo();
        } else {
            bar();
        }

    }

    public void foo(){}
    public void bar(){}
}
