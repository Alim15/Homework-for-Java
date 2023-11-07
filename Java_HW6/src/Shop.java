package HW_java.Homework

import java.util.*;

import static java.lang.System.in;

public class Shop {
    private Set<Laptop> laptop = new HashSet<>();
    /**
     * @apiNote добавляет экземпляр класса ноутбук в магазин (множество ноутбуков)
     * @param laptop экземпляр класса нотбук
     */
    public void addLaptop(Laptop laptop) {
        laptop.add(laptop);
    }
    /**
     * @apiNote позволяет вывести все ноуты, находящиеся в магазине (множестве ноутбуков)
     * @return ноутбуки, добавленные в магазин, списком
     */
    public ArrayList<Laptop> getLaptops() {
        return new ArrayList<Laptop>();
    }
    /**
     *
     * @return словарь, содержащий критерии поиска, заданные пользователем с клавиатуры
     */
    public Map<String, String> getstandart() {
        Map<String, String> standart = new HashMap<String, String>();
        Scanner scanner = new Scanner(in);
        while (true) {
            System.out.println("Введите цифру, соответствующую необходимому критерию, где: \n1 - модель ноутбука" +
                    "\n2 - ОЗУ \n3 - объем ЖД \n4 - операционная система \n5 - цвет " +
                    "\nвведите 0, когда закончите добавлять критерии");
            String num = scanner.nextLine();
            if (Integer.parseInt(num) == 0) {
                scanner.close();
                return standart;
            }
            System.out.println("Введите параметр");
            String criterion = scanner.nextLine();
            standart.put(num, criterion);
        }
    }

    /**
     * @apiNote добавляет в список ноутбуки, соответствующие критериям поиска
     * @param словарь с критериями, полученный при помощи метода getStandart()
     * @return список ноутбуков, подходящих под заданные критерии
     */
    public ArrayList<Laptop> getFilteredLaptops(Map<String, String> standart) {
        ArrayList<Laptop> result = new ArrayList<>();
        Iterator<Laptop> iterator = laptop.iterator();
        String modelStandart= standart.get("1");
        String ram = standart.get("2");
        Integer ramStandart = null;
        if (ram != null) {
            ramStandart = Integer.parseInt(ram);
        }
        String memory = standart.get("3");
        Integer memoryStandart = null;
        if (memory != null) {
            memoryStandart= Integer.parseInt(memory);
        }
        OS osStandart = null;
        String os = standart.get("4");
        if (os!= null){
            osStandart = OS.valueOf(os);
        }
        String colorStandart = standart.get("5");


        while (iterator.hasNext()) {
            Laptop laptop1 = iterator.next();
            if (modelStandart != null && !laptop1.model.equals(modelStandart)) {
                continue;
            }
            if (ramStandart != null && laptop1.ramSize < ramStandart) {
                continue;
            }
            if (memoryStandart != null && laptop1.memorySize < memoryStandart) {
                continue;
            }
            if (colorStandart != null && !laptop1.color.equals(colorStandart)) {
                continue;
            }
            if (osStandart != null && !laptop1.operationSystem.equals(osStandart)) {
                continue;
            }

            result.add(laptop1);
        }
        return result;
    }
}
}
