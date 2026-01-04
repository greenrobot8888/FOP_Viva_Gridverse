package FOP_Viva_Gridverse.src.com.maplestory; 

public class MagicShield {
    private Double radius;
    private Double thickness;
    private String elementType;

    private static final double DEFAULT_RADIUS = 1.0;
    private static final double DEFAULT_THICKNESS = 5.0;
    private static int shieldCount = 0;

    public MagicShield() {
        this.radius = DEFAULT_RADIUS;
        this.thickness = DEFAULT_THICKNESS;
        this.elementType = "Neutral";
        shieldCount++;
    }

    public MagicShield(double radius, double thickness, String elementType) {
        this.radius = radius;
        this.thickness = thickness;
        this.elementType = elementType;
        shieldCount++;
    }

    public Double getRadius() { 
        return radius; 
    }

    public void setRadius(double radius) {
        if (radius < 0) {
            throw new IllegalArgumentException("Invalid radius");
        }
        this.radius = radius;
    }

    public Double getThickness() { 
        return thickness; 
    }

    public void setThickness(double thickness) {
        if (thickness < 0) {
            throw new IllegalArgumentException("Invalid thickness");
        }
        this.thickness = thickness;
    }

    public String getElementType() { 
        return elementType; 
    }

    public void setElementType(String type) {
        if (type == null || type.isEmpty()) {
            this.elementType = "Neutral";
        } else {
            this.elementType = type;
        }
    }

    public double calculateDefensePower() {
        return (radius * thickness) * getElementCoefficient(this.elementType);
    }

    public double calculateManaCost() {
        return radius * 10 + thickness * 2;
    }

    private double getElementCoefficient(String element) {
        switch (element) {
            case "Fire": return 1.1;
            case "Ice": return 1.2;
            case "Light": return 1.3;
            case "Dark": return 1.4;
            default: return 1.0;
        }
    }


    public static int getShieldCount() { 
        return shieldCount; 
    }

    public static boolean isValidSize(double size) {
        return size >= 0;
    }

    public static double calculateDefensePower(double radius, double thickness, String elementType) {
        double coefficient;
        switch (elementType) {
            case "Fire": coefficient = 1.1; break;
            case "Ice": coefficient = 1.2; break;
            case "Light": coefficient = 1.3; break;
            case "Dark": coefficient = 1.4; break;
            default: coefficient = 1.0; break;
        }
        return (radius * thickness) * coefficient;
    }

    public static double calculateManaCost(double radius, double thickness) {
        return radius * 10 + thickness * 2;
    }


    @Override
    public String toString() {
        return String.format(
            "\n[MagicShield Info]\nElement Type: %s\nRadius: %.1f m\nThickness: %.1f cm\nDefense Power: %.2f\nMana Cost: %.1f",
            elementType, radius, thickness, calculateDefensePower(), calculateManaCost()
        );
    }
}