package src;

public class ExtendedContext extends Context {

    @Override
    public void changeState(State state) {
        this._currentState = state;
    }

    @Override
    public void setCurrentState(State state) {
        this._currentState = state;
    }

    public void referenceMethod1() {
        System.out.println("In ExtendedContext method 1");
        this._currentState.referenceMethod1();
    }

    public void referenceMethod2() {
        System.out.println("In ExtendedContext method 2");
        this._currentState.referenceMethod2();
    }

    public void referenceMethod3() {
        System.out.println("In ExtendedContext method 3");
        this._currentState.referenceMethod3();
    }

}
