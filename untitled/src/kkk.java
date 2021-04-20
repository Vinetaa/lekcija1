public class kkk {
}
public class CarLauncher {

    public static void main(String[] args) {
        Car car = new Car();

        car.setCarModel("Tesla M model");
        car.setYear(1999);
        car.setNew(false);

        System.out.println(car.getCarModel());
        System.out.println(car.getYear());
        System.out.println(car.isNew());
//        car.setCarModel("Tesla M model");
//        System.out.println(car.getCarModel());


    }
}
