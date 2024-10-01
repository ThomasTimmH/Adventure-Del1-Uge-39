import java.util.ArrayList;

public class Room {
   private Room currentRoom;
   private String name;
   private String description;
   private Room east;
   private Room north;
   private Room west;
   private Room south;
   private ArrayList<Item> items; //liste af items i rummet

    public Room(String name, String description){
        this.name=name;
        this.description=description;
        this.items = new ArrayList<>();
    }

    public void addItem(Item item){
        items.add(item);
    }

    public void removeItem(Item item){
        items.remove(item);
    }

    public ArrayList<Item> getItems(){
        return items;
    }

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
        String itemList ="";
        if(!items.isEmpty()){
            itemList = "\nItems in the room "+items;
        }
        return "You are in" + name + description + itemList;
    }
}
