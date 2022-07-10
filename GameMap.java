import java.util.*;
import java.io.*;

public class GameMap {
    // Setting up the GameMap
    static ArrayList<Room> rooms;
    static void read(){
        ArrayList<Room> _rooms = new ArrayList<>();
        try {
            Scanner sc = new Scanner(new File("Rooms.txt"));
            while (sc.hasNext()) {
                //Read in name and description
                String name = sc.nextLine();
                String description = sc.nextLine();
                
                //Read in the exits
                List _exits = Arrays.asList(sc.nextLine().split(","));
                ArrayList<String> exits = new ArrayList<>();
                _exits.forEach(e -> {
                    exits.add(e.toString());
                });

                //Read in the weapons
                List _weapons = Arrays.asList(sc.nextLine().split(","));
                ArrayList<Weapon> weapons = new ArrayList<>();

                _weapons.forEach(w -> {
                    weapons.add(new Weapon(w.toString().split("-")[0].toString(), Integer.valueOf(w.toString().split("-")[1]), Integer.valueOf(w.toString().split("-")[2])));
                });
                
                // Read the characters
                ArrayList<Character> characters = new ArrayList<>();

                // Add the room
                _rooms.add(new Room(name, description, exits, weapons,characters));
            }
            sc.close();
            rooms = _rooms;
        } catch (FileNotFoundException e1) {
            e1.printStackTrace();
        }
    }
}
