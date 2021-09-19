package exercises.technology;

public class Computer extends AbstractEntity{
    private int memoryAmount;
    private String memoryType;
    private String cpuName;
    private int storageSpace;
    private String gpuName;

    public Computer(){
        super();
    }

    public Computer(int memoryAmount, String memoryType, String cpuName, int storageSpace, String gpuName){
        this.memoryAmount = memoryAmount;
        this.memoryType = memoryType;
        this.cpuName = cpuName;
        this.storageSpace = storageSpace;
        this.gpuName = gpuName;
    }

    public int getMemoryAmount() {
        return memoryAmount;
    }

    public void setMemoryAmount(int memoryAmount) {
        this.memoryAmount = memoryAmount;
    }

    public String getMemoryType() {
        return memoryType;
    }

    public void setMemoryType(String memoryType) {
        this.memoryType = memoryType;
    }

    public String getCpuName() {
        return cpuName;
    }

    public void setCpuName(String cpuName) {
        this.cpuName = cpuName;
    }

    public int getStorageSpace() {
        return storageSpace;
    }

    public void setStorageSpace(int storageSpace) {
        this.storageSpace = storageSpace;
    }

    public String getGpuName() {
        return gpuName;
    }

    public void setGpuName(String gpuName) {
        this.gpuName = gpuName;
    }
}
