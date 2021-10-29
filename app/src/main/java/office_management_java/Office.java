package office_management_java;

import java.util.jar.Attributes.Name;
import java.util.ArrayList;

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
}
