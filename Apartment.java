public class Apartment{
    private final int squareMeters, floor;
    private final String address, complex, comfortClass;
    private final boolean moveInReady, hasConcierge, hasSmartHome;

    Apartment(int squareMeters, int floor, String address, String complex, 
        String comfortClass, boolean moveInReady, boolean hasConcierge, boolean hasSmartHome){
        this.squareMeters = squareMeters;
        this.floor = floor;
        this.address = address;
        this.complex = complex;
        this.comfortClass = comfortClass;
        this.moveInReady = moveInReady;
        this.hasConcierge = hasConcierge;
        this.hasSmartHome = hasSmartHome;
    }

    @Override
    public String toString(){
        return "Apartment has " + squareMeters + " sq.m. on the " + floor + " floor in " +
        comfortClass + complex + " complex located in " + address + " that is " + (moveInReady? "move in ready" : "not ready for living") +
        (hasConcierge? " and has concierge service" : " and does not have concierge service") +
        (hasSmartHome? " and has smart home features" : " and does not have smart home features");
    }


}

