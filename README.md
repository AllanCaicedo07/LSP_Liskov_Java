# Estudiantes
## Allan Caicedo
## Juan gaviria

## estructura del proyecto
lsp-solid-java-examples/
├── src/main/java/
│   ├── 01_violation/
│   │   ├── Rectangle.java
│   │   ├── Square.java          ← ❌ Violación
│   │   └── LSPViolationTest.java
│   ├── 02_solution_shapes/
│   │   ├── Shape.java           ← Abstracción
│   │   ├── Rectangle.java       ← ✅ Correcto
│   │   ├── Square.java          ← ✅ Correcto
│   │   └── ShapeTest.java
│   ├── 03_payments/
│   │   ├── PaymentProcessor.java  ← Interface
│   │   ├── CreditCardProcessor.java
│   │   ├── PayPalProcessor.java
│   │   └── PaymentTest.java
│   └── 04_birds/
│       ├── Bird.java
│       ├── Flyable.java         ← Interface
│       ├── Sparrow.java
│       ├── Penguin.java
│       └── BirdTest.java
├── pom.xml
└── README.md
