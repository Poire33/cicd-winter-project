package ie.atu.winterproject;

import jakarta.validation.constraints.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class station {
    @NotBlank
    private String stationCode;

    @NotBlank
    @Size(max=100, message="Name cannot be greater than 100 characters")
    private String name;

    @NotBlank
    @Min(1)
    private int platformCount;

    @NotBlank
    @Min(0)
    private int staircaseCount;

    @NotBlank
    @Min(0)
    private int elevatorCount;
}
