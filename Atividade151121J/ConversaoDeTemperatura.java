public class ConversaoDeTemperatura {

	public static double celsiusParaFahrenheit(double c) {
		return (9 * c/5) + 32;
	}
	
	public static double fahrenheitParaCelsius(double f) {
		return (f - 32) * 5/9;
	}
	
	public static double celsiusParaKelvin(double c) {
		return c + 273.15;
	}
	
	public static double kelvinParaCelsius(double k) {
		return k - 273.15;
	}
	
	
	

}

