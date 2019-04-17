package Assignment6.factory;

import Assignment6.domain.Demographic;

public class DemographicFactory {


    public static Demographic demographic(String race, String gender){
        return new Demographic.Builder().setGender(gender)
                .setRace(race)
                .build();

    }
}
