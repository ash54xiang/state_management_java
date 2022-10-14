package src;

public class ReferenceStateB extends State {
    private String name = "State B";

    public ReferenceStateB(Context context) {
        super(context);
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public void referenceMethod1() {
        // Actual implementation of actionable for this particular state
        return;
    }

    @Override
    public void referenceMethod2() {
        // Actual implementation of actionable for this particular state
        System.out.println("Method 2 in " + this);
        System.out.println("Switching to State C");
        this._context.changeState(new ReferenceStateC(this._context));
    }

    @Override
    public void referenceMethod3() {
        // Actual implementation of actionable for this particular state
        return;
    }

}
