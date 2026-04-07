import java.util.ArrayList;
import java.util.List;

/**
 * UC1: Initialize Train and Display Consist Summary
 *
 * Concepts Demonstrated:
 * 1. Class          – Container that holds the program's data and logic.
 * 2. Main Method    – Entry point of a Java application (public static void main).
 * 3. Static Keyword – Allows the JVM to invoke main() without creating an object.
 * 4. ArrayList      – A resizable list from the Collections Framework; unlike
 *                     fixed-size arrays, it grows dynamically at runtime.
 * 5. List Interface – Abstraction over different List implementations (ArrayList,
 *                     LinkedList, etc.), enabling flexible, maintainable code.
 * 6. Console Output – System.out.println() for displaying messages to the user.
 * 7. Dynamic Init   – Creating an empty collection that will be populated later
 *                     as bogies are added during subsequent use cases.
 */
public class UC1_InitializeTrain {

    public static void main(String[] args) {

        // ----- Step 1: Print Welcome Message -----
        System.out.println("==============================================");
        System.out.println("    === Train Consist Management App ===      ");
        System.out.println("==============================================");
        System.out.println();

        // ----- Step 2: Initialize the Train Consist -----
        // Using the List interface (abstraction) with ArrayList (implementation).
        // ArrayList is chosen because:
        //   - It allows dynamic resizing as bogies are added/removed.
        //   - It provides fast index-based access O(1) for displaying consist.
        //   - Unlike a plain array, we don't need to know the size upfront.
        List<String> consist = new ArrayList<>();

        // ----- Step 3: Display Initial Consist Summary -----
        System.out.println("--- Train Consist Summary ---");
        System.out.println("Total Bogies in Consist : " + consist.size());
        System.out.println("Consist Details         : " + consist);
        System.out.println();

        System.out.println(">> Train consist initialized successfully.");
        System.out.println(">> Ready for further operations...");
        System.out.println("==============================================");
    }
}
