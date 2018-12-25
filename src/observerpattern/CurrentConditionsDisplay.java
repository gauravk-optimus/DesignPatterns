package observerpattern;
public class CurrentConditionsDisplay implements Observer, DisplayElement{

	private float temperature;
	private float humidity;
	private float pressure;
	@SuppressWarnings("unused")
	private Subject weatherData;
	
	public CurrentConditionsDisplay(Subject weatherData){
		this.weatherData = weatherData;
		weatherData.notifyObservers();
	}
	
	@Override
	public void display(){
		System.out.println("temperature "+temperature+", humidity "+humidity+", pressure "+pressure);
	}

	@Override
	public void update(float temperature, float humidity, float pressure){
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		display();
	}
}