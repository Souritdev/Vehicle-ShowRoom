# Vehicle-ShowRoom

This project demonstrates the four OOP principles in Java:
✅ Encapsulation – Private attributes with getters and setters.
✅ Abstraction – Vehicle is an abstract class.
✅ Inheritance – Car and Bike extend Vehicle.
✅ Polymorphism – Overriding methods & method overloading.

1️⃣ Vehicle (Abstract Class)
Attributes: brand

Methods:

getBrand(), setBrand()

Abstract Method: vehicleInfo()

2️⃣ Car (Extends Vehicle)
Attributes: doors

Methods: getDoors(), setDoors(), Overrides vehicleInfo()

3️⃣ Bike (Extends Vehicle)
Attributes: hasGear

Methods: isHasGear(), setHasGear(), Overrides vehicleInfo()

4️⃣ Display (Method Overloading Example)
Methods:

showInfo(Car car)

showInfo(Bike bike)

5️⃣ Main (Execution Class)
Creates objects of Car and Bike

Displays vehicle info

Uses method overloading

