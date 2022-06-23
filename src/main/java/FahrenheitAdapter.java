public class FahrenheitAdapter extends CelsiusTemperature {
    private final FahrenheitTemperature fahrenheitTemperature;

    public FahrenheitAdapter(FahrenheitTemperature fahrenheitTemperature) {
        this.fahrenheitTemperature = fahrenheitTemperature;
    }

    @Override
    public float getTemperature() {
        return (fahrenheitTemperature.getTemperature() - 32) / 1.8f;
    }
}
