package Assignment6.factory;

import Assignment6.domain.Location;


public class LocationFactory {

    public static Location userLocation(String region) {
        return new Location.Builder().UserRegion(region)
               .build();
    }
}
