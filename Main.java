public class Main {
    public static void main(String[] args){
        ApartmentBuilder builder = new StandardApartmentBuilder();
        Apartment averageApartment = builder
        .squareMeters(34)
        .floor(1)
        .address("qabanbay batyr 48")
        .complex("sat-ns")
        .comfortClass("basic")
        .moveInReady(false)
        .build();

        System.out.println(averageApartment);
        System.out.println();

        LuxuryApartmentBuilder luxBuilder = new LuxuryApartmentBuilder();
        Apartment luxApartment = luxBuilder
        .squareMeters(85)
        .floor(5)
        .address("mangilik el")
        .complex("bi group")
        .comfortClass("Luxury")
        .hasConcierge(true)
        .hasSmartHome(true)
        .moveInReady(false)
        .build();

        System.out.println(luxApartment);
    }
}
