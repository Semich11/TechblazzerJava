package inheritance;

public class Main1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.setMake("Porsche");
        car.setModel("carrera");
        car.setDoors(2);
        car.setConvertible(true);
        car.setColor("black");

        System.out.println("make: " + car.getMake());
        System.out.println("model: " + car.getModel());
        System.out.println("color: " + car.getColor());
        System.out.println("doors: " + car.getDoors());
        car.decscribeCar();



    }
}
