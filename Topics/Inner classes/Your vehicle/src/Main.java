class EnjoyVehicle {

    public static void startVehicle() {
        Vehicle car = new Vehicle();
        Vehicle.Engine engine = car.new Engine();
        engine.start();
    }
}
