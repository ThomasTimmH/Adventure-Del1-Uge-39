import java.util.ArrayList;

public class Player {
    private Room currentRoom; // The current room where the player is located
    private ArrayList<Item> inventory; // Players inventory
    private double life = 100;

    // constructor sets the starting room for the player
    public Player(Room startRoom) {
        this.currentRoom = startRoom;
        this.inventory = new ArrayList<>(); // Initialize an empty inventory
    }

    // Getter for the current room
    public Room getCurrentRoom(){
        return currentRoom;
    }

    // Method for taking an item, removing it from the room and adding it to the inventory
    public void takeItem(Item item){
        inventory.add(item);
        currentRoom.removeItem(item);
    }

    // Method for dropping an item, removing it from the inventory and adding it to the room
    public void dropItem(Item item){
        inventory.remove(item);
        currentRoom.addItem(item);
    }

    // Method to show the player's current inventory
    public String showInventory(){
        if(inventory.isEmpty()){
            return " Your inventory is empty";
        }
        return "You are carrying " + inventory;
    }

    // Method to find an item in the inventory by its short name
    public Item findInInventory(String shortName){
        for(Item item : inventory){
            if(item.getShortName().equalsIgnoreCase(shortName)){
                return item;
            }
        }
        return null; // Return null if item is not found
    }

    public void eatItem(Item item){
        if(item instanceof Food){
            this.life += ((Food) item).getHealthOrDamage();
            inventory.remove(item);
        }
    }

    // Method to move the player in a direction (north, south, east, west)
    public String move(String direction){
        Room nextRoom = null;
        switch (direction){
            case "go east" -> nextRoom = currentRoom.getEast();
            case "go west" -> nextRoom = currentRoom.getWest();
            case "go north" -> nextRoom = currentRoom.getNorth();
            case "go south" -> nextRoom = currentRoom.getSouth();
        }

        // If there is a room in the direction, move the player
        if (nextRoom != null){
            currentRoom=nextRoom;
            System.out.println(currentRoom.getName() + currentRoom.getDescription());
        } else {
            System.out.println("You cant go that way");
        }
        return "";
    }

    public double getLife() {
        return life;
    }

    // Method to look around the current room
    public String lookAround(){
        return currentRoom.toString();
    }

}
