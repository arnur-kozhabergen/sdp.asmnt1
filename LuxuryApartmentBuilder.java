public class LuxuryApartmentBuilder implements ApartmentBuilder{
    private int squareMeters, floor;
    private String address, complex, comfortClass;
    private boolean moveInReady, hasConcierge, hasSmartHome;

    
    public LuxuryApartmentBuilder squareMeters(int squareMeters) {
    this.squareMeters = squareMeters;
    return this;
    }
    
    public LuxuryApartmentBuilder floor(int floor) {
    this.floor = floor;
    return this;
    }
    
    public LuxuryApartmentBuilder address(String address) {
    this.address = address;
    return this;
    }
    
    public LuxuryApartmentBuilder complex(String complex) {
    this.complex = complex;
    return this;
    }
    
    public LuxuryApartmentBuilder comfortClass(String comfortClass) {
    this.comfortClass = comfortClass;
    return this;
    }
    
    public LuxuryApartmentBuilder moveInReady(boolean moveInReady) {
    this.moveInReady = moveInReady;
    return this;
    }
  
    public LuxuryApartmentBuilder hasConcierge(boolean hasConcierge) {
        this.hasConcierge = hasConcierge;
        return this;
    }
  
    public LuxuryApartmentBuilder hasSmartHome(boolean hasSmartHome){
        this.hasSmartHome = hasSmartHome;
        return this;
    }

    @Override
    public Apartment build() {
        return new Apartment(squareMeters, floor, address, complex, comfortClass, moveInReady, hasConcierge, hasSmartHome);
    }

}
