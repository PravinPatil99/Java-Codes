package dec28SatExam;

import java.util.function.Function;

public class MainSensor 
{
	SensorData s1=new SensorData(30.1,20.0);
	Function<SensorData,Double>f1=data->data.setTemperature();
	double Temperature=f1.apply(s1);
	
	sytem.out.println("Temperatur:"+Temperature);
		
	}
	
	
