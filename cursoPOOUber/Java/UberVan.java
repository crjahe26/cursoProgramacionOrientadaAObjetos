import java.util.ArrayList;
import java.util.Map;

public class UberVan extends Car{
    Map<String, Map<String, Integer>> typeCarAccepted;
    ArrayList<String> seatsMaterial;
    private Integer passegenger;

    public UberVan(String license, Account driver/* , Map<String, Map<String, Integer>> typeCarAccepted, ArrayList<String> seatsMaterial */){
        super(license, driver);
        /* this.typeCarAccepted = typeCarAccepted;
        this.seatsMaterial = seatsMaterial; */
    }

    @Override
    public void setPassegenger(Integer passegenger){
        if (passegenger == 6) {
            this.passegenger = passegenger;   
        }
        else{
            System.out.println("Necesitas asignar 4 pasajeros");
        }
    }

    void printDataCar() {
        if((license != null) && (driver.name != null) && (passegenger != null)) {
            System.out.println("License: " + license + " Name Driver: " + driver.name + " Passegengers: " + passegenger);
        }
        else {
            System.out.println("Tienes valores nulos o invalidos en los atributos License, Name o passegengers");
        }
        
    }
}
