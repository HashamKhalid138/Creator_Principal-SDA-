class Car {
    private Engine engine;

    public Car() {
        this.engine = new Engine(); // Car creates Engine since it uses Engine.
    }
}

class Engine {
    public Engine() {
        System.out.println("Engine created.");
    }
}
public class WithCreatorPrincipal {

    public static void main(String[] args) {
        
        Car car = new Car(); // Creating a Car will automatically create an Engine
    }
    
}
