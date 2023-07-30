package effectivejava.chapter4.item22.enums;

public enum PhysicalConstantsEnum {
    // Avogadro's number (1/mol)
    AVOGADROS_NUMBER(6.022_140_857e23),

    // Boltzmann constant (J/K)
    BOLTZMANN_CONSTANT(1.380_648_52e-23),

    // Mass of the electron (kg)
    ELECTRON_MASS(9.109_383_56e-31);

    private final double value;

    PhysicalConstantsEnum(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }
}
