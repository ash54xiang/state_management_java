package src;

public class ReferenceStateA extends State {
    private String name = "State A";

    public ReferenceStateA(Context context) {
        super(context);
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public void referenceMethod1() {
        // Actual implementation of actionable for this particular state
        System.out.println("Method 1 in " + this);
        System.out.println("Switching to State B");
        this._context.changeState(new ReferenceStateB(this._context));
    }

    @Override
    public void referenceMethod2() {
        // Actual implementation of actionable for this particular state
        return;
    }

    @Override
    public void referenceMethod3() {
        // Actual implementation of actionable for this particular state
        return;
    }

}
