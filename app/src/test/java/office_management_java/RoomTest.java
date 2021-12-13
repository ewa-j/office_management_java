package office_management_java;


import org.junit.Test;
import static org.junit.Assert.*;

public class RoomTest {

    @Test
    public void roomIsAvailableByDefault() {
        Room roomOne = new Room("one");
        assertTrue(roomOne.available);
    }

    @Test
    public void roomHasAName() {
        Room roomOne = new Room("one");
        assertEquals(roomOne.roomName, "one");
    }

    @Test
    public void enteringAvailableRoomMakesItUnavailable() throws Exception {
        Room roomOne = new Room("one");
        roomOne.enterRoom();
        assertFalse(roomOne.available);
    }

    @Test
    public void enteringUnavailableRoomThrowsException() {
        Throwable exception = assertThrows(
                Exception.class, () -> {
                    Room roomOne = new Room("one");
                    roomOne.enterRoom();
                    roomOne.enterRoom();
                }
        );
        assertEquals("Room not available.", exception.getMessage());
    }

    @Test
    public void leavingUnavailableRoomMakesItAvailable() throws Exception {
        Room roomOne = new Room("one");
        roomOne.enterRoom();
        roomOne.leaveRoom();
        assertTrue(roomOne.available);
    }

}