package ie.atu.winterproject;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class stationServices {
    private List<station> myList = new ArrayList<>();

    public List<station> addStation(station station)
    {
        myList.add(station);
        return myList;
    }
}
