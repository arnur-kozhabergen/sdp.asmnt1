public class ApartmentDirector {
    public Apartment buildStudio(ApartmentBuilder builder){
        return builder
            .squareMeters(50)
            .floor(3)
            .address("uly dala")
            .complex("private")
            .comfortClass("basic")
            .moveInReady(false)
            .build();
    }

 public Apartment buildPentHouse(LuxuryApartmentBuilder builder){
        return builder
            .squareMeters(400)
            .floor(25)
            .address("out of city")
            .complex("private")
            .comfortClass("high")
            .moveInReady(true)
            .hasConcierge(true)
            .hasConcierge(true)
            .build();
    }
}
