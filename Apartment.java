public class Apartment{
    private final int squareMeters, floor;
    private final String address, complex, comfortClass;
    private final boolean moveInReady;

    Apartment(int squareMeters, int floor, String address, String complex, String comfortClass, boolean moveInReady){
        this.squareMeters = squareMeters;
        this.floor = floor;
        this.address = address;
        this.complex = complex;
        this.comfortClass = comfortClass;
        this.moveInReady = moveInReady;
    }

    @Override
    public String toString(){
        return "Apartment has " + squareMeters + " sq.m. on the " + floor + " floor in " +
        comfortClass + complex + " complex located in " + address + " that is " + (moveInReady? "move in ready" : "not ready for living");
    }

    public interface ApartmentBuilder{
        ApartmentBuilder squareMeters(int squareMeters);
        ApartmentBuilder floor(int floor);
        ApartmentBuilder address(String address);
        ApartmentBuilder complex(String complex);
        ApartmentBuilder comfortClass(String comfortClass);
        ApartmentBuilder moveInReady(boolean moveInReady);        
    }


}

