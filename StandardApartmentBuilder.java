public class StandardApartmentBuilder implements ApartmentBuilder{
    private int squareMeters, floor;
    private String address, complex, comfortClass;
    private boolean moveInReady;

    @Override
    public ApartmentBuilder squareMeters(int squareMeters) {
    this.squareMeters = squareMeters;
    return this;
    }
    @Override
    public ApartmentBuilder floor(int floor) {
    this.floor = floor;
    return this;
    }
    @Override
    public ApartmentBuilder address(String address) {
    this.address = address;
    return this;
    }
    @Override
    public ApartmentBuilder complex(String complex) {
    this.complex = complex;
    return this;
    }
    @Override
    public ApartmentBuilder comfortClass(String comfortClass) {
    this.comfortClass = comfortClass;
    return this;
    }
    @Override
    public ApartmentBuilder moveInReady(boolean moveInReady) {
    this.moveInReady = moveInReady;
    return this;
    }

    @Override
    public Apartment build() {
    return new Apartment(squareMeters, floor, address, complex, comfortClass, moveInReady, false, false);
    }

}
