public class Item {
    private String longName;  // Full name of the item
    private String shortName; // Short name of the item
    private double healthOrDamage;

    // Constructor to create an item with a long and a short name
    public Item(String longName, String shortName){
        this.longName=longName;
        this.shortName=shortName;
    }

    public Item (String longname, String shortName, double health){
        this.longName=longname;
        this.shortName=shortName;
        this.healthOrDamage=healthOrDamage;
    }

    // Getter for the full name of the item
    public String getLongName(){
        return longName;
    }

    // Getter for the short name of the item
    public String getShortName(){
        return shortName;
    }

    // toString method to return the full name when item is printed
    public String toString(){
        return longName;
    }

}
