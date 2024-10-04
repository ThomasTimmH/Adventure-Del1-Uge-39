import java.util.Scanner;

public class UI {
    Scanner scan = new Scanner(System.in);
    private Player player;

    public UI(Player player){
        this.player = player;
    }

    public String input(){
        return scan.nextLine();
    }

    public int inputINT(){
        return scan.nextInt();
    }

     public void setDisplayUI() {
        boolean inMenu = true;
        while (inMenu) {
            grettingsMSG();
            int menuChoice = inputINT();
            input();
            switch (menuChoice) {
                case 1 -> {
                    setDirectionOptions();
                    inMenu = false;
                }

                case 2 -> {
                    System.out.println("Game over");
                    inMenu = false;
                }
                case 3 -> {
                    helpMSG();
                }
                default -> System.out.println("Invalid option");
            }
        }
    }

    public void setDirectionOptions() {
        boolean directionMenu = true;
        while (directionMenu) {
            Room nextRoom = null;
            printMSG("Now you have to decide where you wanna go");
            String directionChoice = input().toLowerCase();
            String[] words = directionChoice.split(" ");

            switch (words[0]) {
                case "go" -> player.move(directionChoice);
                case "inventory", "inv", "invent" -> printMSG(player.showInventory());

                case "take" -> {
                    if(words.length > 1) {
                        Item item = player.getCurrentRoom().findItem(words[1]);
                        if (item != null) {
                            player.takeItem(item); // Player takes the item
                            player.getCurrentRoom().removeItem(item);
                            printMSG("You have taken the " + item.getShortName());
                        } else {
                            printMSG("There is nothing like "+ words[1] + " to take around here");
                        }
                    } else {
                        printMSG("You need to specify an item to take.");
                    }
                }

                case "drop" -> {
                    if (words.length > 1) {
                    Item item = player.findInInventory(words[1]);
                    if(item != null){
                        player.dropItem(item);
                        printMSG("You have dropped the " + item.getShortName());
                    } else {
                        printMSG("You dont have anything like this" + words[1]+ " in your inventory");
                    }
                    } else {
                        printMSG("you need to specify an item to drop  ");
                    }
                }
                case "look" -> printMSG(player.lookAround());

                case "exit" -> {
                    printMSG("Game over goodbye");
                    directionMenu = false;
                }

                case "health" -> {
                    if (player.getLife() > 75 ){
                        printMSG("You are in good health and are ready to fight");
                        printMSGDouble(player.getLife());
                    } if (player.getLife() > 50 && player.getLife() < 75 ){
                        printMSG("You are okay, but not ready for a fight");
                        printMSGDouble(player.getLife());
                    } if(player.getLife() > 25 && player.getLife() < 50){
                        printMSG("You are low on health and should find some food");
                        printMSGDouble(player.getLife());
                    } if(player.getLife() > 0 && player.getLife() < 25){
                        printMSG("you are really low");
                        printMSGDouble(player.getLife());
                    }
                }

                case "eat" -> {
                    if(words.length > 1){
                        Item item = player.findInInventory(words[1]);
                        if(item instanceof Food){
                            player.eatItem(item);
                            printMSG("You have eaten "+item);
                            printMSGDouble(player.getLife());
                        } else  {
                            printMSG("You cannot eat that item");
                        }
                    } else {
                        printMSG("You cannot eat that item");
                    }
                }
                case "drink" -> {
                    if(words.length > 1){
                        Item item = player.findInInventory(words[1]);
                        if(item instanceof Liquid){
                            player.drinkItem(item);
                            printMSG("You drank "+item);
                            printMSGDouble(player.getLife());
                        } else {
                            printMSG("You cannot drink this");
                        }
                    } else {
                        printMSG("you cannot drink that item");
                    }
                }

                case "help" -> {
                    helpMSG();
                }
            }
        }
    }

    public void helpMSG() {
        System.out.println("Write 'go east' to go east");
        System.out.println("Write 'go south' to go south");
        System.out.println("Write 'go west' to go west");
        System.out.println("Write 'go north' to go north");
        System.out.println("If you are in a room, write look to look around, press any other key to go further");
        System.out.println("When the game is started you can write help to see the help commands");
        System.out.println("When you are in a game write exit to exit the game");
    }

    public void grettingsMSG(){
        System.out.println("Dead Man's Shaft");
        System.out.println("Go to help commands to see how you use commands");
        System.out.println("Game menu");
        System.out.println("Press 1 to start the game");
        System.out.println("Press 2 to exit the game");
        System.out.println("Press 3 to see help commands");
    }

    public void printMSG(String msg){
        System.out.println(msg);
    }

    public void printMSGDouble(double msgd){
        System.out.println(msgd);
    }

    public void moreWords(){

    }

}





