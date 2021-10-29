/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package office_management_java;

public class App {
    public String getGreeting() {
        return "Welcome to the office!";
    }

    public static void main(String[] args) throws Exception {
        System.out.println(new App().getGreeting());

        Office office = new Office();
        Room blueRoom = new Room("blue");
        System.out.println(office.add(blueRoom));
        System.out.println(office.listRooms());
        System.out.println(office.listAvailableRooms());
        System.out.println(blueRoom.enterRoom());
        System.out.println(office.listAvailableRooms());
        System.out.println(blueRoom.enterRoom());
    }
}
