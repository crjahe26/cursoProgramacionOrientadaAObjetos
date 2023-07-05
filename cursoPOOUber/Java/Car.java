public class Car {
    Integer id;
    String license;
    Account driver;
    private Integer passegenger; /* Ponemos este modificador de acceso para que pueda ser modificado solo desde la misma clase */

    public Car(String license, Account driver){
        this.license = license;
        this.driver = driver;
    }

    void printDataCar() {
        if((license != null) && (driver.name != null) && (passegenger != null)) {
            System.out.println("License: " + license + " Name Driver: " + driver.name + " Passengers: " + passegenger);
        }
        else {
            System.out.println("Tienes valores nulos o invalidos en los atributos License, Name o Passengers");
        }
        
    }

    public Integer getPassegenger(){
        return passegenger;
    }

    public void setPassegenger(Integer passenger){
        if (passenger == 4) {
            this.passegenger = passenger;   
        }else{
            System.out.println("Necesitas asignar 4 pasajeros");
        }
    }
}