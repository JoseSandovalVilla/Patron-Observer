class WeatherWarning implements Observer {
    private static final int TEMPERATURE_THRESHOLD = 30; // Threshold for weather warning

    @Override
    public void update(int temperature) {
        if (temperature > TEMPERATURE_THRESHOLD) {
            System.out.println("Weather Warning: High temperature alert! Temperature is " + temperature);
        }
    }
}
