public interface ApartmentBuilder{
    ApartmentBuilder squareMeters(int squareMeters);
    ApartmentBuilder floor(int floor);
    ApartmentBuilder address(String address);
    ApartmentBuilder complex(String complex);
    ApartmentBuilder comfortClass(String comfortClass);
    ApartmentBuilder moveInReady(boolean moveInReady);        
    Apartment build();
}