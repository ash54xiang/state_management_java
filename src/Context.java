package src;

public abstract class Context {
    public State _currentState;

    public abstract void setCurrentState(State state);

    public abstract void changeState(State state);

    public State getState() {
        return this._currentState;
    }

    public void logState() {
        String msg_str = String.format("Curret state: %s", this, _currentState);
        System.out.println(msg_str);
    }

}
