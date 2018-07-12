package guru.springframework.api.domain;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class ExpirationDate implements Serializable {

    private Date date;
    private String timezoneType;
    private String timezone;

}
