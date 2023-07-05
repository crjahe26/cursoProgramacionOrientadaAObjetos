var car = new Car("AW456", new Account("Andres Herrera", "QWE34"))
car.passanger = 4;
car.printDataCar();

var uberX = new UberX("QWE789", new Account("Andrea Ferran", "AND755"), "Chevrolet", "Spark")
uberX.passanger = 4;
uberX.printDataCar();

var cond = new Driver( "1548", "Pedro", 8555, "pedro11@gmail.com", "pedro2212");
console.log(`No. Documento ${cond.document} Nombre ${cond.name} Id ${cond.id}`);