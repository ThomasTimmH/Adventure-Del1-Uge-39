import java.util.Scanner;

public class UI {
    Scanner scan = new Scanner(System.in);


    public String input(){
        return scan.nextLine();
    }

    public int inputINT(){
        return scan.nextInt();
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
        System.out.println("Welcome to the room");
        System.out.println("Go to help commands to see how you use commands");
        System.out.println("Game menu");
        System.out.println("Press 1 to start the game");
        System.out.println("Press 2 to exit the game");
        System.out.println("Press 3 to see help commands");
    }

    public void printMSG(String msg){
        System.out.println(msg);
    }

    public void printMSGRoom(Room msg){
        System.out.println(msg);
    }
}





