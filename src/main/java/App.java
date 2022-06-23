import lombok.extern.slf4j.Slf4j;

@Slf4j
public class App {
    public static void main(String[] args) {
        KelvinTemperature kelvinTemperature = new KelvinTemperature(293f);
        log.info(kelvinTemperature.toString());
        FahrenheitTemperature fahrenheitTemperature = new FahrenheitTemperature(68f);
        log.info(fahrenheitTemperature.toString());
        CelsiusTemperature celsiusTemperature = new KelvinAdapter(kelvinTemperature);
        log.info(celsiusTemperature.toString());
        celsiusTemperature = new FahrenheitAdapter(fahrenheitTemperature);
        log.info(celsiusTemperature.toString());
    }
}
