package dec28SatExam;

public class SensorData
{
	private double temperature;
	private double humidity;
	
	public SensorData(double temperature, double humidity) {
		super();
		this.temperature = temperature;
		this.humidity = humidity;
	}

	public double getTemperature() {
		return temperature;
	}

	public void setTemperature(double temperature) {
		this.temperature = temperature;
	}

	public double getHumidity() {
		return humidity;
	}

	public void setHumidity(double humidity) {
		this.humidity = humidity;
	}

	@Override
	public String toString() {
		return "SensorData [temperature=" + temperature + ", humidity=" + humidity + "]";
	}
	
	
	

}
