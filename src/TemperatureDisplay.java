class TemperatureDisplay implements Observer {
    @Override
    public void update(int temperature) {
        System.out.println("Temperature Display: Temperature is now " + temperature);
    }
}
