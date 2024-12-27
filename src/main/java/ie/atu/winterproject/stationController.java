package ie.atu.winterproject;

import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

@RestController
public class stationController {
    @PostMapping("/stations")
    public String addStation(@Valid @RequestBody station stationRequest) {
        return "Station details";
    }
}
