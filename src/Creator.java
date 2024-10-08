public class Creator {
    // Method to create and link rooms, forming the map of the game
    public Room map() {
        // Creating rooms with names and descriptions
        Room room1 = new Room("The Bleeding Gate ", // Using a constructor i create room1 with name and description
                "A massive, bloodstained gate stands half-open, emitting a faint metallic screech as if warning you to stay away.");
        Room room2 = new Room("The Hollow Cavern ",
                "A cavern of shifting shadows and damp walls, where unseen whispers echo from the darkness.");
        Room room3 = new Room("Cursed Miner's Quarters ",
                "Abandoned bunks, haunted by shifting shadows, bear desperate claw marks scratched into the stone." );
        Room room4 = new Room("The Forgotten Shrine ",
                "An altar wrapped in pulsing black veins, exuding a suffocating aura of hunger and despair.");
        Room room5 = new Room("The Abyssal Lair ",
                "A pit of writhing shadows and skeletal remains, from which something ancient and hungry stirs beneath the surface.");
        Room room6 = new Room("The Graven Crypts ",
                "Open coffins line the walls, faint scratching sounds emerging from within the brittle bones.");
        Room room7 = new Room("The Maw of Chains ",
                "Endless chains sway from the ceiling, rattling as if guided by invisible hands above fragmented remains.");
        Room room8 = new Room("The Blighted Workshop ",
                "Tools covered in black slime lie scattered across the floor, and horrific machines wait silently in the shadows.");
        Room room9 = new Room("The Unholy Forge ",
                "A cold forge oozes black sludge, with twisted weapons discarded amid eerie chanting from the unseen darkness.");

        // Creating items with long and short names
        Item lamp = new Item("a shiny lamp", "lamp"); // Using a constructor i made an item, with a name and a long name
        Item sword = new Item("a nice sword","sword");

        // Creating food items with long, short names, health or damage
        Food cherry = new Food("a red cherry", "cherry", 25.0);
        Food apple = new Food("a green shiny apple, looks poisened", "apple", -25.0);
        Food shrooms = new Food("black shrooms", "", -45.0);

        // Creating liquid items with a, short names, health or damage
        Liquid beer = new Liquid("an icecold beer", "beer ", 10);
        Liquid water = new Liquid("very dirty water", "water", -5.0);

        // Creating melee weapons with a short, long name and damage
        MeleeWeapon speer = new MeleeWeapon("an old and rusty speer", "speer",10.0);
        MeleeWeapon axe = new MeleeWeapon("big and bloody axe", "axe",15.0);
        MeleeWeapon ratclaw = new MeleeWeapon("dirty rat claw", "ratclaw", 5.0);

        // Creating ranged weapons with a short, long name, damage, and ammo/uses
        RangedWeapon bow = new RangedWeapon("a half rotten bow", "bow", 5.0,5 );
        RangedWeapon ratcannon = new RangedWeapon("a cannon that shoots rats", "ratcannon", 10, 1000);
        RangedWeapon staff = new RangedWeapon("a cursed staff", "staff", 10, 1000);


        // Creating enemies with a name, health and a weapon
        Enemy goblin = new Enemy("Goblin", 10, bow);
        Enemy rat = new Enemy("Rat", 5.0, ratclaw);
        Enemy ogre = new Enemy("Ogre", 25.0, axe );
        Enemy witch = new Enemy("Witch", 25, staff);
        Enemy ratking = new Enemy("Ratking", 50, ratcannon);


        // Adding items to specific rooms

        // Adding food items to the rooms
        room1.addItem(cherry);
        room2.addItem(apple);
        room3.addItem(shrooms);

        // Adding liquid items to the rooms
        room1.addItem(beer);
        room1.addItem(water);

        // Adding enemys to the rooms
        room1.addEnemy(rat);
        room3.addEnemy(ogre);
        room4.addEnemy(goblin);
        room8.addEnemy(witch);
        room5.addEnemy(ratking);

        // Adding items to the rooms
        room1.addItem(speer);
        room1.addItem(bow);


        // Setting the map layout by connecting rooms
        room1.setEast(room2);
        room1.setSouth(room4);

        room2.setWest(room1);
        room2.setEast(room3);

        room3.setWest(room2);
        room3.setSouth(room6);

        room4.setNorth(room1);
        room4.setSouth(room7);

        room5.setSouth(room8);

        room6.setNorth(room3);
        room6.setSouth(room9);

        room7.setNorth(room4);
        room7.setEast(room8);

        room8.setWest(room7);
        room8.setEast(room9);

        room9.setNorth(room6);
        room9.setWest(room8);

        // Return the starting room (room1)
        return room1;

    }
}
