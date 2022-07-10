import java.util.*;

class Main {
    public static void main (String args[]) {
        //initiate the GameMap 
        GameMap.read();
        
        // Make the player
        Scanner scanner = new Scanner(System.in);
        System.out.println("WELCOME TO MUD!!");
        System.out.print("ENTER YOUR CHARACTER NAME (type quit to quit): ");
        String name = scanner.nextLine().trim();
        Character player = new Character(name);

        //Getting player into a room
        System.out.print("ENTER THE ROOM YOU WANT TO ENTER: ");
        String startingRoom = scanner.nextLine().trim().toLowerCase();
        player.enter(startingRoom);  
        ArrayList<String> roomNames = new ArrayList<>(); // 
        GameMap.rooms.forEach(r->{
            roomNames.add(r.name.toLowerCase());
        });
        while(!roomNames.contains(startingRoom)){
            System.out.print("INVALID. ENTER A VALID ROOM: ");
            startingRoom = scanner.nextLine().trim().toLowerCase();
        }

        //reading commands for the main game loop
        System.out.print("ENTER NEXT COMMAND (type quit to quit): ");
        String input = scanner.nextLine();
        if (input.equals("quit")){
            System.out.println("MUD ended");
            scanner.close();
            System.exit(0);
        } else {
            while (!input.equals("quit")){

                // HANDLING THE INPUT HERE
                
                System.out.print("ENTER NEXT COMMAND (type quit to quit): ");
                input = scanner.nextLine();
                System.out.println(input);
                
            }  
        }
        
        System.out.println(GameMap.rooms.get(1).getClass());
        
    }
}

/*
 * To do list:
 * 1/ look() method for Character. It's going to print out the Current Room with description, exits, weapons and characters except the player itself.
 * 2/ goTo(String room). Set the player to a new room the new room is in the Current Room's exit. Otherwise, tell the player that he/she cannot go to that room.
 * 3/ pick(String weapon). Allow player to pick up weapon in the room. If there's no such weapon in the room, tell him/her. 
 *    If he/she is holding a weapon, put old weapon into Inventory, and have him/her hold the new weapon
 * 4/ check(). List out things in the inventory
 * 5/ 2 NPCs
 * 6/ Have WeaponsManager added new weapons when the rooms are read from Rooms.txt
 * 7/ battle(String character)
 */