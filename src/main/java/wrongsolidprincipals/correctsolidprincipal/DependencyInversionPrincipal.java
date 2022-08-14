package wrongsolidprincipals.correctsolidprincipal;


public class DependencyInversionPrincipal {
    public static void main (String args[] ){
        Engine engine = new PetrolEngineImpl();
        Car car = new Car(engine);
        System.out.println("the Engine : "+car.getEngine().getEngineName());

        engine = new DieselEngineImpl();
        Car car2 = new Car(engine);
        System.out.println("the Engine : "+car2.getEngine().getEngineName());
    }
}



interface Engine {

    public String getEngineName();

}

class PetrolEngineImpl implements Engine{
    private String engineName ="Petrol Engine";
    @Override
    public String getEngineName() {
        return engineName;
    }
}

class DieselEngineImpl implements Engine{
    private String engineName ="Diesel Engine";
    @Override
    public String getEngineName() {
        return engineName;
    }
}



class Car {
    private Engine engine;

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    Car(Engine engine){
        this.engine = engine;
    }
}



