public class Room {
   private Room currentRoom;
   private String name;
   private String description;
   private Room east;
   private Room north;
   private Room west;
   private Room south;

    public Room(String name, String description){
        this.name=name;
        this.description=description;
    }

    public Room(){

    }

    public Room getCurrentRoom() {
        return currentRoom;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public void setEast(Room room) {
        this.east = room;
    }

    public void setNorth(Room room) {
        this.north = room;
    }

    public void setWest(Room room){
        this.west= room;
    }


    public void setSouth(Room room) {
        this.south = room;
    }

    public Room getEast() {
        return east;
    }

    public Room getNorth() {
        return north;
    }

    public Room getWest() {
        return west;
    }

    public Room getSouth() {
        return south;
    }

    public String toString(){
        return "You are in" + name + description;
    }
}
