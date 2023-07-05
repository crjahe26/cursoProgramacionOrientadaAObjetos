public class Car {
    protected Integer id;
    protected String license;
    protected Account driver;
    protected Integer passegenger; /* Ponemos este modificador de acceso para que pueda ser modificado solo desde la misma clase */

    // Constructor de la clase Car
    public Car(String license, Account driver){
        this.license = license;
        this.driver = driver;
    }

    // Método para imprimir atributos
    void printDataCar() {
        if((license != null) && (driver.name != null) && (passegenger != null)) {
            System.out.println("License: " + license + " Name Driver: " + driver.name + " passegengers: " + passegenger);
        }
        else {
            System.out.println("Tienes valores nulos o invalidos en los atributos License, Name o passegengers");
        }
        
    }

    // Getter de pasajeros
    public Integer getPassegenger(){
        return passegenger;
    }

    // Setter de pasajeros
    public void setPassegenger(Integer passegenger){
        if (passegenger == 4) {
            this.passegenger = passegenger;   
        }
        else{
            System.out.println("Necesitas asignar 4 pasajeros");
        }
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public Account getDriver() {
        return driver;
    }

    public void setDriver(Account driver) {
        this.driver = driver;
    }

    

}