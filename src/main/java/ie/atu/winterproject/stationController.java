package ie.atu.winterproject;

import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class stationController {
    private stationServices myService;

    public stationController(stationServices myService) {
        this.myService = myService;
    }

    private List<station> list = new ArrayList<>();

    @PostMapping("/stations")
    public List<station> addStation(@Valid @RequestBody station stationRequest) {
        return list;
    }
}
