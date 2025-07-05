import java.util.Random;

public class PassengerSource {
    private Company company;
    private Random random = new Random();

    public PassengerSource(Company company) {
        this.company = company;
    }

    public boolean requestPickup() {
        Location pickup = new Location(random.nextInt(101), random.nextInt(101));
        Location destination = new Location(random.nextInt(101), random.nextInt(101));
        Passenger passenger = new Passenger(pickup, destination);
        return company.scheduleVehicle(passenger);
    }
}

// Supporting classes below (in same file)

class Company {
    public boolean scheduleVehicle(Passenger p) {
        // simulate that a vehicle was successfully scheduled
        return true;
    }
}

class Passenger {
    private Location pickupLocation;
    private Location destination;

    public Passenger(Location pickupLocation, Location destination) {
        this.pickupLocation = pickupLocation;
        this.destination = destination;
    }
}

class Location {
    private int x;
    private int y;

    public Location(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
