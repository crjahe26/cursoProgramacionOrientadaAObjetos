<?php

class Car {
    public $id;
    public $license;
    public $driver;
    protected $passegenger;


    public function __construct($license, $driver){
        $this->license = $license;
        $this->driver = $driver;
    }

    public function getPassegenger() {
        return $this->passegenger;
    }

    public function setPassegenger($passegenger) {
        if ($passegenger == 4) {
            $this->passegenger = $passegenger;
        }
        else {
            echo "Necesitas asignar 4 pasajeros";
        }
    }

    public function PrintDataCar() {
        echo "license: $this->license,
        conductor: {$this->driver->name},
        document: {$this->driver->document},
        Número de pasajeros: {$this->passegenger}
        
        ";
    }


}

?>