package lang.print.gaps.finalModuleTask;

public class TemperatureConverter {
    public void toFahrenheit(int temperatureCelsius){
        float temperatureFarenheit = (int) temperatureCelsius;
        float temperature = ((temperatureFarenheit * 18) /10) +32;
        System.out.println(temperature);
    }
}
