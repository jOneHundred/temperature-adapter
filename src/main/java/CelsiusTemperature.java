import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@RequiredArgsConstructor
@Getter
@Setter
public class CelsiusTemperature {
    public static final String UNIT = "°C";
    private float temperature;

    @Override
    public String toString() {
        return getTemperature() + UNIT;
    }
}
