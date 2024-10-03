import java.util.ArrayList;

public class Room {
   private Room currentRoom; // the room's reference to itself
   private String name; // Name of the room
   private String description; // Description of the room
   private Room east, north, west, south; // Directions to other rooms
   private ArrayList<Item> items; // List of items in the room

    // Constructor to create a room with a name and description
    public Room(String name, String description){
        this.name=name;
        this.description=description;
        this.items = new ArrayList<>();
    }

    // Method to add an item to the room
    public void addItem(Item item){
        items.add(item);
    }

    // Method to remove an item from the room
    public void removeItem(Item item){
        items.remove(item);
    }

    // Method to get all items in the room
    public ArrayList<Item> getItems(){
        return items;
    }

    // Method to find a specific item in the room by short name
    public Item findItem(String itemName){
        for(Item item : items){
            if(item.getShortName().equalsIgnoreCase(itemName)){
                return item;
            }
        }
        return null;
    }

    public Room(){

    }

    public Room getCurrentRoom() {
        return currentRoom;
    }

    public void setCurrentRoom(Room currentRoom) {
        this.currentRoom = currentRoom;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    // Getters and setters for room directions
    public void setEast(Room room) { this.east = room; }
    public void setNorth(Room room) { this.north = room; }
    public void setWest(Room room){ this.west= room; }
    public void setSouth(Room room) { this.south = room; }

    public Room getEast() { return east; }
    public Room getNorth() { return north; }
    public Room getWest() { return west; }
    public Room getSouth() { return south; }

    // toString method to return room details and items
    public String toString(){
        String itemList ="";
        if(!items.isEmpty()){
            itemList = "\nItems in the room "+items;
        }
        return "You are in " + name + description + itemList;
    }
}
