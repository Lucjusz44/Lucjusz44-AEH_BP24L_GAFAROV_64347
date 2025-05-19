public class Main {

    // Inner class Warehouse
    static class Warehouse {
        private int warehouseNumber;
        private int totalSpace;
        private int occupiedSpace;
        private String ownerName;
        private String email;
        private String phoneNumber;

        public Warehouse(int warehouseNumber, int totalSpace, String ownerName, String email, String phoneNumber) {
            this.warehouseNumber = warehouseNumber;
            this.totalSpace = totalSpace;
            this.occupiedSpace = 0;
            this.ownerName = ownerName;
            this.email = email;
            this.phoneNumber = phoneNumber;
        }

        // Getters
        public int getWarehouseNumber() { return warehouseNumber; }
        public int getTotalSpace() { return totalSpace; }
        public int getOccupiedSpace() { return occupiedSpace; }
        public String getOwnerName() { return ownerName; }
        public String getEmail() { return email; }
        public String getPhoneNumber() { return phoneNumber; }

        // Setters
        public void setWarehouseNumber(int number) { warehouseNumber = number; }
        public void setTotalSpace(int space) { totalSpace = space; }
        public void setOwnerName(String name) { ownerName = name; }
        public void setEmail(String email) { this.email = email; }
        public void setPhoneNumber(String phone) { this.phoneNumber = phone; }

        // Methods
        public void addGoods(int amount) {
            if (occupiedSpace + amount <= totalSpace) {
                occupiedSpace += amount;
                System.out.println("Added " + amount + " units of goods. Remaining warehouse space: " + (totalSpace - occupiedSpace) + " units.");
            } else {
                System.out.println("Not enough space in the warehouse. Remaining warehouse space: " + (totalSpace - occupiedSpace) + " units.");
            }
        }

        public void removeGoods(int amount) {
            if (amount <= occupiedSpace) {
                occupiedSpace -= amount;
                System.out.println("Removed " + amount + " units of goods. Remaining warehouse space: " + (totalSpace - occupiedSpace) + " units.");
            } else {
                System.out.println("Not enough goods in the warehouse to remove.");
            }
        }

        public void checkOccupancy() {
            System.out.println("Occupied warehouse space: " + occupiedSpace + " units.");
            System.out.println("Available warehouse space: " + (totalSpace - occupiedSpace) + " units.");
        }

        public void updateContact(String newEmail, String newPhoneNumber) {
            this.email = newEmail;
            this.phoneNumber = newPhoneNumber;
            System.out.println("Owner's contact details updated.");
            System.out.println("New email: " + email);
            System.out.println("New phone number: " + phoneNumber);
        }
    }

    // Main function
    public static void main(String[] args) {
        Warehouse myWarehouse = new Warehouse(1, 5000, "John Doe", "john@example.com", "+48 000 000 000");

        myWarehouse.addGoods(3000);
        myWarehouse.removeGoods(1000);
        myWarehouse.addGoods(2500); // should display a warning
        myWarehouse.checkOccupancy();
        myWarehouse.updateContact("owner@magazyn.pl", "+48 123 456 789");
        myWarehouse.addGoods(600); // should fail again
    }
}
