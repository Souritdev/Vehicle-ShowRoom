public class Main{
  public static void main(String[] args){
    Car car = new Car("Toyota", 4);
    Bike bike = new Bike("Bullet", true);

    car.vehicleInfo();
    bike.vehicleInfo();

    Display display = new Display();
    display.showInfo(car);
    display.showInfo(bike);
  }
}