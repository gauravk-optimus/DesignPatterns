package observerpattern;
public class WeatherStation {
	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
		HeatIndexDisplay heatDisplay = new HeatIndexDisplay(weatherData);
		weatherData.registerObserver(currentDisplay);
		weatherData.registerObserver(heatDisplay);
		weatherData.setMeasurements(80, 65, 30.4f);
	}
}