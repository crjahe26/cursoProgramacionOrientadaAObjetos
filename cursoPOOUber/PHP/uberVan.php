<?php
require_once('car.php');

class UberVan extends Car {
    public $typeCarAccepted;
    public $seatsMaterial;

    public function __construct($license, $driver, $typeCarAccepted, $seatsMaterial){
        parent::__construct($license, $driver);
        $this->typeCarAccepted = $typeCarAccepted;
        $this->seatsMaterial = $seatsMaterial;
    }


    public function setPassegenger($Passegenger) {
    
        if ($Passegenger == 6) {
            $this->Passegenger = $Passegenger;
        }
        else {
            echo "Necesitas asignar 6 pasajeros 
    ";
        }
    
    }
}







?>