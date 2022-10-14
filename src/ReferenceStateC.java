package src;

public class ReferenceStateC extends State {
    private String name = "State C";

    public ReferenceStateC(Context context) {
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
        return;
    }

    @Override
    public void referenceMethod3() {
        // Actual implementation of actionable for this particular state
        System.out.println("Method 3 in " + this);
        System.out.println("Switching to State A");
        this._context.changeState(new ReferenceStateA(this._context));
    }

}
