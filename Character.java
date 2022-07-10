import java.util.*;

public class Character {
    String name;
    Room currentRoom;
    Optional<Weapon> weapon = null;
    ArrayList<Weapon> inventory = new ArrayList<>();
    int health = 100;

    Character (String _name) {
        name = _name;
    }

    Character (String _name, Optional<Weapon> _weapon, ArrayList<Weapon> _inventory, int _health){
        name = _name;
        weapon = _weapon;
        inventory = _inventory;
        health = _health;
    }

    void enter(String startingRoom){   
        for (int i=0;i<GameMap.rooms.size();i++){
            if (startingRoom.equals(GameMap.rooms.get(i).name)){
                this.currentRoom = GameMap.rooms.get(i);
                GameMap.rooms.get(i).characters.add(this);
                CharactersManager.characters.add(this);
            }
        }
        System.out.println("YOU ARE ENTERING "+startingRoom.toUpperCase());
    }
}

