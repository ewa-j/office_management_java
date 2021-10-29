package office_management_java;

public class Room {

  boolean available;
  String roomName;

  public Room(String roomName) {
    this.roomName = roomName;
    available = true;
  }

  public boolean availability() {
    return available;
  }

  public void enterRoom() throws Exception {
    if (available) {
      available = false;
    } else {
      throw new Exception("Room not available.");
    }
  }

  public void leaveRoom() {
    available = true;
  }
}
