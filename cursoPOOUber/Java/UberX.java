public class UberX extends Car{
    String brand;
    String model;

    public UberX(String license, Account driver, String brand, String model){
        super(license, driver);
        this.brand = brand;
        this.model = model;
    }

    @Override
    void printDataCar() {
        if((model != null) && (brand != null)) {
            System.out.println("Modelo: " + model + " Brand: " + brand);
        }
        else {
            System.out.println("Tienes valores nulos o invalidos en los atributos License, Name o passegengers");
        }
        
    }
    
}
