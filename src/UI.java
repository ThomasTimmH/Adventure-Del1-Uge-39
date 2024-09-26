import java.util.Scanner;

public class UI {
    Scanner scan = new Scanner(System.in);
    String displayUI;
    boolean directionMenu = false;
    String lookAround = "look";
    Room room = new Room();
    private Adventure adventure;

    public UI (Adventure adventure){
        this.adventure=adventure;
    }

    public void setDisplayUI(){
        boolean inMenu = true;
        while (inMenu){
        System.out.println("Welcome to the room");
        System.out.println("Go to help commands to see how you use commands");
        System.out.println("Game menu");
        System.out.println("Press 1 to start the game");
        System.out.println("Press 2 to exit the game");
        System.out.println("Press 3 to see help commands");
        int menuChoice = scan.nextInt();
        scan.nextLine();
        switch (menuChoice) {
            case 1 -> {
                directionMenu = true;
                inMenu = false;
            }

            case 2 -> {
                System.out.println("Game over");
                inMenu = false;
            }
            case 3 -> {
                System.out.println("Write 'go east' to go east");
                System.out.println("Write 'go south' to go south");
                System.out.println("Write 'go west' to go west");
                System.out.println("Write 'go north' to go north");
                System.out.println("If you are in a room, write look to look around, press any other key to go further");
                System.out.println("When the game is started you can write help to see the help commands");
                System.out.println("When you are in a game write exit to exit the game");
            }
            default -> System.out.println("Invalid option");
        }
        }

        while(directionMenu) {
            Room nextRoom = null;
            System.out.println("Now you have to decide where you wanna go");
            String directionChoice = scan.nextLine();
            switch (directionChoice.toLowerCase()) {
                case "go east" -> {
                    System.out.println(adventure.move("go east"));
                }
                case "go south" -> System.out.println(adventure.move("go south"));

                case "go west" -> System.out.println(adventure.move("go west"));

                case "go north" -> System.out.println(adventure.move("go north"));

                case "look" -> {
                    if (directionChoice.equalsIgnoreCase(lookAround)) {
                        System.out.println(adventure.lookAround());
                    }
                }
                case "exit" -> {
                    System.out.println("Game over goodbye");
                    directionMenu = false;
                }
                case "help" -> {
                    System.out.println("Write 'go east' to go east");
                    System.out.println("Write 'go south' to go south");
                    System.out.println("Write 'go west' to go west");
                    System.out.println("Write 'go north' to go north");
                    System.out.println("If you are in a room, write look to look around, press any other key to go further");
                    System.out.println("When the game is started you can write help to see the help commands");
                    System.out.println("When you are in a game write exit to exit the game");
                }



            }
            }



        }



        }





