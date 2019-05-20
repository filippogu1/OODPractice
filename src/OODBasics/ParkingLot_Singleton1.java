package OODBasics;

import java.util.ArrayList;
import java.util.List;

public class ParkingLot_Singleton1 {

    // Pattern 1 - thread-safe singleton
    private static ParkingLot_Singleton1 _instance = null;
    private List<Integer> levels;
    private ParkingLot_Singleton1() {
        levels = new ArrayList<>();
    }
    public static synchronized ParkingLot_Singleton1 getInstance() {
        if (_instance == null) {
            _instance = new ParkingLot_Singleton1();
        }
        return _instance;
    }

}
