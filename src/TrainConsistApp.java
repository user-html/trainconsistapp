/**
 * Train Consist Management App — Main Entry Point
 *
 * This application simulates how a railway system manages a train's consist
 * (a collection of bogies attached to an engine).
 *
 * Each use case is implemented in its own file and can be run independently:
 *
 *   UC1_InitializeTrain       — Initialize Train and Display Consist Summary
 *   UC2_AddPassengerBogies    — Add Passenger Bogies to Train (ArrayList Operations)
 *
 * To run a specific use case:
 *   javac -d out src/UC1_InitializeTrain.java
 *   java -cp out UC1_InitializeTrain
 *
 *   javac -d out src/UC2_AddPassengerBogies.java
 *   java -cp out UC2_AddPassengerBogies
 *
 * Or run this file to execute all use cases sequentially:
 *   javac -d out src/*.java
 *   java -cp out TrainConsistApp
 */
public class TrainConsistApp {

    public static void main(String[] args) {

        System.out.println("##############################################");
        System.out.println("#   Train Consist Management App — Runner    #");
        System.out.println("##############################################");
        System.out.println();

        // ----- Run UC1: Initialize Train -----
        System.out.println(">>> Running UC1: Initialize Train...");
        System.out.println();
        UC1_InitializeTrain.main(args);
        System.out.println();

        // ----- Run UC2: Add Passenger Bogies -----
        System.out.println(">>> Running UC2: Add Passenger Bogies...");
        System.out.println();
        UC2_AddPassengerBogies.main(args);
        System.out.println();

        System.out.println("##############################################");
        System.out.println("#        All Use Cases Executed Successfully  #");
        System.out.println("##############################################");
    }
}
