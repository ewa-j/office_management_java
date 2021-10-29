package office_management_java;

import java.util.ArrayList;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Office {

  ArrayList<Room> rooms;
  Room room;

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
}
