package HW_java.Homework

public class Main {
    public static void main(String[] args) {
        Laptop asus = new Laptop("Asus", 2, 512, OS.Windows, "черный");
        Laptop acer = new Laptop("Acer", 8, 1024, OS.Windows, "черный");
        Laptop mac = new Laptop("MacBook", 8, 1024, OS.iOS, "белый");
        Laptop HP = new Laptop("HP", 16, 1024, OS.Linux, "серебристый");

        Shop storage = new Shop();
        storage.addLaptop(asus);
        storage.addLaptop(acer);
        storage.addLaptop(mac);

        // System.out.println(storage.getLaptop());

        System.out.println(storage.getFilteredLaptops(storage.getstandart()));

    }
}
