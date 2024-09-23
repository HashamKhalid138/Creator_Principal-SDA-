# Creator Principle in Software Design

## Overview

This project demonstrates the **Creator Principle** using two different approaches:

### With Creator Principle:
In this solution, the `Car` class is responsible for creating its own `Engine`. The creation of the `Engine` happens inside the `Car` constructor. This follows the **Creator Principle**, where the class that uses an object (in this case, the `Car` uses an `Engine`) is also responsible for creating it.

#### Code Breakdown:
- The `Car` class has a private `Engine` attribute.
- Inside the `Car` constructor, a new `Engine` object is created automatically when a `Car` is instantiated.
- This approach leads to a more cohesive design since the `Car` manages the lifecycle of its `Engine`.

---

### Without Creator Principle:
In this solution, the `Engine` is created externally from the `Car` class and passed as a parameter to the `Car` constructor. This does **not** follow the **Creator Principle** because the responsibility of object creation is shifted outside of the class that uses the object.

#### Code Breakdown:
- The `Car` class still has a private `Engine` attribute, but instead of creating it internally, it accepts an `Engine` instance from the outside via its constructor.
- The `Engine` object is created in the `main` method, then passed into the `Car` constructor.

---

## Conclusion:
Both approaches demonstrate different ways of handling object creation. The **Creator Principle** ensures tighter cohesion and more intuitive design by letting the class that uses an object also be responsible for creating it, while **without the Creator Principle** provides flexibility by separating object creation from usage, though at the cost of cohesion.
