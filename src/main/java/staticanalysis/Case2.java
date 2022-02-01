package staticanalysis;

public class Case2 {
    public void mySwitch(int myVariable){
        switch (myVariable) {
            case 1:
                foo();
                break;
            case 2:
                doSomething();
            default:
                doSomethingElse();
                break;
        }
    }

    private void foo(){}
    private void doSomething(){}
    private void doSomethingElse(){}
}
