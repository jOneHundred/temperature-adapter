import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class FahrenheitTemperature {
    public static final String UNIT = "°F";
    private float temperature;

    @Override
    public String toString() {
        return getTemperature() + UNIT;
    }

}
