package pl.sda.generics.exercises;

/**
 * Generyczna wersja klasy Box z ograniczonym typem który może być użyty.
 * <T extends Plants> oznacza że klasa PlantBox może przyjąć tylko obiekty implementujące interface Plants
 */
public class PlantBox<T extends Plants> {
    // T to skrót od "Type"
    private T value;

    public PlantBox(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public String getPlantName() {
        return value.getName();
    }
}
