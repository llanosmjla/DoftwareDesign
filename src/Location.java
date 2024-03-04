public class Location {
    String name;
    int weight;

    public Location(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    //setters and getters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void addWeight(int weight) {
        this.weight += weight;
    }


}
