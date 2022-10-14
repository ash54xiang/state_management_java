package src;

public abstract class State {
    final Context _context;

    public State(Context context) {
        this._context = context;
    }

    public abstract void referenceMethod1();

    public abstract void referenceMethod2();

    public abstract void referenceMethod3();
}
