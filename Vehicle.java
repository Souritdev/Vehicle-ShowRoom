abstract class Vehicle{
  private String brand; // Enacapsulation --> private member

  public Vehicle(String brand){
    this.brand = brand;
  }

  public String getBrand(){
    return brand;
  }
  
  public void setBrand(String brand){
    this.brand = brand;
  }

  public abstract void vehicleInfo();
}


// Inheritance 
class Car extends Vehicle{
  private int doors; // Encapsulation--> private member

  public Car(String brand, int doors){
    super(brand);
    this.doors = doors;
  }

  public int getDoors(){ // getter method
    return doors;
  }

  public void setDoors(int doors){ // setter method
    this.doors = doors;
  }

  // Overriding method via polymorphism
  @Override
  public void vehicleInfo(){
    System.out.println("Car Brand is: " + getBrand() + ", Doors: " + doors);
  }
}

class Bike extends Vehicle{
  private boolean hasGear;

  public Bike(String brand , boolean hasGear){
    super(brand);
    this.hasGear = hasGear;
  }

  public boolean ishasGear(){
    return hasGear;
  }

  public void sethasGear(boolean hasGear){
    this.hasGear = hasGear;
  }

  @Override
  public void vehicleInfo(){
    System.out.println("Bike brand is: " + getBrand() + ", has Gear: " + hasGear);
  }
}

// Polymorphism --> method overloading example
class Display{
  public void showInfo(Car car){
    System.out.println("Displaying car info : " + car.getBrand());
  }

  public void showInfo(Bike bike){
    System.out.println("Displaying bike info: " + bike.getBrand());
  }
}

