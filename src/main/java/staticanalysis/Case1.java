package staticanalysis;

// this is a test
public class Case1 {
    int whatIsWrongHere(int a) {
        int b = 12;
        if (a == 1) {
            return b;
        }
        return b;
    }
}
