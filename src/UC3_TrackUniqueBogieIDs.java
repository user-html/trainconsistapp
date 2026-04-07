import java.util.HashSet;
import java.util.Set;

/**
 * UC3: Track Unique Bogie IDs (Set – HashSet)
 *
 * Drawback of UC2:
 *   In UC2, bogies are stored in a List which allows duplicate values.
 *   Two bogies could accidentally be registered with the same ID (e.g., BG101, BG101).
 *   This violates business rules and can cause inconsistent train formation.
 *   UC3 addresses this by using the Set data structure to enforce uniqueness.
 *
 * Concepts Demonstrated:
 * 1. Set Interface           – Collection type that does not allow duplicate elements.
 * 2. HashSet                 – Implementation of Set that stores elements using hashing
 *                              for fast access.
 * 3. add() Method            – Inserts values into the set; returns false if duplicate.
 * 4. Automatic Deduplication – HashSet ensures uniqueness without manual checks.
 * 5. Unordered Storage       – Elements are not stored using index positions.
 *
 * Flow:
 *   1. User adds bogie IDs (including duplicates intentionally)
 *   2. System inserts into HashSet
 *   3. Duplicates are ignored
 *   4. Unique IDs are displayed
 */
public class UC3_TrackUniqueBogieIDs {

    public static void main(String[] args) {

        // ----- Step 1: Print Header -----
        System.out.println("==============================================");
        System.out.println("    === Train Consist Management App ===      ");
        System.out.println("==============================================");
        System.out.println();

        System.out.println("==============================================");
        System.out.println(" UC3: Track Unique Bogie IDs (HashSet)        ");
        System.out.println("==============================================");
        System.out.println();

        // ----- Step 2: Create a HashSet for Bogie IDs -----
        // Using the Set interface (abstraction) with HashSet (implementation).
        // HashSet is chosen because:
        //   - It does not allow duplicate elements.
        //   - It uses hashing for fast O(1) average-time insertions and lookups.
        //   - It automatically enforces uniqueness without manual checks.
        Set<String> bogieIDs = new HashSet<>();

        // ----- Step 3: Add Bogie IDs (including duplicates intentionally) -----
        // The add() method returns true if the element was added successfully,
        // and false if the element already exists in the set.
        System.out.println(">> Attempting to add bogie IDs...");
        System.out.println();

        boolean added1 = bogieIDs.add("BG101");
        System.out.println("   add(\"BG101\") -> " + added1);

        boolean added2 = bogieIDs.add("BG102");
        System.out.println("   add(\"BG102\") -> " + added2);

        boolean added3 = bogieIDs.add("BG103");
        System.out.println("   add(\"BG103\") -> " + added3);

        // Intentional duplicate additions
        boolean added4 = bogieIDs.add("BG101");  // Duplicate!
        System.out.println("   add(\"BG101\") -> " + added4 + "  [DUPLICATE - ignored]");

        boolean added5 = bogieIDs.add("BG102");  // Duplicate!
        System.out.println("   add(\"BG102\") -> " + added5 + "  [DUPLICATE - ignored]");

        System.out.println();

        // ----- Step 4: Display the Set -----
        // Observe that duplicates are removed automatically.
        // Note: HashSet does NOT maintain insertion order.
        System.out.println("--- Unique Bogie IDs in Consist ---");
        System.out.println("Total Unique Bogies : " + bogieIDs.size());
        System.out.println("Bogie IDs           : " + bogieIDs);
        System.out.println();

        // ----- Step 5: Demonstrate why Set over List -----
        System.out.println(">> Observation:");
        System.out.println("   - 5 add() calls were made.");
        System.out.println("   - Only " + bogieIDs.size() + " unique bogie IDs are stored.");
        System.out.println("   - Duplicates (BG101, BG102) were automatically rejected.");
        System.out.println("   - No manual duplicate-checking code was needed!");
        System.out.println();

        System.out.println(">> UC3 operations completed successfully.");
        System.out.println("==============================================");
    }
}
