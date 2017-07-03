package spittr;

import lombok.EqualsAndHashCode;
import lombok.Getter;

import java.util.Date;

@EqualsAndHashCode
public class Spittle {
    @Getter private final Long id;
    @Getter private final String message;
    @Getter private final Date time;
    @Getter private Double longitude;
    @Getter private Double latitude;

    public Spittle(String message, Date time) {
        this(message, time, null, null);
    }

    public Spittle(String message, Date time, Double longitude, Double latitude) {
        this.id = null;
        this.message = message;
        this.time = time;
        this.longitude = longitude;
        this.latitude = latitude;
    }
}
