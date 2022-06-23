import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class KelvinTemperature {
    public static final String UNIT = "K";
    private float temperature;

    @Override
    public String toString() {
        return getTemperature() + UNIT;
    }
}
