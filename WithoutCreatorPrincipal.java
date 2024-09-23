class Car {
    private Engine engine;

    public Car(Engine engine) {  // The engine is passed to the Car from outside.
        this.engine = engine;
    }
}

class Engine {
    public Engine() {
        System.out.println("Engine created.");
    }
}
public class WithoutCreatorPrincipal {

    public static void main(String[] args) {
        // Code to use the classes
        Engine engine = new Engine(); // We create the engine outside of the car. 
        Car car = new Car(engine);    // We pass the engine to the car.
    }
    
}
