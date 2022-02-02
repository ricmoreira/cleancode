package staticanalysis;

public class Case2 {
    int myInt = 0;

    public void mySwitch(int myVariable){
        switch (myVariable) {
            case 1:
                foo();
                break;
            case 2:
                doSomething();
                break;
            default:
                doSomethingElse();
                break;
        }
    }

    private void foo(){
        myInt=1;
    }
    private void doSomething(){
        myInt=2;
    }
    private void doSomethingElse(){
        myInt=3;
    }
}