package pl.swislowski.kamil.javaee.servlets.tempconverter;

public class TemperatureConverterUtils {

	public static double fahrenheit(double celsius) {
		return ((9 * celsius) / 5) + 32;
	}

	public static double celsius(double fahrenheit) {
		return (fahrenheit - 32) * 5 / 9;
	}

}
