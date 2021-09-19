package exercises.technology;

import java.util.Objects;

public class Laptop extends Computer {
    private String name;
    private String brand;
    private String formFactor;

    public Laptop(int memoryAmount, String memoryType, String cpuName, int storageSpace, String gpuName, String name, String brand, String formFactor){
        super(memoryAmount, memoryType, cpuName, storageSpace, gpuName);
        this.name = name;
        this.brand = brand;
        this.formFactor = formFactor;
    }

    public String getName() {
        return name;
    }

    public String getBrand() {
        return brand;
    }

    public String getFormFactor() {
        return formFactor;
    }

    @Override
    public String toString() {
        return "Laptop Name: " + name +
                "\nBrand: " + brand +
                "\nForm Factor: " + formFactor +
                "\nMemory Amount: " + this.getMemoryAmount() + "gb" +
                "\nMemory Type: " + this.getMemoryType() +
                "\nCPU Name: " + this.getCpuName() +
                "\nStorage Space: " + this.getStorageSpace() + "gb" +
                "\nGPU Name: " + this.getGpuName();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Laptop laptop = (Laptop) o;
        return getName().equals(laptop.getName()) && getBrand().equals(laptop.getBrand());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getBrand());
    }
}
