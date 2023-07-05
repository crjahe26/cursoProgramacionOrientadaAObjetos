class Main {
    public static void main(String[] args) {
        System.out.println("Hola mundo");
        
        Car car = new Car("AMQ123", new Account("Andres Herrera", "AND123"));
        car.passegenger = 4;
        car.printDataCar();


        Car car2 = new Car("QWE567", new Account("Andrea Herrera", "ANDA124"));
        car2.passegenger = 3;
        car2.printDataCar();

        Driver cond = new Driver("Pedro", "1548", 8555, "pedro11@gmail.com", "pedro2212");
        System.out.println("No. Documento " + cond.document + " Nombre " + cond.name + " Id " + cond.id);
    }
}