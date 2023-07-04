<?php

require_once('car.php');
require_once('account.php');

$car = new Car("AW456", new Account("Andres Herrera", "AMS123"));
$car->printDataCar();

$car2 = new Car("AW456", new Account("Andrea Herrera", "AND123"));
$car2->printDataCar();

?>