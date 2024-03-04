import java.util.LinkedList;

public class Delivery {
    int totalTravel = 1;
    public void deliver(LinkedList<Location> locations, LinkedList<Drone> drones) {
        int currentWeight = 0;

        String locationFirst = locations.getFirst().name;

        LinkedList<Location> visitedLocations = new LinkedList<>();



        /*for (Location location : locations) {
            for (Drone drone : drones) {
                if (location.name.equals(locationFirst)) {
                    currentWeight = drone.weight;
                    //System.out.println("Drone " + drone.name + " has " + currentWeight + " weight");
                    //continue;
                }

                if (drone.weight < location.weight && !visitedLocations.contains(location)) {
                    //System.out.println("Drone " + drone.name + " has no more weight to deliver");
                    drone.weight = currentWeight;
                    totalTravel += 1;
                }

                if (location.weight <= drone.weight && !visitedLocations.contains(location)) {
                    drone.weight -= location.weight;
                    visitedLocations.add(location);
                    System.out.println("Delivering " + location.name + " with " + drone.name + " on trip " + totalTravel);
                    break;
                }
            }
        }*/

        for (Drone drone : drones) {
            for (Location location : locations) {



                if (location.name.equals(locationFirst)) {
                    currentWeight = drone.weight;
                    //System.out.println("Drone " + drone.name + " has " + currentWeight + " weight");
                    //continue;
                }

                if (drone.weight < location.weight && !visitedLocations.contains(location)) {
                    //System.out.println("Drone " + drone.name + " has no more weight to deliver");
                    drone.weight = currentWeight;
                    //System.out.println("Drone " + drone.name + " has " + drone.weight + " weight");
                    if (drones.getLast().equals(drone)) {
                        if(!(visitedLocations.getLast().equals(locations.getLast()))){
                            totalTravel += 1;
                            for (Location location1 : visitedLocations) {
                                locations.remove(location1);
                            }
                            deliver(locations, drones);
                        }
                    }
                    break;
                }

                if (location.weight <= drone.weight && !visitedLocations.contains(location)) {
                    drone.weight -= location.weight;
                    visitedLocations.add(location);
                    System.out.println("Delivering " + location.name + " with " + drone.name + " on trip " + totalTravel);

                    //visitedLocations.remove(location);
                }else{

                }
            }
        }
        LinkedList<Drone> usedDrone = new LinkedList<>();
        //drone1 = 10
        //drone2 = 40

        //location1 = 30
        //location2 = 10
        //location3 = 5
        for (Drone drone : drones) {
            for (Location location : locations) {

            }
        }
    }


}
