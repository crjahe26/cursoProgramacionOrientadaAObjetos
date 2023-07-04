<?php

require_once('car.php');
require_once('uberX.php');
require_once('uberPool.php');
require_once('account.php');


$car = new Car("AW456", new Account("Andres Herrera", "AMS123"));
$car->printDataCar();

$car2 = new Car("AW456", new Account("Andrea Herrera", "AND123"));
$car2->printDataCar();

$uberX = new UberX("CVB123", new Account("Andres Herrera", "AND456"), "Chevrolet", "Spark");
$uberX->PrintDataCar();


$uberPool = new UberPool("ASD123", new Account("Andrea Ferran", "AND456"), "Dodge", "Attitude");
$uberPool->PrintDataCar();
?>