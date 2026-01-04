package FOP_Viva_Gridverse.src.com.maplestory;

public class MagicShieldTest {
    public static void main(String[] args) {
        System.out.println("========== Magic Shield System Test ==========\n");

        // 1. Instantiating Shields
        System.out.println("--- 1. Instantiating Shields ---");
        MagicShield defaultShield = new MagicShield();
        System.out.println("Shield 1 (Default) created.");

        MagicShield fireShield = new MagicShield(2.5, 7.0, "Fire");
        System.out.println("Shield 2 (Fire) created.");

        // 2. Testing Setters & Validation
        System.out.println("\n--- 2. Testing Setters & Validation ---");
        defaultShield.setRadius(3.0);
        defaultShield.setThickness(10.0);
        defaultShield.setElementType("Ice");
        System.out.println("Shield 1 updated to Ice type, 3.0m radius.");

        try {
            System.out.print("Attempting to set negative radius... ");
            fireShield.setRadius(-5.0);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught Expected Exception: " + e.getMessage());
        }

        try {
            System.out.print("Attempting to set negative thickness... ");
            fireShield.setThickness(-10.0);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught Expected Exception: " + e.getMessage());
        }

        // 3. Printing Object Details
        System.out.println("\n--- 3. Printing Object Details ---");
        System.out.println(defaultShield.toString());
        System.out.println(fireShield.toString());

        // 4. Static Calculation Methods
        System.out.println("\n--- 4. Testing Static Calculation Methods ---");
        double radius = 2.0;
        double thickness = 5.0;
        String element = "Dark";
        
        double staticDefense = MagicShield.calculateDefensePower(radius, thickness, element);
        double staticMana = MagicShield.calculateManaCost(radius, thickness);
        
        System.out.printf("Static Calc [Dark, 2.0m, 5.0cm] -> Defense: %.2f | Mana: %.2f%n", 
                          staticDefense, staticMana);

        // 5. Static Counter & Edge Cases
        System.out.println("\n--- 5. Static Counter & Edge Cases ---");
        MagicShield zeroShield = new MagicShield(0.0, 0.0, "Light");
        System.out.println("Shield 3 (Zero values) created: " + zeroShield.toString());

        System.out.println("Total MagicShields created: " + MagicShield.getShieldCount());
    }
}