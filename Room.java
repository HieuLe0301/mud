import java.util.ArrayList;

public class Room {
    String name;
    String description;
    ArrayList<String> exits;
    ArrayList<Weapon> weapons;
    ArrayList<Character> characters; 

    Room(String _name, String _description, ArrayList<String> _exits, ArrayList<Weapon> _weapons, ArrayList<Character> _characters){
        this.name = _name;
        this.description = _description;
        this.exits = _exits;
        this.weapons = _weapons;
        characters = _characters;
    }
}

