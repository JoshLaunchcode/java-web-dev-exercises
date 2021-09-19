package exercises.technology;

import java.util.Objects;

public class Smartphone extends Computer{
    private String name;
    private String brand;
    private double screenSize;

    public Smartphone(int memoryAmount, String memoryType, String cpuName, int storageSpace, String gpuName, String name, String brand, double screenSize){
        super(memoryAmount, memoryType, cpuName, storageSpace, gpuName);
        this.name = name;
        this.brand = brand;
        this.screenSize = screenSize;
    }

    public String getName() {
        return name;
    }

    public String getBrand() {
        return brand;
    }

    public double getScreenSize() {
        return screenSize;
    }

    @Override
    public String toString() {
        return "Smartphone Name: " + getName() +
                "\nBrand: " + getBrand() +
                "\nScreen Size: " + getScreenSize() +
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
        Smartphone that = (Smartphone) o;
        return getName().equals(that.getName()) && getBrand().equals(that.getBrand());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getBrand());
    }
}
