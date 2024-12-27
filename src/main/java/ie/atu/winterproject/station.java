package ie.atu.winterproject;

import jakarta.validation.constraints.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class station {
    private String stationCode;

    @NotBlank
    @Size(max=100, message="Name cannot be greater than 100 characters")
    private String name;

    @Min(1)
    private int platformCount;

    @Min(0)
    private int staircaseCount;

    @Min(0)
    private int elevatorCount;
}
