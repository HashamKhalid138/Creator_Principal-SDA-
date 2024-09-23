# Creator Principle in Software Design

## Overview

This project demonstrates the **Creator Principle** in software design using two approaches:
1. **With Creator Principle**: The object creation responsibility is assigned to the class that uses the object.
2. **Without Creator Principle**: The object is created outside and passed to the class that uses it.

The purpose of this project is to showcase how responsibility assignment affects the structure and organization of the code.

---

## Files and Description

### 1. **WithCreatorPrincipal.java**
This file demonstrates how the **Creator Principle** is applied, where the `Car` class is responsible for creating its own `Engine`. 

- **How It Works**: 
  - The `Car` class contains an `Engine` object. When a `Car` instance is created, it automatically creates and initializes its `Engine`.
  - The relationship between `Car` and `Engine` is tightly coupled, and the responsibility of creating the engine is assigned to `Car`.
  
- **Code Summary**:
  ```java
  public class WithCreatorPrincipal {
      public static void main(String[] args) {
          Car car = new Car(); // Creating a Car will automatically create an Engine
      }
  }
