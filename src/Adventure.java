import java.util.Locale;
import java.util.Scanner;

public class Adventure {
    private Creator creator;
    private Room currentRoom;
    private UI ui;
    private Player player;

    public Adventure() {
        creator = new Creator();
        currentRoom = creator.map();
        player = new Player(currentRoom);
        ui = new UI(player);
    }

    public void setDisplayUI() {
        ui.setDisplayUI();
    }


   /* public void setDisplayUI() {
        boolean inMenu = true;
        while (inMenu) {
            ui.grettingsMSG();
            int menuChoice = ui.inputINT();
            ui.input();
            switch (menuChoice) {
                case 1 -> {
                    directionOptions();
                    inMenu = false;
                }

                case 2 -> {
                    System.out.println("Game over");
                    inMenu = false;
                }
                case 3 -> {
                    ui.helpMSG();
                }
                default -> System.out.println("Invalid option");
            }
        }
    }

    public void directionOptions() {
        boolean directionMenu = true;
        while (directionMenu) {
            Room nextRoom = null;
            ui.printMSG("Now you have to decide where you wanna go");
            String directionChoice = ui.input().toLowerCase();
            String[] words = directionChoice.split(" ");

            switch (words[0]) {
                case "go" -> player.move(directionChoice);
                case "inventory", "inv", "invent" -> ui.printMSG(player.showInventory());

                case "take" -> {
                    if(words.length > 1) {
                        Item item = player.getCurrentRoom().findItem(words[1]);
                        if (item != null) {
                            player.takeItem(item); // Player takes the item
                            player.getCurrentRoom().removeItem(item);
                            ui.printMSG("You have taken the " + item.getShortName());
                        } else {
                            ui.printMSG("There is nothing like "+ words[1] + "to take around here");
                        }
                    } else {
                        ui.printMSG("You need to specify an item to take.");
                    }
                }

                case "drop" -> {
                    if (words.length > 1) {
                    Item item = player.findInInventory(words[1]);
                    if(item != null){
                        player.dropItem(item);
                        ui.printMSG("You have dropped the " + item.getShortName());
                    } else {
                        ui.printMSG("You dont have anything like this" + words[1]+ " in your inventory");
                    }
                    } else {
                        ui.printMSG("you need to specify an item to drop  ");
                    }
                }
                case "look" -> ui.printMSG(player.lookAround());

                case "exit" -> {
                    ui.printMSG("Game over goodbye");
                    directionMenu = false;
                }
                case "help" -> {
                    ui.helpMSG();
                }
            }
        }
    } */
}



  /*  public void directionOptions() {
        boolean directionMenu = true;
        while (directionMenu) {
            Room nextRoom = null;
            ui.printMSG("Now you have to decide where you wanna go");
            String directionChoice = ui.input().toLowerCase();
            String[] words = directionChoice.split(" ");

            switch (directionChoice.toLowerCase()) {
                case "go east" -> player.move("go east");
                case "go south" -> player.move("go south");

                case "go west" -> player.move("go west");

                case "go north" -> player.move("go north");

                case "look" -> {
                    String lookAround = "look";
                    if (directionChoice.equalsIgnoreCase(lookAround)) {
                        ui.printMSG(player.lookAround());
                    }
                }
                case "exit" -> {
                    ui.printMSG("Game over goodbye");
                    directionMenu = false;
                }
                case "help" -> {
                    ui.helpMSG();
                }
            }
        }
    }
} */
