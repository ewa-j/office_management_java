package office_management_java;

public class Room {

  public boolean available;
  public String roomName;

  public Room(String roomName) {
    this.roomName = roomName;
    available = true;
  }

  public boolean availability() {
    return available;
  }

  public boolean enterRoom() throws Exception {
    if (available) {
      available = false;
      return available;
    } else {
      throw new Exception("Room not available.");
    }
  }

  public void leaveRoom() {
    available = true;
  }

  public static void main(String[] args) {

  }
}
