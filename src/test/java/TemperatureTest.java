import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TemperatureTest {
    @Test
    void getCelciusFromKelvinTest(){
        KelvinTemperature kelvinTemperature = new KelvinTemperature(333f);
        CelsiusTemperature celsiusTemperature = new KelvinAdapter(kelvinTemperature);
        assertEquals("60.0°C", celsiusTemperature.toString());
    }

    @Test
    void getCelciusFromFahrenheitTest(){
        FahrenheitTemperature fahrenheitTemperature = new FahrenheitTemperature(122f);
        CelsiusTemperature celsiusTemperature = new FahrenheitAdapter(fahrenheitTemperature);
        assertEquals("50.0°C", celsiusTemperature.toString());
    }
}
