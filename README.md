# Design Concern on State Management

**Thread Safety**
- Immutable Implementation
    - when states are shared between different threads, we should create thread-safe classes by making them immutable.
    - A class instance is immutable when its internal state can't be modified after it has been constructed.
    - The easiest way to create an immutable class is by declaring all the fields private and final and not providing setters.

    ```
    public class ExtendedState {
        final Context _context;
    }
    ```
