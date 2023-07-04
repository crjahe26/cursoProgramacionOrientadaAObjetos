from car import Car
from account import Account
from uberX import UberX

if __name__ == "__main__":
    print("Hola mundo")

    car = Car("AMQ123", Account("Andres Herrera", "AND876"))
    car.passegenger = 4
    print(vars(car))
    print(vars(car.driver))

    car2 = Car("AMQ123", Account("Andrea Herrera", "ANDA876"))
    car2.passegenger = 3
    print(vars(car2))
    print(vars(car2.driver))

    uberX = UberX("QWE789", Account("Luis Ferran", "AND755"), "Chevrolet", "Spark")
    uberX.passanger = 4
    print(vars(uberX))
    print(vars(uberX.driver))
