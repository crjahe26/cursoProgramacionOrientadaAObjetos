<?php

require_once('car.php');
require_once('uberX.php');
require_once('uberPool.php');
require_once('account.php');
require_once('driver.php');
require_once('uberVan.php');


$car = new Car("AW456", new Account("Andres Herrera", "AMS123"));
$car->printDataCar();

$car2 = new Car("AW456", new Account("Andrea Herrera", "AND123"));
$car2->printDataCar();

$uberX = new UberX("CVB123", new Account("Andres Herrera", "AND456"), "Chevrolet", "Spark");
$uberX->PrintDataCar();


$uberPool = new UberPool("ASD123", new Account("Andrea Ferran", "AND456"), "Dodge", "Attitude");
$uberPool->PrintDataCar();

$cond = new Driver( "Pedro", "1548", "8555", "pedro11@gmail.com", "pedro2212");
echo "\n password: {$cond->password},
        conductor: {$cond->name},
        document: {$cond->document}";


echo "Inicio de prueba de Polimorfismo";

$uberVan = new UberVan("OJL395", new Account("Raúl Ramírez", "AND456"), "Nissan", "Versa");
$uberVan->setPassegenger(6);
$uberVan->printDataCar();

?>