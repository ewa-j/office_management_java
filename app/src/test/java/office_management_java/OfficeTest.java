package office_management_java;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collections;

public class OfficeTest {

    @Test
    public void addTest() {
        ArrayList<Room> rooms = new ArrayList<Room>();
        Room roomOne = new Room("one");
        rooms.add(roomOne);
        Assertions.assertEquals(roomOne, roomOne);
    }

    @Test
    public void listOfRoomsIsEmptyAtFirst() {
        Office office = new Office();
        assertEquals(office.listAvailableRooms(), Collections.emptyList());
    }

    @Test
    public void listOfRoomsGetsPopulatedAfterAddingRoomsToTheOffice() throws Exception {
        Office office = new Office();
        ArrayList<Room> rooms = new ArrayList<Room>();
        Room roomOne = new Room("one");
        Room roomTwo = new Room("two");
        office.add(roomOne);
        office.add(roomTwo);
        rooms.add(roomOne);
        rooms.add(roomTwo);
        assertEquals(office.listAvailableRooms(), rooms);
    }

    @Test
    public void returnsOnlyAvailableRooms() throws Exception {
        Office office = new Office();
        ArrayList<Room> rooms = new ArrayList<Room>();
        Room roomOne = new Room("one");
        Room roomTwo = new Room("two");
        office.add(roomOne);
        office.add(roomTwo);
        roomOne.enterRoom();
        rooms.add(roomTwo);
        assertEquals(office.listAvailableRooms(), rooms);
    }

}