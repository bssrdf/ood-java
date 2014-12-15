public enum VehicleSize{Motorcycle, Compact, Large}
public abstract class Vehicle{
    protected ArrayList<ParkingSpot> parkingSpots = new ArrayList<ParkingSpot>();
    protected String licensePlate;
    protected int spotsNeeded;
    protected VehicleSize size;

    public int getSpotsNeeded(){return spotsNeeded;}
    public VehicleSize getSize(){return size;}

    public void parkInSpot(ParkingSpot s){ parkingSpots.add(s);}
    public void clearSpots(){}
    public abstract boolean canFitInSpot(ParkingSpot spot);
}

public class Bus extends Vehicle{
    public Bus(){
        spotsNeeded = 5;
        size = VehicleSize.Large;
    }
    public boolean canFitInSpot(ParkingSpot spot){}
}

public class Car extends Vehicle{
    public Car(){
        spotsNeeded = 1;
        size = VehicleSize.Compact;
    }
    public boolean canFitInSpot(ParkingSpot spot){};    
}

public class Motorcycle extends Vehicle{
    public Motorcycle(){
        spotsNeeded = 1;
        size = VehicleSize.Motorcycle;
    }
    public boolean canFitInSpot(ParkingSpot spot){};
}

public class ParkingSpot{
    private Vehicle vehicle;
    private VehicleSize spotSize;
    private int row;
    private int spotNumber;
    private Level level;
    public ParkingSpot(Level lvl, int r, int n, VehicleSize s){}
    public boolean isAvailable(){ return vehicle == null;}
    public boolean canFitVehicle(Vehicle vehicle){}
    public boolean park(Vehicle v){}
    public int getRow(){}
    public int getSpotNumber(){}
    public void removeVehicle(){}
}

public class Level{
    private int floor;
    private ParkingSpot[] spots;
    private int availableSpots = 0;
    private static final int SPOTS_PER_ROW = 10;
    public Level(int flr, int numberSpots){}
    public int availableSpots(){ return availableSpots;}
    public boolean parkVehicle(Vehicle vehicle){}
    private boolean parkStartingAtSpot(int num, Vehicle v){}
    private int findAvailableSpots(Vehicle vehicle){}
    public void spotFreed(){ availableSpots++;}
}

public class ParkingLot{
    private Level[] levels;
    private final int NUM_LEVELS = 5;
    public ParkingLot(){}
    public boolean parkVehicle(Vehicle vehicle){}
}
