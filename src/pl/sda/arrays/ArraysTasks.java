package pl.sda.arrays;

public class ArraysTasks {
    public static void main(String[] args) {
        ArraysMethods arrays = new ArraysMethods();

        String[] strings = {"Toshiba", "Lenovo", "Dell", "HP"};
        arrays.printArray(strings);

        arrays.printArrayBasedOnVarargs("Toshiba", "Lenovo", "Dell", "HP", "Apple");
    }
}
