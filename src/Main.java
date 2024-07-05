public class Main {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();

        TemperatureDisplay temperatureDisplay = new TemperatureDisplay();
        WeatherWarning weatherWarning = new WeatherWarning();

        weatherStation.addObserver(temperatureDisplay);
        weatherStation.addObserver(weatherWarning);

        // Simulate temperature changes
        weatherStation.setTemperature(25); // Below threshold, no warning
        weatherStation.setTemperature(35); // Above threshold, triggers warning
    }
}
