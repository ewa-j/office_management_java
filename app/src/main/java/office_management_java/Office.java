package office_management_java;

import java.util.ArrayList;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Office {

  public Room room;
  public ArrayList<Room> rooms;

  public Office() {
    rooms = new ArrayList<Room>();
    room = new Room(null);
  }

  public Room add(Room room) {
    rooms.add(room);
    return room;
  }

  public ArrayList<Room> listRooms() {
    return rooms;
  }

  public ArrayList<Room> listAvailableRooms() {
    Predicate<Room> byAvailability = room -> room.available == true;
    var availableRooms = rooms.stream().filter(byAvailability).collect(Collectors.toList());
    return (ArrayList<Room>) availableRooms;
  }

  public static void main(String[] args) {

  }
}
