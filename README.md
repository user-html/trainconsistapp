# Train Consist Management App

A console-based Java application that simulates how a railway system manages a train's consist — a collection of bogies attached to an engine.

## Features

- **Passenger Bogies**: Sleeper, AC Chair, First Class with seat capacity tracking
- **Goods Bogies**: Rectangular, Cylindrical with cargo type and safety constraints
- **Consist Tracking**: Composition, capacity, cargo types, and safety compliance

## Use Cases

| UC  | Description                              | Key Concepts                                  |
|-----|------------------------------------------|-----------------------------------------------|
| UC1 | Initialize Train & Display Consist       | Class, Main Method, Static, ArrayList, List   |

## How to Build & Run

```bash
# Compile
javac -d out src/TrainConsistApp.java

# Run
java -cp out TrainConsistApp
```

## Project Structure

```
TrainConsistManager/
├── src/
│   └── TrainConsistApp.java
├── out/                  (compiled classes)
├── README.md
└── .gitignore
```

## Learning Approach

Each use case introduces one or more Java concepts through a realistic railway scenario. The application is developed incrementally — every design decision reflects how real-world systems evolve from basic implementations to scalable architectures.
