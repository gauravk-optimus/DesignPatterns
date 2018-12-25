package observerpattern;
public class HeatIndexDisplay implements Observer, DisplayElement{

	private float temperature;
	private float humidity;
	private float pressure;
	@SuppressWarnings("unused")
	private Subject weatherData;
	
	public HeatIndexDisplay(Subject weatherData){
		this.weatherData = weatherData;
		weatherData.notifyObservers();
	}
	
	public float heatIndex(){
		return temperature+humidity+pressure;
	}
	
	@Override
	public void display(){
		System.out.println("Heat Index "+heatIndex());
	}

	@Override
	public void update(float temperature, float humidity, float pressure){
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		display();
	}
}