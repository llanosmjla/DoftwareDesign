import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Delivery delivery = new Delivery();
        LinkedList<Location> locations = new LinkedList<>();
        locations.add(new Location("Location 1", 110));
        locations.add(new Location("Location 2", 120));
        locations.add(new Location("Location 3", 130));

        locations.add(new Location("Location 4", 40));
        locations.add(new Location("Location 5", 50));
        locations.add(new Location("Location 6", 60));
        locations.add(new Location("Location 7", 70));

        LinkedList<Drone> drones = new LinkedList<>();
        drones.add(new Drone("Drone 1", 40));
        drones.add(new Drone("Drone 2", 70));
        drones.add(new Drone("Drone 3", 100));


        delivery.deliver(locations, drones);
    }
}