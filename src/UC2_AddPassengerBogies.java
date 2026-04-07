import java.util.ArrayList;
import java.util.List;

/**
 * UC2: Add Passenger Bogies to Train (ArrayList Operations)
 *
 * Drawback of UC1:
 *   In UC1, the train consist is initialized but contains no bogies.
 *   There is no way to add, remove, or inspect bogies dynamically.
 *   UC2 addresses this by using ArrayList operations.
 *
 * Concepts Demonstrated:
 * 1. ArrayList      – A resizable collection that allows insertion and deletion at runtime.
 * 2. add() Method   – Inserts elements into the list.
 * 3. remove() Method – Deletes elements from the list.
 * 4. contains() Method – Checks whether a given element exists in the list.
 * 5. Insertion Order Preservation – ArrayList maintains the order in which elements are added.
 * 6. CRUD Operations – Create, Read, Update, Delete operations on collections.
 *
 * Flow:
 *   1. User runs program
 *   2. Passenger bogies are added (Sleeper, AC Chair, First Class)
 *   3. Bogies are displayed
 *   4. A bogie is removed (AC Chair)
 *   5. Existence is checked (Sleeper, AC Chair)
 *   6. Final list state is printed
 */
public class UC2_AddPassengerBogies {

    public static void main(String[] args) {

        // ----- Step 1: Print Header -----
        System.out.println("==============================================");
        System.out.println("    === Train Consist Management App ===      ");
        System.out.println("==============================================");
        System.out.println();

        // ----- Step 2: Initialize the Train Consist -----
        List<String> consist = new ArrayList<>();

        System.out.println("--- Initial Train Consist Summary ---");
        System.out.println("Total Bogies in Consist : " + consist.size());
        System.out.println("Consist Details         : " + consist);
        System.out.println();

        System.out.println(">> Train consist initialized successfully.");
        System.out.println(">> Ready for further operations...");
        System.out.println("==============================================");
        System.out.println();

        // ===================== UC2: Add Passenger Bogies =====================

        System.out.println("==============================================");
        System.out.println("  UC2: Add Passenger Bogies (ArrayList Ops)   ");
        System.out.println("==============================================");
        System.out.println();

        // ----- Step 3: Add Passenger Bogies using add() -----
        // The add() method appends elements to the end of the ArrayList.
        // Insertion order is preserved — bogies appear in the order they are added.
        consist.add("Sleeper");
        consist.add("AC Chair");
        consist.add("First Class");

        System.out.println(">> Added bogies: Sleeper, AC Chair, First Class");
        System.out.println();

        // ----- Step 4: Display consist after adding bogies -----
        System.out.println("--- Consist After Adding Bogies ---");
        System.out.println("Total Bogies : " + consist.size());
        System.out.println("Bogie List   : " + consist);
        System.out.println();

        // ----- Step 5: Remove a bogie using remove() -----
        // The remove() method deletes the first occurrence of the specified element.
        // Here we simulate detaching the "AC Chair" bogie from the train.
        consist.remove("AC Chair");

        System.out.println(">> Removed bogie: AC Chair");
        System.out.println();

        // ----- Step 6: Check if a bogie exists using contains() -----
        // The contains() method returns true if the list contains the specified element.
        boolean hasSleeper = consist.contains("Sleeper");
        System.out.println(">> Does 'Sleeper' exist in consist? " + hasSleeper);

        boolean hasACChair = consist.contains("AC Chair");
        System.out.println(">> Does 'AC Chair' exist in consist? " + hasACChair);
        System.out.println();

        // ----- Step 7: Display Final Consist State -----
        System.out.println("--- Final Train Consist ---");
        System.out.println("Total Bogies : " + consist.size());
        System.out.println("Bogie List   : " + consist);
        System.out.println();

        System.out.println(">> UC2 operations completed successfully.");
        System.out.println("==============================================");
    }
}
