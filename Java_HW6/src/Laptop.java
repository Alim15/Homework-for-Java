package HW_java.Homework

public class Laptop {
    int ramSize;
    int memorySize;
    OS operationSystem;
    String color;
    String model;

    public Laptop(String model, int ramSize, int memorySize, OS operationSystem, String color){
        this.model = model;
        this.ramSize = ramSize;
        this.memorySize = memorySize;
        this.operationSystem = operationSystem;
        this.color = color;
    }
    @Override

    public String toString() {
        return "Ноутбук " + model +
                ": Объем ОЗУ - " + ramSize + " GB" +
                ", объем ЖД - " + memorySize + " GB"+
                ", ОС - " + operationSystem +
                ", цвет - " + color;
    }
}
