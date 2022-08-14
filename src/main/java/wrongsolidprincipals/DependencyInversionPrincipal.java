package wrongsolidprincipals;

public class DependencyInversionPrincipal {
    public static void main (String args[] ){
        PetrolEngine petrolEngine = new PetrolEngine();
        petrolEngine.setName("Petrol Engine");
        Car car = new Car(petrolEngine);
        System.out.println("the Engine : "+car.getPetrolEngine().getName());
    }
}

class PetrolEngine{
    private String name ;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}

class Car {
    private PetrolEngine petrolEngine;
    public PetrolEngine getPetrolEngine() {
        return petrolEngine;
    }
    public void setPetrolEngine(PetrolEngine petrolEngine) {
        this.petrolEngine = petrolEngine;
    }
    Car(PetrolEngine petrolEngine){
        this.petrolEngine = petrolEngine;
    }
}
