from car import Car

if __name__ == "__main__":
    print("Hola mundo")
    car = Car()
    car.licence = "AMQ123"
    car.driver = "Andres Herrera"
    car.passegenger = 4
    #print(vars(car))

    car2 = Car()
    car2.license = "QWE567"
    car2.driver = "Andrea Herrera"
    car2.passegenger = 3
    #print(vars(car2))