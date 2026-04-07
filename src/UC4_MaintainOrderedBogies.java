import java.util.LinkedList;

/**
 * UC4: Maintain Ordered Bogie IDs (LinkedList)
 *
 * Drawback of UC3:
 *   In UC3, HashSet ensured uniqueness but does not preserve order.
 *   A train consist must follow a physical sequence:
 *     Locomotive -> Passenger -> Cargo -> Guard Coach.
 *   With HashSet, the arrangement becomes unpredictable.
 *   UC4 addresses this by using LinkedList which maintains insertion order
 *   and supports efficient insertions/deletions at any position.
 *
 * Concepts Demonstrated:
 * 1. LinkedList         – A doubly linked list implementation of the List interface
 *                         where elements are connected using node references.
 * 2. Node Structure     – Each element contains data and links to previous and next
 *                         nodes, enabling efficient insertions and deletions.
 * 3. addFirst()/addLast() – Methods to attach bogies at the beginning or end.
 * 4. add(index, element)  – Inserts a bogie in the middle of the consist.
 * 5. removeFirst()/removeLast() – Detaches bogies from the head or tail.
 * 6. Order Preservation – Maintains the physical sequence of train bogies.
 *
 * Flow:
 *   1. User adds bogie IDs
 *   2. System inserts into LinkedList
 *   3. Bogies are inserted at specific positions
 *   4. Bogies are removed from head/tail
 *   5. Final ordered consist is displayed
 */
public class UC4_MaintainOrderedBogies {

    public static void main(String[] args) {

        // ----- Step 1: Print Header -----
        System.out.println("==============================================");
        System.out.println("    === Train Consist Management App ===      ");
        System.out.println("==============================================");
        System.out.println();

        System.out.println("==============================================");
        System.out.println(" UC4: Maintain Ordered Bogies (LinkedList)    ");
        System.out.println("==============================================");
        System.out.println();

        // ----- Step 2: Create a LinkedList for the Consist -----
        // LinkedList is chosen over ArrayList because:
        //   - It models real-world chaining behavior (like train bogies).
        //   - Insertions/deletions at head, tail, or middle are O(1) once positioned.
        //   - Each node links to previous and next, like physical couplers.
        LinkedList<String> consist = new LinkedList<>();

        // ----- Step 3: Add Bogies using addLast() -----
        // addLast() appends elements to the end, building the train sequentially.
        consist.addLast("Engine");
        consist.addLast("Sleeper");
        consist.addLast("AC");
        consist.addLast("Cargo");
        consist.addLast("Guard");

        System.out.println(">> Added bogies using addLast():");
        System.out.println("   Engine -> Sleeper -> AC -> Cargo -> Guard");
        System.out.println();

        System.out.println("--- Consist After Initial Formation ---");
        System.out.println("Total Bogies : " + consist.size());
        System.out.println("Bogie List   : " + consist);
        System.out.println();

        // ----- Step 4: Insert a Pantry Car at position 2 using add(index, element) -----
        // The add(index, element) method inserts at the specified position,
        // shifting subsequent elements to the right.
        // This simulates attaching a Pantry Car between Sleeper and AC.
        consist.add(2, "Pantry Car");

        System.out.println(">> Inserted 'Pantry Car' at position 2");
        System.out.println("   (Between Sleeper and AC)");
        System.out.println();

        System.out.println("--- Consist After Inserting Pantry Car ---");
        System.out.println("Total Bogies : " + consist.size());
        System.out.println("Bogie List   : " + consist);
        System.out.println();

        // ----- Step 5: Remove first and last bogie -----
        // removeFirst() detaches the head (Engine).
        // removeLast() detaches the tail (Guard).
        String removedFirst = consist.removeFirst();
        System.out.println(">> Removed first bogie : " + removedFirst);

        String removedLast = consist.removeLast();
        System.out.println(">> Removed last bogie  : " + removedLast);
        System.out.println();

        // ----- Step 6: Display Final Ordered Train Consist -----
        System.out.println("--- Final Ordered Train Consist ---");
        System.out.println("Total Bogies : " + consist.size());
        System.out.println("Bogie List   : " + consist);
        System.out.println();

        // ----- Step 7: Show LinkedList vs ArrayList advantage -----
        System.out.println(">> Observation:");
        System.out.println("   - LinkedList preserves insertion order (unlike HashSet).");
        System.out.println("   - addFirst()/addLast() allow head/tail operations.");
        System.out.println("   - add(index, element) inserts at any position.");
        System.out.println("   - removeFirst()/removeLast() efficiently detach bogies.");
        System.out.println("   - Models real-world train chaining behavior.");
        System.out.println();

        System.out.println(">> UC4 operations completed successfully.");
        System.out.println("==============================================");
    }
}
