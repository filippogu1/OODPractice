package OODBasics;

public class ParkingLot_Singleton2 {

    // Pattern 2 - lazy-load singleton
    private ParkingLot_Singleton2() {}

    private static class LazyParkingLot {
        static final ParkingLot_Singleton2 _instance = new ParkingLot_Singleton2();
    }

    public static ParkingLot_Singleton2 getInstance() {
        return LazyParkingLot._instance;
    }
}
