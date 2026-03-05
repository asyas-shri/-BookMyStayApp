
public class BookMyStayApp {

    /**
     * Inventory class responsible for managing room availability
     */
    static class RoomInventory {

        private HashMap<String, Integer> inventory;

        /**
         * Constructor initializes the room availability
         */
        public RoomInventory() {
            inventory = new HashMap<>();

            inventory.put("Single Room", 5);
            inventory.put("Double Room", 3);
            inventory.put("Suite Room", 2);
        }

        /**
         * Get availability of a room type
         */
        public int getAvailability(String roomType) {
            return inventory.getOrDefault(roomType, 0);
        }

        /**
         * Update availability of a room type
         */
        public void updateAvailability(String roomType, int count) {
            inventory.put(roomType, count);
        }

        /**
         * Display all room inventory
         */
        public void displayInventory() {
            System.out.println("\nCurrent Room Inventory:");

            for (Map.Entry<String, Integer> entry : inventory.entrySet()) {
                System.out.println(entry.getKey() + " : " + entry.getValue() + " rooms available");
            }
        }
    }

    /**
     * Application entry point
     */
    public static void main(String[] args) {

        System.out.println("=======================================");
        System.out.println("        Book My Stay App               ");
        System.out.println("     Hotel Booking System v1.0         ");
        System.out.println("=======================================");

        // Initialize centralized inventory
        RoomInventory inventory = new RoomInventory();

        // Display initial inventory
        inventory.displayInventory();

        // Example update
        System.out.println("\nUpdating Single Room availability...");
        inventory.updateAvailability("Single Room", 4);

        // Display updated inventory
        inventory.displayInventory();

        System.out.println("\nApplication finished.");
    }
}