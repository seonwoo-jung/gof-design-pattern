package ch02.subject;

import ch02.display.CurrentConditionsDisplay;
import ch02.display.ForecastDisplay;
import ch02.display.StatisticsDisplay;

public class WeatherStation {

	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();

		CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
		StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
		ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

		System.out.println("\n================================");
		weatherData.setMeasurements(80, 65, 30.4f);
		System.out.println("================================\n");

		System.out.println("================================");
		weatherData.setMeasurements(82, 70, 29.2f);
		System.out.println("================================\n");

		System.out.println("================================");
		weatherData.setMeasurements(78, 90, 29.2f);
		System.out.println("================================");
	}
}
