public class KelvinAdapter extends CelsiusTemperature {
    private final KelvinTemperature kelvinTemperature;

    public KelvinAdapter(KelvinTemperature kelvinTemperature) {
        this.kelvinTemperature = kelvinTemperature;
    }

    @Override
    public float getTemperature() {
        return kelvinTemperature.getTemperature() - 273;
    }
}
