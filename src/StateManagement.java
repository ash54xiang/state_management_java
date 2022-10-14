package src;

public class StateManagement {
    public static void main(String[] agrs) {
        System.out.println("Welcome to my state management draft!");

        ExtendedContext mainContext = new ExtendedContext();
        mainContext.setCurrentState(new ReferenceStateA(mainContext));
        mainContext.referenceMethod1();
        System.out.println("Current State (1): " + mainContext.getState().toString());
        mainContext.referenceMethod2();
        System.out.println("Current State (2): " + mainContext.getState().toString());
        mainContext.referenceMethod3();
        System.out.println("Current State (3): " + mainContext.getState().toString());
    }
}
