from car import Car
from account import Account

if __name__ == "__main__":
    print("Hola mundo")

    car = Car("AMQ123", Account("Andres Herrera", "AND876"))
    car.passegenger = 4
    print(vars(car))
    print(vars(car.driver))

    car2 = car = Car("AMQ123", Account("Andrea Herrera", "ANDA876"))
    car2.passegenger = 3
    print(vars(car2))
    print(vars(car2.driver))